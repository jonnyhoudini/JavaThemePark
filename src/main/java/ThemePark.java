import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<IReviewed> attractionsAndStalls;
    private String name;

    public ThemePark(String name) {
        this.name = name;
        this.attractionsAndStalls = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return attractionsAndStalls;
    }


    public String getName() {
        return name;
    }

    public void addThing(IReviewed thing){
        this.attractionsAndStalls.add(thing);
    }

    public int getCount() {
        return attractionsAndStalls.size();
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.addAttraction(attraction);
        attraction.incrementVisitCount();
    }
}
