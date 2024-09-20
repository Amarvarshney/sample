package stack;

import java.util.*;

class stack{
    private int arr[];
    private int idx=-1;
    stack(){
        arr=new int[10];
    }
    stack(int n){
        arr=new int[n];
    }
    public void push(int element){
        idx++;
        arr[idx]=element;
    }
    public int peek(){
        return arr[idx];
    }
    public boolean isEmpty(){
        if(arr[idx]==-1){
            return true;
        }else{
            return false;
        }
    }
    public int pop() throws Exception{
        if(idx==-1){
            throw new Exception("stack is empty");
        }
        int x=arr[idx];
        idx--;
        return x;
    }
    public int size(){
        return idx+1;
    }
    public void print(){
        for(int i=0;i<=idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class implementation {
    public static void main(String[] args)throws Exception {
        stack st=new stack();
        System.out.println(st.pop());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.print();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.print();
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }
    
}
