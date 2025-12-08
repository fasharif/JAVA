import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number A: ");
        double A = sc.nextDouble();

        System.out.print("Enter number B: ");
        double B = sc.nextDouble();

        System.out.print("Enter number C: ");
        double C = sc.nextDouble();

        double average = (A + B + C) / 3.0;
        System.out.println("The average of the 3 numbers is: " + average);

        sc.close();
    }
}
