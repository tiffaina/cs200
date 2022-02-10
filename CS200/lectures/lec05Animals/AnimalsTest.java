package lec05Animals;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class AnimalsTest {

    Dillo babyDillo = new Dillo(8, false);
    Dillo adultDillo = new Dillo(24, false);
    Dillo hugeDillo = new Dillo(65, true);
    Boa meanBoa = new Boa("Slinky", 36, "nails");
    Boa thinBoa = new Boa("Slim", 24, "lettuce");
    Zoo snakeHouse = new Zoo(meanBoa, thinBoa);
    Zoo gentleZoo = new Zoo(thinBoa, babyDillo);

    /**
     * Example test method.
     * Test methods must have @Test before the method
     */
    @Test
    public void testExample() {
        // example syntax for assertEquals
        Assert.assertEquals(1+1, 2);
    }
    @Test
    public void testMakeDillo() {
        Assert.assertEquals(babyDillo.length, 8);
    }

    @Test
    public void testNormalSize() {
        Assert.assertEquals(this.thinBoa.isNormalSize(), false);
        Assert.assertEquals(this.adultDillo.isNormalSize(), true);
    }

}
