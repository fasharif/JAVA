import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("If You Want to Know You Chinese Astrological(Zodiac) Sings ");
        System.out.print("Enter your birth month in number (1-12): ");
        int number = input.nextInt();

        String animal;
        switch (number) {
            case 1:  animal = "Rat"; break;
            case 2:  animal = "Ox"; break;
            case 3:  animal = "Tiger"; break;
            case 4:  animal = "Rabbit"; break;
            case 5:  animal = "Dragon"; break;
            case 6:  animal = "Snake"; break;
            case 7:  animal = "Horse"; break;
            case 8:  animal = "Goat"; break;
            case 9:  animal = "Monkey"; break;
            case 10: animal = "Rooster"; break;
            case 11: animal = "Dog"; break;
            case 12: animal = "Pig"; break;
            default: animal = "Invalid number. Please enter 1–12.";
        }

        System.out.println("Zodiac Animal: " + animal);
    }
}
