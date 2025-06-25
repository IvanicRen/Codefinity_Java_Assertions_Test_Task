package codefinity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandlingExerciseTest {

    //ToDo: Pay attention to the test names
    // and implement tests that correspond to those names.
    // Each test should perform the function indicated by the test name."

    @Test
    public void checkAge_ShouldThrowIllegalArgumentException_WhenAgeIsLessThan18() {
        ExceptionHandlingExercise test = new ExceptionHandlingExercise();
        int age = 17;
        assertThrows(IllegalArgumentException.class, () -> test.checkAge(age));
    }

    @Test
    public void checkAge_ShouldNotThrowException_WhenAgeIs18OrMore() {
        ExceptionHandlingExercise test = new ExceptionHandlingExercise();
        int age = 18;
        assertDoesNotThrow(() -> test.checkAge(age));
    }

    @Test
    public void printLength_ShouldThrowNullPointerException_WhenStringIsNull() {
        ExceptionHandlingExercise test = new ExceptionHandlingExercise();
        String string = null;
        assertThrows(NullPointerException.class, () -> test.printLength(string));
    }

    @Test
    public void printLength_ShouldNotThrowException_WhenStringIsNotNull() {
        ExceptionHandlingExercise test = new ExceptionHandlingExercise();
        String string = "test";
        assertDoesNotThrow(() -> test.printLength(string));
    }
}
