package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {
    public static void main(String[] args) {
        ArrayList<String>countries=new ArrayList<>();
        countries.add("Spain");
        countries.add("Germany");
        countries.add("Kenya");
        countries.add("Russia");

        System.out.println(countries);

        Collections.shuffle(countries);
        System.out.println(countries);
    }
}
