package LEETCODE_PROBLEMS;

public class LC67 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));

    }
    public static String addBinary(String a, String b) {
        int l = a.length()-1;
        int r = b.length()-1;
        StringBuilder str = new StringBuilder();
        int carry = 0;
        while(l>=0 && r>=0)
        {
            int n1 = a.charAt(l)=='0'?0:1;
            int n2 = b.charAt(r)=='0'?0:1;
            if((n1+n2)<=2)
            {
                if(carry==0)
                {
                    int num = n1+n2;
                    if(num==2)
                    {
                        carry = 1;
                        str.append(0);
                    }
                    else if(num==1)
                    {
                        str.append(1);
                    }
                }
                else
                {
                    int num = n1+n2;
                    if(num==2)
                    {
                        str.append(1);
                        carry = 1;

                    }
                    else if(num==1)
                    {
                        carry = 1;
                        str.append(0);
                    }
                    else
                    {
                        carry = 0;
                        str.append(1);
                    }

                }
            }
            else
            {
                str.append(0);
            }
            l--;
            r--;
        }

        return str.toString();
    }
}
