import java.util.*;

public class LinkedSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();// Matintains the order of the element in set
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            set.add(sc.nextInt());
        }
        System.out.println(set);
    }
}
