package sol;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Homework1BTest {
    Course csClass = new Course("CSCI", 1410, 1.0);
    Course bioClass = new Course("NEUR", 0120, 1.5);

    Faculty kathi = new Faculty("tall kathi", "CSCI", csClass);
    Faculty milda = new Faculty("short milda", "MATH", new Course("MATH", 0100, 1.0));

    Student blair = new Student("blair", csClass, new Course("APMA", 1650, 1.5));
    Student jordan = new Student("blair", new Course("APMA", 1650, 1.5), bioClass);
    Student tiff = new Student("tiff", new Course("MATH", 0100, 1.0), csClass);


    TA mike = new TA("mike", new Course("APMA", 1650, 1.5), bioClass, csClass );

    IGrade A = new LetterGrade(Letter.A);
    IGrade NC = new LetterGrade(Letter.NC);

    IGrade dist = new SNCGrade(SNC.SDIST);
    IGrade pass = new SNCGrade(SNC.S);
    IGrade fail = new SNCGrade(SNC.NC);

    GradeReport blairA = new GradeReport(blair, csClass, A);
    GradeReport jF = new GradeReport(jordan, bioClass, fail);
    GradeReport tiffD = new GradeReport(tiff, csClass, dist);


    @Test
    public void testIsPassing() {
        Assert.assertEquals(jF.grade.isPassing(), false);
        Assert.assertEquals(blairA.grade.isPassing(), true);
    }

    @Test
    public void testViewGrade() {
        Assert.assertEquals(mike.viewGrade(blairA), "A");
        Assert.assertEquals(kathi.viewGrade(tiffD), "S*");
    }

    @Test(expected = RuntimeException.class)
    public void testAccessDenied() {
        milda.viewGrade(jF);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTAError() {
        TA jen = new TA("jen", new Course("APMA", 1650, 1.5), bioClass, bioClass );
    }

}


/*
1. Boa, Dillo, Fish, Shark, Fruitfly
2. FruitFly has isNormalSize() method
3. shark has fields salinity, attacks, and isNormalSize() method
4. add likesFruit to FruitFly and Boa
 */