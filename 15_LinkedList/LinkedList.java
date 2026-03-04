
public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int size;
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // step 1 create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        // step 2 newNode next = head
        newNode.next = head;

        // step 3 head = newNode
        head = newNode;
        size++;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void addMiddle(int data, int index) {
        Node newNode = new Node(data);

        Node temp = head;
        if (index == 0) {
            addFirst(data);
            return;
        }
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("linked list is empty");
            return 0;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
         if (size == 0) {
            System.out.println("linked list is empty");
            return 0;
        }
         if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int val = tail.data;
        tail = temp;
        temp.next = null;
        size--;
        return val;
    }

    public void removeMiddle(int index){
           if (size == 0) {
            System.out.println("linked list is empty");
            return ;
        }
         if (size == 1) {
            head = tail = null;
            size--;
            return ;
        }

        Node temp = head;
        int i =0;
        while (i<index-1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(7, 2);
        // ll.removeFirst();
        // ll.removeLast();
        ll.removeMiddle(2);
        ll.print();
        System.out.println(size);

    }
}
