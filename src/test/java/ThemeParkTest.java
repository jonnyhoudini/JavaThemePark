import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    Visitor visitor;


    @Before
    public void before(){
        themePark = new ThemePark("Alton Towers");
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(21, 178, 90);
    }

    @Test
    public void hasName(){
        assertEquals("Alton Towers", themePark.getName());
    }

    @Test
    public void canAddThing(){
        themePark.addThing(iceCreamStall);
        themePark.addThing(tobaccoStall);
        themePark.addThing(candyflossStall);
        themePark.addThing(rollerCoaster);
        themePark.addThing(dodgems);
        themePark.addThing(playground);
        themePark.addThing(park);
        assertEquals(7, themePark.getCount());
    }

    @Test
    public void canAddAttractionToVisitorList(){
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, visitor.getNumberOfAttractionsVisited());
    }

    @Test
    public void canIncrementAttractionVisitCount(){
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount());
    }
}
