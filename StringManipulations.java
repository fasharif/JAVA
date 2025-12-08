import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string p: ");
        String p = sc.nextLine();

        System.out.print("Enter string q: ");
        String q = sc.nextLine();

        System.out.print("Enter string r: ");
        String r = sc.nextLine();

        String concatPQR = p + q + r;
        System.out.println("Concatenation (p+q+r) in CAPITAL: " + concatPQR.toUpperCase());

        String concatRP = r + p;
        System.out.println("Concatenation (r+p) in lowercase: " + concatRP.toLowerCase());

        int totalChars = concatPQR.length();
        System.out.println("Total number of characters in (p+q+r): " + totalChars);

        sc.close();
    }
}