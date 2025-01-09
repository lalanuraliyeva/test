package Collections.Arraylist;

import java.util.ArrayList;

public class Firstposition {
    public static void main(String[] args) {
        ArrayList<String>programs =new ArrayList<>();
        programs.add("Java");
        programs.add("SQL");
        programs.add("Python");
        programs.add("C++");
        programs.add("Java Script");


        programs.addFirst("Pascal");
        for(String program :programs) {
            System.out.println(program);
        }


    }

}
