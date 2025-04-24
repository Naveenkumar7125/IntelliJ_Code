public class Test {
    public static void main(String[] args) {
        int i = 0;

        while(i++ < 5) {

            if(i % 2 == 0)
                continue;

            System.out.print(i + " ");

        }
    }
}
