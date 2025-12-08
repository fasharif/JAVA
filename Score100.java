public class Score100 {
    public static void main(String[] args) {
        int score = 100;
        switch (score / 10) {
            case 10:
            case 9: System.out.println("Grade A"); break;
            case 8: System.out.println("Grade B"); break;
            case 7: System.out.println("Grade C"); break;
            case 6: System.out.println("Grade D"); break;
            default: System.out.println("Grade F");
        }
    }
}