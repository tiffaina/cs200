package sol;

import java.util.LinkedList;

public class Student extends Person {
    LinkedList<Course> taking;
    LinkedList<Course> completed;

    public Student(String name) {
        super(name);
        this.taking = new LinkedList<Course>();
        this.completed = new LinkedList<Course>();
    }

    /**
     * determines whether student is taking a course from given faculty
     * @param f - a Faculty object
     * @return - true if f is teaching a course that student is taking
     */
    public boolean hasCourseFrom(Faculty f) {
        for (Course c : this.taking) {
            if (c.taughtBy.equals(f)) { 
                return true;
            }
        }
        return false;
    }
    //Write a method in the Student class named tookCoursesFrom that returns a list of the names of
    // all Faculty that taught a course in the student’s completed list.
    public LinkedList<String> tookCoursesFrom(){
        LinkedList<String> listToAdd =  new LinkedList<String>();
        for (Course c : this.completed) {
                listToAdd.add(c.taughtBy.name);
        }
        return listToAdd;
    }

public void endSemester() {
    for (Course c : this.taking) {
        this.completed.add(c);
    }
    this.taking = new LinkedList<Course>();
}
}
