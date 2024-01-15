package codefinity;

public class ExceptionHandlingExercise {

    // Method that causes an IllegalArgumentException
    public void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    // Method that causes a NullPointerException
    public void printLength(String str) {
        if (str == null) {
            throw new NullPointerException("String value is null.");
        } else {
            System.out.println("String length is: " + str.length());
        }
    }
}
