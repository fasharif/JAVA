import java.util.Random;
import java.util.Scanner;

public class QuizGame {

    // 1D array for questions
    private static final String[] QUESTIONS = {
            "1) What does CPU stand for?",
            "2) Which language runs on the JVM?",
            "3) What is the binary of decimal 5?",
            "4) Which keyword creates an object in Java?",
            "5) Which operator means AND in Java?"
    };

    // 2D array for options: each row belongs to the question with the same index
    private static final String[][] OPTIONS = {
            {"A) Central Process Unit", "B) Central Processing Unit", "C) Computer Personal Unit", "D) Core Processing Utility"},
            {"A) Java", "B) C", "C) Python", "D) Assembly"},
            {"A) 100", "B) 101", "C) 111", "D) 110"},
            {"A) make", "B) class", "C) new", "D) create"},
            {"A) &&", "B) ||", "C) !", "D) ^"}
    };

    // Correct answers (A-D) for each question index
    private static final char[] ANSWERS = {'B', 'A', 'B', 'C', 'A'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        int n = QUESTIONS.length;
        if (OPTIONS.length != n || ANSWERS.length != n) {
            System.out.println("Quiz data error: arrays must have the same length.");
            return;
        }

        // Build question order array: 0..n-1
        int[] order = new int[n];
        for (int i = 0; i < n; i++) order[i] = i;

        // Shuffle order (Fisher–Yates)
        for (int i = n - 1; i > 0; i--) {
            int j = rng.nextInt(i + 1);
            int tmp = order[i];
            order[i] = order[j];
            order[j] = tmp;
        }

        int score = 0;

        System.out.println("=== QUIZ GAME ===");
        System.out.println("Answer with A/B/C/D (or 1/2/3/4). Type -1 to quit.\n");

        for (int k = 0; k < n; k++) {
            int idx = order[k];

            System.out.println(QUESTIONS[idx]);
            for (String opt : OPTIONS[idx]) System.out.println(opt);

            char user = readChoice(sc);
            if (user == '!') { // quit signal
                System.out.println("\nYou ended the quiz early.");
                break;
            }

            if (user == ANSWERS[idx]) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Wrong! Correct answer: " + ANSWERS[idx] + "\n");
            }
        }

        System.out.println("Final Score: " + score + " / " + n);
        sc.close();
    }

    // Returns A-D, or '!' to quit
    private static char readChoice(Scanner sc) {
        while (true) {
            System.out.print("Your answer: ");
            String s = sc.nextLine().trim();
            if (s.isEmpty()) continue;
            if (s.equals("-1")) return '!';

            char c = Character.toUpperCase(s.charAt(0));
            if (c >= 'A' && c <= 'D') return c;
            if (c >= '1' && c <= '4') return (char) ('A' + (c - '1'));

            System.out.println("Please enter A/B/C/D or 1/2/3/4 (or -1 to quit).");
        }
    }
}