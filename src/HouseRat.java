import java.util.Scanner;

public class HouseRat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rat = sc.nextInt();
        int unit = sc.nextInt();
        int s = sc.nextInt();
        int arr[] = new int[s];
        int c = 0;
        int res = rat * unit;
        for(int i=0;i<s;i++)
        {
            arr[i] = sc.nextInt();
            if(res>0)
                c++;
        }

        int j = 0;
        for(j = 0;j<s;j++)
        {
            if(res<=0)break;
            res -= arr[j];
        }
        if(res<0)
            System.out.println(j+"th house");
        else System.out.println("Insufficient");
    }
}
