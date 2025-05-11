package Exceptional_Handling;

import java.util.Scanner;

public class finally_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("Enter the Index: ");
        int i = sc.nextInt();
        try
        {
            System.out.println(arr[i]);
        }
        catch (Exception e)
        {
            System.out.println("The Error is "+e);
        }
        finally {
            System.out.println("Always Finally Block Executed");
        }
    }
}
