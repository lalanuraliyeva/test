package Collections.Arraylist;

import java.util.ArrayList;

public class UpdateIndex {
    public static void main(String[] args) {
        ArrayList<String>cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("VW");
        cars.add("Audi");
        cars.add("Ford");

        cars.set(1, "Volkswagen");
        System.out.println(cars);
    }
}
