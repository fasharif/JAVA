import java.util.Arrays;
import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[0];
        int[] counts = new int[0];

        int maxVotes = 0;
        System.out.print("Enter the election name: ");

        while (true) {
            String line = sc.nextLine().trim(); // reads one vote per line :contentReference[oaicite:0]{index=0}
            System.out.print("Enter the election name: ");
            if (line.isEmpty() || line.equals("-1")) break;

            int idx = -1;
            for (int i = 0; i < names.length; i++) {
                if (names[i].equalsIgnoreCase(line)) { // case-insensitive compare :contentReference[oaicite:1]{index=1}
                    idx = i;
                    break;
                }
            }

            if (idx >= 0) {
                int v = ++counts[idx];
                if (v > maxVotes) maxVotes = v;
            } else {
                int n = names.length;
                names = Arrays.copyOf(names, n + 1);   // grow arrays by 1 :contentReference[oaicite:2]{index=2}
                counts = Arrays.copyOf(counts, n + 1); // grow arrays by 1 :contentReference[oaicite:3]{index=3}
                names[n] = line;
                counts[n] = 1;
                if (maxVotes < 1) maxVotes = 1;
            }
        }

        if (names.length == 0) {
            System.out.println("No votes were entered.");
            return;
        }

        System.out.println("\nTALLY");
        StringBuilder winners = new StringBuilder();
        int winnerCount = 0;

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + counts[i]);
            if (counts[i] == maxVotes) {
                if (winnerCount++ > 0) winners.append(", ");
                winners.append(names[i]);
            }
        }

        if (winnerCount == 1) {
            System.out.println("\nWINNER: " + winners + " (" + maxVotes + " vote(s))");
        } else {
            System.out.println("\nTIE: " + winners + " (" + maxVotes + " vote(s) each)");
        }
    }
}
