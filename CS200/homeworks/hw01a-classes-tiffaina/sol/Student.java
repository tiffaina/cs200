package sol;

public class Student {
    String name;
    Course course1;
    Course course2;

    public Student(String name, Course class1, Course class2) {

        if (class1 == class2) {
            throw new IllegalArgumentException("Invalid courses");
        } else {
            this.name = name;
            this.course1 = class1;
            this.course2 = class2;
        }
    }
    /*
    determines whether the student  is taking that course
     @result true if either of the students courses = the input course
     */
    public boolean isTaking(Course classe) {
        return (this.course1 == classe) || (this.course2 == classe);
    }
    /*
    @result is sum of the credits for the student’s two courses.
     */
    public double totalCredits() {
        return this.course1.credits + this.course2.credits;
    }



}
