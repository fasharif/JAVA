public class ExpressionTest {
    public static void main(String[] args) {
        boolean result = 10 != 15 && !(10 < 20) || 15 > 30;
        System.out.println("Result: " + result); // Output: false
    }
}