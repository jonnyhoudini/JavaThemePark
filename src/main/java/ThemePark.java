import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractionList;
    private ArrayList<Stall> stallList;
    private String name;

    public ThemePark(String name, ArrayList<Attraction> attractionList, ArrayList<Stall> stallList){
        this.name = name;
        this.attractionList = new ArrayList<>(attractionList);
        this.stallList = new ArrayList<>(stallList);
    }
}
