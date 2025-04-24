import java.util.Arrays;
import java.util.Scanner;

public class prevnextMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = sc.nextInt();
        }
        int res[] = new int[a];
        res[0] = arr[1];
        arr[a-1] = arr[a-1] * arr[a-2];
        int prev = 1;
        arr[0] = arr[1];
        for(int i=1;i<a-1;i++)
        {
            int prev1 = arr[i];
            arr[i] = prev * arr[i-1];
            prev = prev1;
        }
        for(int i=1;i<a-1;i++)
        {
            res[i] = arr[i-1] * arr[i+1];
        }
        System.out.println("1 2 3 4 5");
        System.out.println(Arrays.toString(arr));
        String r = Arrays.toString(res);
        System.out.println(r);
    }
}
