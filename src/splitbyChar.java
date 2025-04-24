import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class splitbyChar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        List<String> lst = new ArrayList<>();
        int l = 0, r = 0;
        while(r< str.length()){
            if(str.charAt(r)==ch || r == str.length()-1)
            {
                lst.add(str.substring(l,r+1));
                l = r;
                r++;
            }
            else if(r==str.length()-1)
            {
                lst.add(str.substring(l,r+1));
            }
            else r++;
        }
        System.out.println(lst);

    }
}
