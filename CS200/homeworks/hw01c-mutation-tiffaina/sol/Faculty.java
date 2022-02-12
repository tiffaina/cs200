package sol;
import java.util.LinkedList;
/**
 * Class representing a Faculty Member, which is a subclass of Person
 */
public class Faculty extends Person implements ITeacher{
    /**
     * field representing the name of a faculty
     String name;
     */
    /**
     * field representing the department of a faculty
     */
    private String department;
    /**
     * Field representing the courses the faculty teaches
     */
    private LinkedList<Course> teaching;
    /**
     * Constructor for a faculty member
     *
     * @param name       represents the name of the faculty member
     * @param department represents the department the faculty member works in
     */
    public Faculty(String name, String department) {
        super(name);
        this.department = department;
        this.teaching = new LinkedList<>();
    }
    /**
     * Method to determine if the faculty is teaching a course
     * @param course - a course
     * @return - true if the faculty is teaching the course, else false
     */
    public boolean isTeaching(Course course) {
        return this.teaching.contains(course);
    }
    /**
     * Method to determine if the faculty can grade a student
     * @param student - student who we want grade
     * @return - true if the faculty is teaching the course the student is taking
     */
    public boolean canGrade(Student student){
        return this.isTeaching(student.getCourses().get(1)) ||
                this.isTeaching(student.getCourses().get(2));
    }

    /**
     * Method to determine the grade of the report for the teaching course
     * @param gradeReport - a grade report
     * @return - the grade in the report as a String
     * @throws RuntimeException if faculty tries to view a grade for a course they are not teaching
     */
    public String viewGrade(GradeReport gradeReport) {
        if (this.teaching.contains(gradeReport.findCourse())) {
            return gradeReport.findGrade().toString();}
        else {throw new RuntimeException("Permission Denied");}
    }
    /**
     * Method to update the faculty's course list to include a course
     * @param course - the course the faculty is to be teaching
     */
    public void addClass(Course course) {
        this.teaching.add(course);
    }

}
