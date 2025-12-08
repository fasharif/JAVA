import java.util.Scanner;

public class QuarterFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        if (month >= 1 && month <= 3)
            System.out.println("1st quarter");
        else if (month >= 4 && month <= 6)
            System.out.println("2nd quarter");
        else if (month >= 7 && month <= 9)
            System.out.println("3rd quarter");
        else if (month >= 10 && month <= 12)
            System.out.println("4th quarter");
        else
            System.out.println("Invalid month");
    }
}