package sol;


/*
S/NC grades are captured with two booleans: one for , and another for whether the student h
as passed with distinction.
The distinction boolean should be true only if the boolean representing whether the student passed is also true.
 */

/**
 * Class representing a SNCGrade, which implements the IGrade interface
 */
public class SNCGrade implements IGrade {
    /**
     * field representing whether the student passed
     */
    boolean pass;
    /**
     * field representing whether the student passed with distinction
     */
    boolean passDistinction;

    /**
     * Constructor for a SNCGrade
     *
     * @param grade       represents the SNC enum grade
     */
    public SNCGrade(SNC grade) {

        /**
         * Switch Statement for SNC enum
         * @param grade  to set the fields pass and passDistinction.
         **/

         switch (grade) {
            case SDIST:
                this.pass = true;
                this.passDistinction = true;
                break;
            case S:
                this.pass = true;
                this.passDistinction = false;
                break;
            case NC:
                this.pass = false;
                this.passDistinction = false;
                break;
            default:
                break;
        }

    }
    /**
     * Method to determine if the SNC grade is passing
     * @return - true if the grade is passing
     */

    public boolean isPassing() {
        return this.pass;
    }
    @Override
    public String toString() {
        if (this.passDistinction) {
            return ("S*"); }
        if ((this.passDistinction) && (this.pass == true)) {
            return ("S"); }
            else {
                return ("NC");}
        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        SNCGrade sncGrade = (SNCGrade) o;
        return this.pass == sncGrade.pass && this.passDistinction == sncGrade.passDistinction;
    }
    }





