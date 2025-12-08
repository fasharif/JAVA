import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting balance (e.g., 1000): ");
        double balance = sc.nextDouble();

        System.out.print("Enter annual interest rate in % (e.g., 5 for 5%): ");
        double ratePercent = sc.nextDouble();

        double rate = ratePercent / 100.0;

        double year1 = balance * (1 + rate);
        double year2 = year1 * (1 + rate);
        double year3 = year2 * (1 + rate);

        System.out.printf("Balance after Year 1: £%.2f%n", year1);
        System.out.printf("Balance after Year 2: £%.2f%n", year2);
        System.out.printf("Balance after Year 3: £%.2f%n", year3);

        sc.close();
    }
}