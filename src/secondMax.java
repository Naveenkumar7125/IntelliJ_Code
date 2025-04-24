import java.util.Scanner;

public class secondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = sc.nextInt();
        }
        int firstMax = arr[0];
        int secondMax = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(firstMax<arr[i])
            {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else {
                secondMax = Math.max(secondMax, arr[i]);
            }
        }
        System.out.println("FirstMax = "+firstMax);
        System.out.println("SecondMax = "+secondMax);
    }
}
