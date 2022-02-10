package sol;

public class Person {
    String name;

    public Person(String nm) {
        this.name = nm;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
