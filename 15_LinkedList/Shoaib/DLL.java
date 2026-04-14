package Shoaib;

public class DLL {
    private Node head;
    private int size = 0;

    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null) {
            insertFirst(val);
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }

    public void insert(int val, int idx) {
        Node node = new Node(val);
        if (head == null) {
            insertFirst(val);

            return;
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
        size++;

    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
        while (last != null) {
            System.out.print(last.value + "->");
            last = last.prev;
        }
        System.out.print("Start");
    }

    public void deleteFirst() {
        if (head == null)
            return;

        if (head.next == null) {
            head = null;
        } else {
            head.next.prev = null;
            head = head.next;
        }
        size--;
    }

    public void deleteLast() {
        if (size == 1) {
            deleteFirst();
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;

    }

    public void delete(int val) {

        Node node = find(val);

        if (node == null)
            return;

        if (node == head) {
            deleteFirst();
            return;
        }

        if (node.next == null) {
            deleteLast();
            return;
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public class Node {
        int value;
        Node prev;
        Node next;

        public Node(int val) {
            this.value = val;

        }

        public Node(int val, Node prev, Node next) {
            this.value = val;
            this.prev = prev;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(50);
        list.insertLast(60);
        list.insertLast(70);
        // list.deleteFirst();
        // list.insert(90, 2);
        // list.deleteLast();
        // list.delete(20);
        list.display();
        // System.out.println();
        // System.out.println(list.size);
    }

}
