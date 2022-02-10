package sol;

/**
 * Class representing a GradeReport
 */
public class GradeReport {
    /**
     * field representing the student the report is for
     */
    Student forStudent;
    /**
     * field representing the course the report is for
     */
    Course forCourse;
    /**
     * field representing the type and grade (Letter/SNC)
     */
    IGrade grade;

    /**
     * A constructor for a course
     *
     * @param student representing the student the report is for
     * @param course representing the course the report is for
     * @param grade  representing the type and grade (Letter/SNC)
     *
     */
    public GradeReport (Student student, Course course, IGrade grade) {
        this.forStudent = student;
        this.forCourse = course;
        this.grade = grade;
    }



}

