package sol;
import java.util.*;

public class Faculty {
    String name;
    String department;
    Course teaching;

    public Faculty(String name, String dep, Course course) {
        this.name = name;
        this.department = dep;
        this.teaching = course;
    }

    /*
    determines whether the faculty member is teaching that course
     @result true if faculty teaching course = the input course
     */
    public boolean isTeaching(Course classe) {
        return this.teaching == classe;
    }
    /*
    determines whether the faculty member is allowed to give a grade to that student.
    @param Student
    @result returns a boolean indicating
     */
public boolean canGrade(Student student) {
    return (this.teaching == student.course1) || (this.teaching == student.course2);
}

}

