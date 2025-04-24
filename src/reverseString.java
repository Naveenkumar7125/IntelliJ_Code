import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Uisng Method 1 = "+reverse(s));
        System.out.println("Uisng Method 2 = "+usingBuiltin(s));

    }
    public static String reverse(String s)
    {
        char arr[] = s.toCharArray();
        int l = 0, r = s.length()-1;
        while(l<=r)
        {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;

        }
        return String.valueOf(arr);
    }
    public static String usingBuiltin(String s)
    {
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString();
    }
}
