import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age (in years): ");
        double age = sc.nextDouble();

        if (age < 0) {
            System.out.println("No Such age.");
        } else if (age <= 1) {
            System.out.println("You are a baby.");
        } else if (age <= 12) {
            System.out.println("You are a child.");
        } else if (age <= 17) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }

        sc.close();
    }
}