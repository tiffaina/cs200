package sol;


/**
 * Abstract class representing a Person, which is a superclass of Faculty, TA, and Student
**/

public abstract class Person {
    /**
     * field representing the name of a Person
     */
    String name;
    /**
     * Constructor for a Person
     *
     * @param name       represents the name of the person
     */
    public Person( String name) {
        this.name = name;
    }
}
