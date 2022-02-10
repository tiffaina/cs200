package sol;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Homework1ATest {

    Course csClass = new Course("CSCI", 1410, 1.0);
    Course bioClass = new Course("NEUR", 0120, 1.5);

    Faculty kathi = new Faculty("tall kathi", "CSCI", csClass);
    Faculty milda = new Faculty("short milda", "PHIL", new Course("MATH", 0100, 1.0));

    Student blair = new Student("blair", csClass, new Course("APMA", 1650, 1.5));
    Student jordan = new Student("blair", new Course("APMA", 1650, 1.5), bioClass);


    @Test
    public void testFaculty() {
        // example syntax for assertEquals
        Assert.assertEquals(kathi.isTeaching(csClass), true);
    }

    @Test
    public void testTotal() {
        Assert.assertEquals(blair.totalCredits(), 2.5, 0);
    }
    @Test
     public void testGrade() {
         Assert.assertEquals(kathi.canGrade(blair), true);
     }

    @Test(expected = IllegalArgumentException.class)
    public void testCreditError() {
        Course philClass = new Course("PHIL", 1440, 2.5);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCourseError() {
        Student error = new Student("blair", bioClass, bioClass);
    }

}
