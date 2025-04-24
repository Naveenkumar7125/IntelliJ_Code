import java.util.Scanner;

public class intersection {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int brr[] = {2,3,4,5,6,7};
        int fre[]= new int[100];
        for(int i=0;i<arr.length;i++)
        {
            fre[arr[i]]++;
        }
        for(int i=0;i<brr.length;i++)
        {
            int num = brr[i];
            if(fre[num]>0)System.out.print(num+" ");
        }

    }
}
