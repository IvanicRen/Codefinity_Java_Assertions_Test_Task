package codefinity;

public class Main {
    private static final ExceptionHandlingExercise exceptionHandlingExercise
            = new ExceptionHandlingExercise();
    public static void main(String[] args) {
        try {
            exceptionHandlingExercise.checkAge(17);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
        try {
            exceptionHandlingExercise.printLength(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}