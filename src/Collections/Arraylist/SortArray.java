package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArray {
    public static void main(String[] args) {

        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Sun");
        planets.add("Moon");

        Collections.sort(planets);
        System.out.println(planets);

    }
}
