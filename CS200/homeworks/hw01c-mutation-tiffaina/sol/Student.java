package sol;

import java.util.LinkedList;

/**
 * Class representing students, which is a subclass of Person
 *
 */
public class Student extends Person  {
    /**
     * field representing the name of a student
     String name; // taken care of by Person
     */
    /**
     * field representing the first course the student is taking
     */
    private Course course1;
    /**
     * field representing the second course the student is taking
     */
    private Course course2;
    /**
     * Constructor for a student.
     * @param name - the name of the student
     * @param course1 - the first course the student is taking
     * @param course2 - the second course the student is taking
     */
    public Student(String name, Course course1, Course course2) {
        super(name);
        if (course1 == course2) {
            throw new IllegalArgumentException("Invalid courses");
        }
        this.course1 = course1;
        this.course2 = course2;
    }


        /**
         * Method to determine if the student is taking a course
         * @param course - a course
         * @return - true if one of the student's courses is course, else false
         */
    public boolean isTaking(Course course) {
        return this.course1 == course || this.course2 == course;
    }
    /**
     * Method that returns the total credits of the two courses the student is
     taking.
     * @return - a Double that represents the total credits.
     */
    public double totalCredits(){
        return this.course1.getCredits() + this.course2.getCredits();
    }
// priavte methods

    public LinkedList<Course> getCourses() {
        LinkedList<Course> courses = new LinkedList<Course>();
        {
            courses.add(this.course1);
            courses.add(this.course2);
        }
        return courses;
    }

    @Override
    public String toString() {
        return name+ "" + course1 + "" + course2;}

}