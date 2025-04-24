package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(8);
        set.add(2);
        set.add(2);
        set.add(9);
        set.add(0);
        set.add(8);
//        Scanner sc = new Scanner(System.in);
//        while(true)
//        {
//            int num = sc.nextInt();
//            set.add(num);
//            if(num==-1)break;
//        }
        Map<String, Integer> map = new HashMap<>();
        map.put("Naveen",7);
        map.put("Kumar",74);
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(map);
    }
}
