//import digitToBinary from src;
public class multipleofSeven {
    public static void main(String[] args) {
        int num = 777;
//        System.out.println(digitToBinary(num));
        if(Integer.bitCount(num)==3) System.out.println("Multiple of 7");
        else System.out.println("No");
    }
}
