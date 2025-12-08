import java.util.Scanner;

public class DivisibleCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Inter any number to see if divisible by 5 or not :  ");
        int n = s.nextInt();
        if (n % 5 == 0)
            System.out.print("Divisible by 5");
        else
            System.out.print("Not divisible by 5");
    }
}