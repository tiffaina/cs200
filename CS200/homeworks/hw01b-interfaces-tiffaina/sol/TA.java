package sol;

/**
 * Class representing a TA, which is a subclass of Student (and Person by extension)
 */

public class TA extends Student {
    /**
 * field representing the name of a TA
 String name; // taken care of by Person
 **/
    /**
     * field representing the course the TA is assisting for
     */
    Course assisting;
    /**
     * Constructor for a TA.
     * @param name - the name of the TA
     * @param course1 - the first course the student is taking
     * @param course2 - the second course the student is taking
     * @param assisting - the course the TA is assisting for
     */
    public TA (String name, Course course1, Course course2, Course assisting) {
        super(name, course1, course2);
        this.assisting = assisting;
        if (((course1) == assisting) || ((course2) == assisting)) {
            throw new IllegalArgumentException("Cannot take and assist the same course");
        }
    }
    /**
     * Method to determine the grade of the report for the assisting course
     * @param gradeReport - a grade report
     * @return - the grade in the report as a String
     * @throws RuntimeException if TA tries to view a grade for a course they are not assisting
     */
    public String viewGrade(GradeReport gradeReport) {
        if (gradeReport.forCourse != this.assisting) {
            throw new RuntimeException("Access Denied"); }
            else { return gradeReport.grade.toString(); }
        }

    }

