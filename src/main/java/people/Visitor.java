package people;

import attractions.Attraction;
import attractions.RollerCoaster;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;

    private ArrayList<Attraction> attractionsVisited;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.attractionsVisited = new ArrayList<Attraction>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void addAttraction(Attraction attraction) {
        this.attractionsVisited.add(attraction);
    }

    public int getNumberOfAttractionsVisited() {
        return attractionsVisited.size();
    }
}
