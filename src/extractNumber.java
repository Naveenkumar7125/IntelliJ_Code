import java.util.Scanner;

public class extractNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        int num = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(isDigit(ch))
                num = num * 10 + (ch - '0');
            if(!isDigit(ch))
            {
                max = Math.max(num,max);
                num = 0;
            }
        }
        System.out.println(max);


    }
    public static boolean isDigit(char ch)
    {
        return ch>=48 && ch<=57;
    }
}
