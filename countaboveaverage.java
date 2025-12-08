import java.util.Scanner;

public class countaboveaverage  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[100];

        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
            sum += a[i];
        }

        double avg = sum / a.length;

        int above = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > avg) above++;
        }

        System.out.println("Average = " + avg);
        System.out.println("Numbers above average = " + above);

        sc.close();
    }
}