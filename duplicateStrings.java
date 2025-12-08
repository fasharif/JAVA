import java.util.Arrays;

public class duplicateStrings {
    public static void main(String[] args) {
        String[] a = {"Hi", "Hello", "Hi", "Hello", "Welcome", "to", "Java", "Java", "Programming"};

        System.out.println("Array: " + Arrays.toString(a));
        System.out.print("Duplicates: ");

        for (int i = 0; i < a.length; i++) {

            boolean alreadyHandled = false;
            for (int k = 0; k < i; k++) {
                if (a[k].equals(a[i])) { alreadyHandled = true; break; }
            }
            if (alreadyHandled) continue;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    System.out.println(a[i] + " is a duplicate value in the array");
                    break;
                }
            }
        }
    }
}