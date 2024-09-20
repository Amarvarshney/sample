package stack;
import java.util.*;
public class pushatend {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
       // Stack<Integer> st1=new Stack<>();
        //brutforst approach
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // System.out.println(st);
        // st1.push(st.pop());
        // st1.push(st.pop());
        // st1.push(st.pop());
        // st.push(1000);
        // st.push(st1.pop());
        // st.push(st1.pop());
        // st.push(st1.pop());
        // System.out.println(st);
        // using recusion 
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(500);
        System.out.println(st);
        st.insertElementAt(20000, 1);//inbuiltfunction
        int a=st.size()-1;//add at any places
        addLast(st,1000,a);
        System.out.println(st);
    }
    public static int addLast(Stack<Integer> st,int element,int b){
        if(st.size()==b){
            st.push(element);
            return 0;
        }
        int x=st.pop();
        addLast(st, element,b);
        return st.push(x);
    }
}
