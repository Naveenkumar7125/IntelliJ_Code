//import javax.net.ssl.SNIHostName;
import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        perm(s.toCharArray(), 0);

    }
    public static void perm(char[] arr, int fix)
    {
        if(fix==arr.length-1)
        {
            System.out.println(new String(arr));
            return;
        }
        for(int i=fix;i<arr.length;i++)
        {
            swap(arr,i,fix);
            perm(arr, fix+1);
            swap(arr,i,fix);
        }
    }
    public static void swap(char[] arr, int st, int end)
    {
        char temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }
}
