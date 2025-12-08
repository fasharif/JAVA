import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt(), i = 2;
        while (i <= n / 2 && n % i != 0) i++;
        System.out.println(n > 1 && i > n / 2 ? "Prime" : "Not Prime");
        s.close();
    }
}

