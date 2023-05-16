package Slot14;

public class InvalidGradeException {
    private float invalidGrade;

    public InvalidGradeException() {
    }

    public InvalidGradeException(String message, float invalidGrade) {
        super(message);
        this.invalidGrade = invalidGrade;
    }

    public float getInvalidGrade() {
        return invalidGrade;
    }
}
