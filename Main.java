/*static int plusMethod(int x, int y) {
    return x + y;
}
static double plusMethod(double x, double y) {
    return x + y;
}
public static void main(String[] args) {
    int myNum1 = plusMethod(8, 5);
    double myNum2 = plusMethod(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
}*/

public void modifyPrimitive(int number) {
    number = number + 10;
    System.out.println("Inside method: " + number); // prints 20
}
public void main(String[] args) {
    int value = 10;
    modifyPrimitive(value);
    System.out.println("After method call: " + value); // prints 10
}