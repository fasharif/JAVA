import java.util.Scanner;

public class SumTwo {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int total = sum(x, y);
        System.out.println("Total = " + total);

        sc.close();
    }
}