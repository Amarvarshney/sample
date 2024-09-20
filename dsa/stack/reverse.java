package stack;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        //Stack<Integer> st1=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
        // st1.push(st.pop());
        // st1.push(st.pop());
        // st1.push(st.pop());
        // System.out.println(st1);
    }
    public static void reverseStack(Stack<Integer> st){
        //base case
        if(st.isEmpty()){
            return;
        }
        int x=st.pop();
        reverseStack(st);
        addLast(st,x);
    }
    public static int addLast(Stack<Integer> st,int element){
        //base case
        if(st.isEmpty()){
            st.push(element);
            return 0;
        }
        int x=st.pop();
        //recusive call
        addLast(st, element);
        //small calcualtion
        return st.push(x);
    }
}

