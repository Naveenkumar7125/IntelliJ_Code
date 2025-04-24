import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = sc.next();
        if(isAnagram(s,s2)) System.out.println("Anagram");
        else System.out.println("Not");

    }
    public static boolean isAnagram(String s1, String s2)
    {
        if(s1.length()!=s2.length())return false;
        int fre1[] = new int[26];
        int fre2[] = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            char ch2 = s2.charAt(i);
            fre1[ch - 'a']++;
            fre2[ch2 - 'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(fre1[i]!=fre2[i])return false;
        }
        return true;
    }
}
