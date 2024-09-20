package stack;
import java.util.*;
public class stacklec1 {
    public static void main(String[] args) {
        //last in first out data sturctures
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println(st.peek());//top of the stack element
        System.out.println(st.pop());//top element remove 
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());//check if the stack is empty or not
        System.out.println(st.size());//give the size of the stack
    }
    
}
