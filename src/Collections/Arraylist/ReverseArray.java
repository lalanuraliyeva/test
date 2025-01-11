package Collections.Arraylist;

import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<String>cities=new ArrayList<>();
        cities.add("New York");
        cities.add("Paris");
        cities.add("Berlin");


        System.out.println(cities);
        System.out.println(cities.reversed());
    }
}
