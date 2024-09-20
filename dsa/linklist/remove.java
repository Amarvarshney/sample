package linklist;

public class remove {
        node head;
        node tail;
        int size;
        class node{
            int data;
            node next;
            node(int val){
                data=val;
                next=null;
            }
        }
    //o(size)
        public void remove_at_any_index(int pos) {
        if(pos==0) {
            remove_first();
        }else if(pos==size-1) {
            remove_last();
        }else {
            node temp=head;
            for(int i=0;i<pos-1;i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
        }
    ////	o(size)
        public void remove_last() {
            if(size==1) {
                head=null;
                tail=null;
                size--;
            }else {
                node temp=head;
                for(int i=0;i<size-2;i++) {
                    temp=temp.next;
                }
                temp.next=null;
                tail=temp;
                size--;
            }
            
        }
    //	o(1)
        public void remove_first() {
            if(size==1) {
                head=null;
                tail=null;
                size--;
            }else {
                node temp=head;
                head=head.next;
                temp.next=null;
                size--;
            }
        }
    //	o(1)
        public void add_at_last(int val) {
            node n=new node(val);
            if(size==0) {
                head=n;
                tail=n;
                size++;
            }else{
                tail.next=n;
                tail=n;
                size++;
            }
        }
    //	o(size)
        public void add_at_any_pos(int pos,int val) {
            if(pos==0) {
                add_at_first(val);
            }else if(pos==size) {
                add_at_last(val);
            }else {
                node n=new node(val);
                node temp=head;
                for(int i=0;i<pos-1;i++) {
                    temp=temp.next;
                }
                node x=temp.next;
                temp.next=n;
                n.next=x;
                size++;	
            }
            
        }
    //	o(1)
        public void add_at_first(int val) {
            node n=new node(val);
            if(size==0) {
                head=n;
                tail=n;
                size++;
            }else {
                n.next=head;
                head=n;
                size++;
            }
        }
    //	o(size)
        public void print() {
            node temp=head;
            while(temp!=null) {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            remove ll=new remove();
            ll.add_at_first(10);
            ll.add_at_first(20);
            ll.add_at_first(30);
            ll.print();
            ll.add_at_last(100);
            ll.add_at_last(110);
            ll.print();
            ll.add_at_any_pos(3,1500);
            ll.print();
            ll.remove_first();
            ll.print();
            ll.remove_last();
            ll.print();
            ll.remove_at_any_index(2);
            ll.print();
        }
    
    }

