import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        double small = a;

        if(b < small) {
            small = b;
        }
        if(c < small) {
            small = c;
        }

        System.out.println("Smallest number is: " + small);
        sc.close();
    }
}