import java.util.Random;
import  java.util.Scanner;

public class rolldice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numberofDice;
        int total = 0;

        System.out.print("Enter the number of dice to roll: ");
        numberofDice = scanner.nextInt();
        if(numberofDice > 0) {
            for(int i = 1; i <= numberofDice; i++) {
                int roll = rand.nextInt(1, 7);
                printDice(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Your Total rolled: " + total);
        }
        else
            {
            System.out.println("Invalid input Dice must be Start from 1 to 6 Only.");
            }
    }
    static void printDice(int roll) {
        String dice1 = """
                ----------
                |        |
                |    ●   |
                |        |
                ----------
                """;
        String dice2 = """
                ----------
                |        |
                |  ● ●   |
                |        |
                ----------
                """;
        String dice3 = """
                ----------
                | ●      |
                |   ●    |
                |     ●  |
                ----------
                """;
        String dice4 = """
                ----------
                | ●    ● |
                |        |
                | ●    ● |
                ----------
                """;
        String dice5 = """
                ----------
                | ●    ● |
                |   ●    |
                | ●    ● |
                ----------
                """;
        String dice6 = """
                ----------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                ----------
                """;
        switch (roll) {
            case 1-> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5-> System.out.println(dice5);
            case 6-> System.out.println(dice6);
            default ->  System.out.print("Invalid Roll Number");
        }
    }
}