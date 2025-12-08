import java.util.Arrays;

public class averageof10numbers {
    public static void main(String[] args) {
        double[] a = {1,2,3,4,5,6,7,8,9,10};

        double sum = 0;
        for (int i = 0; i < a.length; i++) sum += a[i];

        double avg = sum / a.length;
        System.out.println("Average of " + Arrays.toString(a) + " IS : " + avg);
    }
}
