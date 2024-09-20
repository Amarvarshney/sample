package linklist;
class MyLinkedList {

    Node head;
    Node tail;
    int length = 0;
    class Node {
        int val;
        Node prev;
        Node next;
        
        private Node(int val) {
            this.val = val;
        }
    }

    public MyLinkedList() {}
    
    public int get(int index) {
        if (index >= length) return -1;
        Node curr = head;
        while (index-- > 0) {
            curr = curr.next;
            if (curr == null) return -1;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node curr = new Node(val);
        if (length == 0) {
            head = curr;
            tail = curr;
        } else {
            curr.next = head;
            head.prev = curr;
            head = curr;
        }
        length++;
    }
    
    public void addAtTail(int val) {
        Node curr = new Node(val);
        if (length == 0) {
            head = curr;
            tail = curr;
        } else {
            tail.next = curr;
            curr.prev = tail;
            tail = curr;
        }
        length++;
    }
    
    public void addAtIndex(int index, int val) {

        if (index > length) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == length) {
            addAtTail(val);
            return;
        }
        
        Node newNode = new Node(val);
        Node curr = head;
        while (index-- > 0) {
            curr = curr.next;
        }
        newNode.prev = curr.prev;
        newNode.next = curr;
        curr.prev.next = newNode;
        curr.prev = newNode;
        length++;        
    }
    
    public void deleteAtIndex(int index) {
        if (index >= length) return;

        if (index == 0) {
            head = head.next;
            length--;
            return;
        }

        if (index == length - 1) {
            tail = tail.prev;
            tail.next = null;
            length--;
            return;
        }

        Node curr = head;
        while (index-- > 0) {
            curr = curr.next;
            if (curr == null) return;
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        length--;        
    }

    //O(n) time 
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MyLinkedList l1=new MyLinkedList();
        l1.addAtHead(7);
        l1.addAtHead(2);
        l1.addAtHead(1);
        l1.print();
        l1.addAtIndex(3, 0);
        l1.print();
        l1.deleteAtIndex(2);
        l1.print();
        l1.addAtHead(6);
        l1.addAtTail(4);
        l1.print();
        l1.get(4);
        System.out.println("index is");
        l1.print();
        l1.addAtHead(4);
        l1.print();
        l1.addAtIndex(5, 0);
        l1.print();
        l1.addAtHead(6);
        l1.print();
        l1.get(4);

    }  
}

