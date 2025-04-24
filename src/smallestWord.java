import java.util.Scanner;

public class smallestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(smallestWord(s));
    }
    public static String smallestWord(String s)
    {
        String res = "";
        int l = 0;
        int r = 0;
        int min = Integer.MAX_VALUE;
        while(r<s.length())
        {
            if(s.charAt(r)!=' ' && r!=s.length()-1)
            {
                r++;
            }
            else
            {
                if((r-l)<=min)
                {
                    min = r - l;
                    if(r==s.length()-1)
                        res = s.substring(l,r+1);
                    else
                        res = s.substring(l,r);
                }
                l = r+1;
                r++;
            }
        }
        return res;
    }
}
