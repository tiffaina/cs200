package sol;

/**
 * Class representing a Faculty Member, which is a subclass of Person
 */
public class Faculty extends Person{
    /**
     * field representing the name of a faculty
    String name;
     */
    /**
     * field representing the department of a faculty
     */
    String department;
    /**
     * Field representing the course the faculty teaches
     */
    Course teaching;
    /**
     * Constructor for a faculty member
     *
     * @param name       represents the name of the faculty member
     * @param department represents the department the faculty member works in
     */
    public Faculty(String name, String department, Course teaching) {
        super(name);
        this.department = department;
        this.teaching = teaching;
    }
    /**
     * Method to determine if the faculty is teaching a course
     * @param course - a course
     * @return - true if the faculty is teaching the course, else false
     */
    public boolean isTeaching(Course course) {
        return this.teaching == course;
    }
    public boolean canGrade(Student student){
        return this.isTeaching(student.course1) ||
                this.isTeaching(student.course2);
    }

    /**
     * Method to determine the grade of the report for the teaching course
     * @param gradeReport - a grade report
     * @return - the grade in the report as a String
     * @throws RuntimeException if faculty tries to view a grade for a course they are not teaching
     */
    public String viewGrade(GradeReport gradeReport) {
        if (gradeReport.forCourse != this.teaching) {
            throw new RuntimeException("Access Denied"); }
        else { return gradeReport.grade.toString(); }
    }
}
