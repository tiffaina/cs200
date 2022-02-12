package sol;
// interface for teaching roles: TA or faculty
public interface ITeacher {

     public String viewGrade(GradeReport gradereport);
     public boolean isTeaching(Course course);
}
