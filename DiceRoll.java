import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Random rand = new Random();

        int die1 = rand.nextInt(6) + 1; // Generates a number between 1 and 6
        int die2 = rand.nextInt(6) + 1;

        int total = die1 + die2;

        System.out.println("You rolled:");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total: " + total);
    }
}