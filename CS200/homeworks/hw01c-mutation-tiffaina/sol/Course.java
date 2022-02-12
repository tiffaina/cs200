package sol;
import java.util.LinkedList;

/**
 *
 * Class representing a course
 *
 */
public class Course {
    /**
     * field representing the department the course is in
     */
    private String department;
    /**
     * field representing the number of the course
     */
    private int courseNumber;
    /**
     * field representing the number of credits the course is worth
     */
    private double credits;
    /**
     * field representing the grade reports for the course
     */
    private LinkedList<GradeReport> gradeBook;

    /**
     * A constructor for a course
     *
     * @param department   representing the department the course is in
     * @param courseNumber representing the number of the course
     * @param credits      representing the number of credits the course is worth
     */
    public Course(String department, int courseNumber, double credits) {
        this.department = department;
        this.courseNumber = courseNumber;
        if (credits == 0.5 || credits == 1.0 || credits == 1.5) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("Invalid credits");
        }
        this.gradeBook = new LinkedList<>(); // initialized to an empty list
    }

    /**
     * An alternate constructor for the course where the credits is set to 1 by default
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

    /**
     * Method to update the Course’s gradebook to include a GradeReport for the corresponding student
     * @param student - the student whose grade report is to be added
     * @param grade   -  a valid gradeLetterGrade or SNCGrade
     */
    public void storeGrade(Student student, IGrade grade) {
        this.gradeBook.add(new GradeReport(student, this, grade));
    }

    /**
     * Method to return the gradeReport of the named student in the course
     * @param student - the student whose grade report is to be found
     * @return gradeReport -the student's grade report
     * @return null - if the student is not in the course
     */
    private GradeReport findGradeReport(String student) {
        for (GradeReport gradereport : this.gradeBook) {
            if (gradereport.findStudent().equals(student)) {
                return gradereport; }
            }
        return null;
    }

    /**
     * Method for new grade being stored in the gradebook for the given student
     * @param student - the student whose grade report is to be stored
     * @param grade   -  a valid gradeLetterGrade or SNCGrade
     * @throws RuntimeException - If the student does not have a grade
     **/
    public void updateGrade(String student, IGrade grade) {
        GradeReport g = this.findGradeReport(student);
        if (g.equals(null)) {
            throw new RuntimeException("no grade for student");
        }
        g.changeGrade(grade);
    }

    /**
     * Method to find  String representation of the grade for given student in a course
     * @param student - the given student
     * @param teacher   -  a valid gradeLetterGrade or SNCGrade
     * @throws RuntimeException - If the student does not have a grade
     **/

    public String gradeLookup(ITeacher teacher, String student) {
        GradeReport report = this.findGradeReport(student);
        if ((this.gradeBook.contains(report)) && (teacher.isTeaching(this))) {
            return teacher.viewGrade(report); }
        { throw new RuntimeException("student" + " " + student + " " + "not found");}
        }

        /**
     * Method to find the reports of students with the grade C
     * @return  a list of GradeReport from the course gradebook in which the grade is the letter C.
     **/

        public LinkedList<GradeReport> reportsWithC() {
            LinkedList<GradeReport> reportList = new LinkedList<GradeReport>();
            IGrade C = new LetterGrade(Letter.C);
            for (GradeReport g : this.gradeBook) {
                if (g.findGrade().equals(C))
                    reportList.add(g);
                }
                return reportList;
            }
    // methods after changing to private
    /**
     * Method to grab credits from course
     * @returns credits
     **/

    public double getCredits() {
        return this.credits;
    }
}

