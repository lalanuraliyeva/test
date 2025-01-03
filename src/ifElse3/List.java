package ifElse3;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        java.util.List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println(colors);

        colors.remove(0);
        System.out.println(colors);

    }
}
