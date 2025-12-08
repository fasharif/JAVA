import java.util.Arrays;

public class duplicateints {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,5,6,7,7,9,10};
        System.out.println("Array: " + Arrays.toString(a));
        System.out.print("Duplicates: ");

        for (int i = 0; i < a.length; i++) {

            // skip if we already handled this value before
            boolean alreadyHandled = false;
            for (int k = 0; k < i; k++) {
                if (a[k] == a[i]) { alreadyHandled = true; break; }
            }
            if (alreadyHandled) continue;

            // check if it appears again later
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i] + " is a duplicate value in the array");
                    break;
                }
            }
        }
    }
}
