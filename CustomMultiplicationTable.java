import java.util.Scanner;

public class CustomMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Which number's multiplication table would you like to see? ");
        int number = input.nextInt();

        System.out.print("What is the length of the table? ");
        int length = input.nextInt();

        System.out.println("Multiplication table:");
        for (int i = 1; i <= length; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}