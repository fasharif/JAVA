public class GradeSwitch {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A': System.out.print("Excellent ");
            break;
            case 'B': System.out.print("Good ");
            break;
            case 'C': System.out.print("Average ");
            break;
            default: System.out.print("Needs Improvement");
        }
    }
}