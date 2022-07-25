package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canChargeDoubleForTallPeople(){
        visitor = new Visitor(21, 203.0, 60.50);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void chargesNormalFareForSmallPeople(){
        Visitor small = new Visitor(21, 160.50, 58.70);
        assertEquals(8.40, rollerCoaster.priceFor(small), 0.01);
    }
}
