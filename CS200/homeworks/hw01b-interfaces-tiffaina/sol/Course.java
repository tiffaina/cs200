package sol;

/**
 *
 * Class representing a course
 *
 */
public class Course {
    /**
     * field representing the department the course is in
     */
    String department;
    /**
     * field representing the number of the course
     */
    int courseNumber;
    /**
     * field representing the number of credits the course is worth
     */
    double credits;
    /**
     * A constructor for a course
     *
     * @param department   representing the department the course is in
     * @param courseNumber representing the number of the course
     * @param credits      representing the number of credits the course is worth
     *
     */
    public Course(String department, int courseNumber, double credits) {
        this.department = department;
        this.courseNumber = courseNumber;
        if (credits == 0.5 || credits == 1.0 || credits == 1.5) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("Invalid credits");
        }
    }
    /**
     * An alternate constructor for the course where the credits is set to 1 by
     * default
     *
     * @param department   representing the department the course is in
     * @param courseNumber representing the number of the course
     */
    public Course(String department, int courseNumber) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = 1.0;
    }
    @Override
    public String toString() {
        return this.department + this.courseNumber;
    }
}