import java.util.Scanner;

public class toggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' '){
                System.out.print(' ');
                continue;
            }
            System.out.print(ch>='a' && ch<='z'?(char)(ch-32):(char)(ch+32));
        }
    }
}
