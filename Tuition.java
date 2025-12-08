public class Tuition {

    static int yearsToTriple(double initialFee, double annualIncreaseRate) {
        double fee = initialFee;
        int years = 0;

        while (fee < initialFee * 3) {
            fee *= (1 + annualIncreaseRate);
            years++;
        }
        return years;
    }

    public static void main(String[] args) {
        double fee = 9000;
        double rate = 0.06;

        int years = yearsToTriple(fee, rate);
        System.out.println("It will take " + years + " years for fees to triple.");
    }
}
