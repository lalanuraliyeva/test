package Collections.Arraylist;

import java.util.ArrayList;

public class SubList {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Sun");
        planets.add("Moon");

        System.out.println(planets.subList(0,3));
    }
}
