package Exceptional_Handling;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Red");
        lst.add("Blue");
        lst.add("Pink");
        lst.add("Green");
        lst.add("Yellow");
        System.out.println("The Element at index 3 : "+lst.get(3));
        lst.remove(2);
        System.out.println(lst);
    }
}
