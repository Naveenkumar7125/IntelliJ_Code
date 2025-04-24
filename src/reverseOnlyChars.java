import java.util.Scanner;

public class reverseOnlyChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }
    public static String reverse(String s)
    {
        char arr[] = s.toCharArray();
        int l = 0, r = s.length()-1;
        while(l<=r)
        {
            if(!Character.isLetter(arr[l]))l++;
            else if(!Character.isLetter(arr[r]))r--;
            else
            {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return String.valueOf(arr);
    }
}
