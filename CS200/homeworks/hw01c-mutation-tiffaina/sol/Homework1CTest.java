package sol;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;


public class Homework1CTest {

    Course csClass = new Course("CSCI", 1410, 1.0);
    Course bioClass = new Course("NEUR", 0120, 1.5);
    Course apmaClass = new Course("APMA", 1650, 1.5);
    Course philClass = new Course("PHIL", 0016, 1.0);


    Faculty kathi = new Faculty("tall kathi", "CSCI"); //cs
    Faculty milda = new Faculty("short milda", "PHIL"); //phil

    Student blair = new Student("blair", csClass, apmaClass);
    Student jordan = new Student("jordan", apmaClass, bioClass);
    Student tiff = new Student("tiff", philClass, csClass);
    Student hannah = new Student("hannah", philClass, bioClass);

    TA mike = new TA("mike", apmaClass, bioClass, csClass );
    TA jen = new TA("jen", apmaClass, csClass, philClass);

    IGrade A = new LetterGrade(Letter.A);
    IGrade NC = new LetterGrade(Letter.NC);
    IGrade C = new LetterGrade(Letter.C);

    IGrade dist = new SNCGrade(SNC.SDIST);
    IGrade pass = new SNCGrade(SNC.S);
    IGrade fail = new SNCGrade(SNC.NC);

    GradeReport blairA = new GradeReport(blair, csClass, A);
    GradeReport jF = new GradeReport(jordan, bioClass, fail);
    GradeReport tiffC = new GradeReport(tiff, csClass, C);
    GradeReport tiffD = new GradeReport(tiff, csClass, dist);
    GradeReport han = new GradeReport(hannah, philClass, C);

    @Test
    public void testStoreGrade() {
        this.csClass.storeGrade(blair, NC);
        this.csClass.storeGrade(tiff, dist);
        this.bioClass.storeGrade(jordan, fail);
        this.philClass.storeGrade(tiff, A);
        this.philClass.storeGrade(hannah, NC);
        this.apmaClass.storeGrade(blair, pass);
        this.apmaClass.storeGrade(jordan, A);

        kathi.addClass(csClass);
        Assert.assertEquals(csClass.gradeLookup(kathi, "blair"), "NC");
        kathi.addClass(bioClass);
        Assert.assertEquals(bioClass.gradeLookup(kathi, "jordan"), "NC");
        milda.addClass(apmaClass);
        Assert.assertEquals(apmaClass.gradeLookup(milda, "jordan"), "A");
        milda.addClass(philClass);
        Assert.assertEquals(philClass.gradeLookup(milda, "tiff"), "A");
    }

    @Test
    public void testUpdateGrade() { // which tests gradeLookup() by interaction
        this.csClass.storeGrade(blair, NC);
        csClass.updateGrade("blair", A); // updates csGrade from NC to A
        Assert.assertEquals(csClass.gradeLookup(mike, "blair"), "A");
    }
    @Test(expected = RuntimeException.class)
    public void testUpdateError() {
        bioClass.updateGrade("tiff", A);
    }

     @Test
    public void testGradeLookup() { // test with ViewGrade & tests private findGrade function
         this.csClass.storeGrade(blair, A);
         this.philClass.storeGrade(hannah, NC);
         this.apmaClass.storeGrade(jordan, A);
         milda.addClass(apmaClass);

        Assert.assertEquals(philClass.gradeLookup(jen, "hannah"), "NC");
        Assert.assertEquals(mike.viewGrade(blairA), csClass.gradeLookup(mike, "blair"));
        Assert.assertEquals(apmaClass.gradeLookup(milda, "jordan"), "A");


    }

    @Test(expected = RuntimeException.class)
        public void testLookupError() {
        kathi.addClass(bioClass);
        milda.addClass(bioClass);
        // faculty no access
        bioClass.gradeLookup(mike, "jordan");
        //no gradereport in course gradebook
        bioClass.gradeLookup(kathi, "hannah");
        // both exceptions
        bioClass.gradeLookup(milda, "blair");

    }

    @Test
    public void testReportC() {
        testStoreGrade();

        philClass.updateGrade("hannah", C);
        Assert.assertTrue(philClass.reportsWithC().contains(han));

    }


}
