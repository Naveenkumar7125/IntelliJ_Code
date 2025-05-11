package Two_Dim_Array;

import java.util.function.DoubleToIntFunction;

public class Implementation_stack_by_array {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
    }
}

class Stack
{
    private int arr[] = new int[1000];
    private int length = -1;

    public int push(int n)
    {
        return arr[++length] = n;
//        length++;
    }
    public int peek()
     {
         return arr[length];
     }

    public int size()
     {
         return length + 1;
     }

     public int pop()
     {
         int temp = arr[length];
         arr[length] = 0;
         length--;
         return temp;
     }

     public boolean isEmpty()
     {
         return length==-1;
     }

}
