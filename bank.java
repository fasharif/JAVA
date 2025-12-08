import java.util.Scanner;

public class bank {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("**************************");
            System.out.println("Welcome to Bank Calculator");
            System.out.println("**************************");
            System.out.println("Please enter your choice");
            System.out.println("1. Show Balance");
            System.out.println("2. Add Money");
            System.out.println("3. Draw Money");
            System.out.println("4. Exit");
            System.out.println("**************************");
            System.out.println("Please enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + addMoney();
                case 3 -> balance -= drawMoney(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");

            }
        }
    }

    static void showBalance(double balance) {
        System.out.printf("$%f\n", balance);
    }

    static double addMoney() {
        double amount;
        System.out.print("Enter amount to add to your balance: ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid amount");
            return 0;
        } else {
            return amount;
        }
    }

    static double drawMoney(double balance) {
        while (true) {
            System.out.print("Enter amount to draw: ");
            if (scanner.hasNextDouble()) {
                double amount = scanner.nextDouble();
                if (amount <= 0) {
                    System.out.println("Amount must be greater than 0.");
                } else if (amount > balance) {
                    System.out.println("Insufficient balance.");
                    System.out.printf("Your balance is: $%.2f%n", balance);
                    return amount;
                } else {
                    return amount;
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}