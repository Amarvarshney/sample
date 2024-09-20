package queue;
import java.util.*;
class queues {
    private int arr[];
    private int rear;
    private int front;
    private int size = 0;
    queues(){
        arr=new int[6];
        rear=0;
        front=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    public void enqueue(int element){
        if(size==arr.length){
            System.out.println("queue is full");
            return;
        }
        arr[rear]=element;
        rear=(rear+1)%arr.length;
        size++;
    }
    public int dequeue(){
        if(size==0){
            System.out.println("queue is empty");
            return -1;
        }
        int x=arr[front];
        front=(front+1)%arr.length;
        size--;
        return x;
    }
    public int peek(){
        if(size==0){
            System.out.println("queue is empty");
            return 0;
        }
        return arr[front];
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[(front+i)%arr.length]+" ");
        }
        System.out.println();
    }
}


public class implementation {
    public static void main(String[] args) {
        queues a=new queues();
        a.enqueue(10);
        a.enqueue(20);
        a.enqueue(30);
        a.enqueue(40);
        a.enqueue(50);
        a.enqueue(60);
        a.display();
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        a.display();
        a.enqueue(70);
        a.display();
        System.out.println(a.peek());
        
        
            
    }
}
