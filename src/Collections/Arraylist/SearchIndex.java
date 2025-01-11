package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchIndex {
    public static void main(String[] args) {
        ArrayList<String>planets=new ArrayList<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a planet name :");
        String input = scanner.nextLine();

        if(planets.contains(input)) {
            System.out.println("planet is found");

        } else {
            System.out.println("dinazavur");
        }


    }
}
