import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.print("Enter the Array Elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnter the number : ");
        int num = sc.nextInt();
        System.out.print("\nEnter the difference : ");
        int diff = sc.nextInt();
        int c = 0;
        for(int i=0;i<size;i++)
        {
            if((Math.abs(arr[i] - num)) <= diff)c++;
        }
        System.out.println("The number below the difference is "+c);
    }
}
