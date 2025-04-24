import java.util.HashSet;
import java.util.*;

public class printDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,8,7,6,5,4};
        Set<Integer> set = new HashSet<>();
//        System.out.print("[");
        for(int i: arr)
        {
            if(!set.add(i))
            {
                System.out.print(i+", ");
            }
        }
//        System.out.print("]");
    }
}
