import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            System.out.println("Hello Mr " + name);
        } else if (gender == 'F' || gender == 'f') {
            System.out.println("Hello Ms " + name);
        } else {
            System.out.println("Hello " + name);
        }
    }
}