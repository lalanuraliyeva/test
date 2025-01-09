package Collections.Arraylist;

import java.util.ArrayList;

public class Retrieve {
    public static void main(String[] args) {
        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("peach");
        fruits.add("apricot");
        fruits.add("plum");

        String peach = fruits.get(1);

        System.out.println(peach);



    }
}
