package linklist;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        next=null;
    }
}
public class linked_list_lec1 {
    public static void main(String[] args) {
        node a=new node(10);
        node b=new node(20);
        node c=new node(30);
        node d=new node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        node temp= a;
        int count =0;
        //a.data=a.data+1000;
        while(temp!=null){
            System.out.print(temp.data+"->");
            count++;
            temp=temp.next;
        }
        System.out.println("/n"+count);
        //add at first position
        node n=new node(1000);
        n.next=a;
        temp=n;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
        // add at last position
        node l=new node(5000);
        d.next=l;
        temp=n;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
        //size 
        int size=0;
        temp=n;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        System.out.println(size);
    }

}
