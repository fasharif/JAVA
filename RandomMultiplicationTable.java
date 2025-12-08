public class RandomMultiplicationTable {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 100) + 1;
        System.out.println("Multiplication table for " + number + ":");

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}