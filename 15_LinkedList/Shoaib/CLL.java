package Shoaib;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
         
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.value + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }

    public void delete(int val){
        Node temp=head;
        if (head==null) {
            return;
        }
        if (size==1) {
            head=null;
            tail=null;
            size--;
            return;
        }
        while (temp.next.value!=val) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;

    }

    public class Node {
        int value;
        Node next;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.delete(30);
        list.display();
    }
}
