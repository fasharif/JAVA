import java.util.*;

public class DiceCategorizer {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(6) + 1;

        System.out.println("Generated number: " + number);
        switch (number) {
            case 1:
            case 2:
                System.out.println("Category: Small");
                break;
            case 3:
            case 4:
                System.out.println("Category: Medium");
                break;
            case 5:
            case 6:
                System.out.println("Category: Big");
                break;
            default:
                System.out.println("Unexpected value");
        }
        if (number % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }
    }
}