package sol;

public class Course {
    String department;
    int courseNumber;
    double credits;

    public Course (String dep, int num, double cred) {
        if ((cred == 1.0) || (cred == 1.5) || (cred == 0.5)) {
            this.department = dep;
            this.courseNumber = num;
            this.credits = cred;

        } else {
            throw new IllegalArgumentException("Invalid credits");
        }
    }
    // constructor that takes only the department and course number as inputs, setting the credits to 1 (by default)
    public Course (String dep, int num) {
        this.department = dep;
        this.courseNumber = num;
        this.credits = 1.0;
    }
    /*
    Converts object to string representation w coursenum and dep. ex) "CSCI0200"
    @param ( a Course object)
    returns the course num and department in concatenated string
     */
    @Override
    public String toString() {
        return this.courseNumber + this.department;
    }
}
