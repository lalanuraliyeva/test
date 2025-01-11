package Collections.Arraylist;

import java.io.PrintStream;
import java.util.ArrayList;

public class RemoveIndex {
    public static void main(String[] args) {
        ArrayList<String>phones=new ArrayList<>();
        phones.add("iphone");
        phones.add("samsung");
        phones.add("redmi");
        phones.add("huawei");

        phones.remove(3);

        for (String x : phones){
            System.out.println(x);
        }

    }
}
