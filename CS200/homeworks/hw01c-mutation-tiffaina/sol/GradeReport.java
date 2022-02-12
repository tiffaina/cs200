package sol;

/**
 * Class representing a GradeReport
 */
public class GradeReport {
    /**
     * field representing the student the report is for
     */
    private Student forStudent;
    /**
     * field representing the course the report is for
     */
    private Course forCourse;
    /**
     * field representing the type and grade (Letter/SNC)
     */
    private IGrade grade;

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
@Override
    public String toString() {
        return forStudent+ "" + forCourse + "" + grade;
    }
// methods after private

    public String findStudent() {
        return this.forStudent.name;
    }

    public Course findCourse() {
        return this.forCourse;
    }

    public IGrade findGrade() {
        return this.grade;
    }

    public void changeGrade(IGrade newgrade) {
         this.grade = newgrade;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        GradeReport that = (GradeReport) o;
        return this.forStudent.name == that.forStudent.name;
    }

}

