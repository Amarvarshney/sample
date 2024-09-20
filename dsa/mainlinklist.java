public class mainlinklist {
    private node head;
    private node tail;
    private int size;
class node{
    int data;
    node next;
}
public void add_st_start(int val){
    node a=new node();
    a.data=val;
    if(size==0){
        head=a;
        tail=a;
        size++;
    }else{
        a.next=head;
        head=a;
        size++;
    }
}
public void print(){
    node temp=head;
    while(temp!=null){
        System.out.println(temp.data+"->");
        temp=temp.next;
    }
    System.out.println();
}
}
