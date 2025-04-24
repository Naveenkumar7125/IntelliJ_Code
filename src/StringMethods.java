import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "HellO";
        String s3 = new String("Hallo");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println((int)'a');
        System.out.println((int)'A');
        char ch[] = {'a', 'd','3', 'g'};
        System.out.println(String.valueOf(ch));
        String res = new String(ch);
        System.out.println(res);
        System.out.println(ch.toString());
        String myStr = "       Hello World!       ";
        System.out.println(myStr);
        System.out.println(myStr.trim());
//        toggleCase("Hello");
        String result = String.format("Hello %s, you are %d years old", "Alex", 20);
        System.out.println(result);

    }
}
