package sol;


/**
 * Class representing a LetterGrade, which implements the IGrade interface
 */

public class LetterGrade implements IGrade  {
    /**
     * enum field representing the letter grade
     */
    Letter grade;
    /**
     * Constructor for a LetterGrade
     *
     * @param grade       represents the letter grade earned
     */
    public LetterGrade (Letter grade) {
        this.grade = grade;

    }

    /**
     * Method to determine if the student is passing
     * @return - true if the grade reflects the student having passed
     */
    public boolean isPassing() {
        return this.grade != Letter.NC;
    }

    @Override
    public String toString() {
        return this.grade.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        LetterGrade that = (LetterGrade) o;
        return this.grade == that.grade;
    }
}
