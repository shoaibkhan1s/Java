package Shoaib;


public class LL {

    private Node head; 
    private Node tail; 
    private int size;

    LL(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
System.out.println(head.value);
    }

    public void insertLast(int val){
       if (tail==null) {
        insertFirst(val);
        return;
       }
       Node node = new Node(val);
       tail.next = node;
       tail = node;
       System.out.println(tail.value);
       size++;
    }
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;

        }
        if (index==size) {
            insertLast(val);
            return;
        }
        Node temp = head;

        for (int i = 1; i < index; i++) {
           temp =  temp.next ;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;        
    }

    public void deleteFirst(){
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        head = head.next;
        size--;
        
    }
    public void deleteLast(){
        if (size==1) {
            deleteFirst();
            size--;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp.next;
        temp.next = null;
        size--;
    }

    public void delete(int index){
        if (index==size) {
            deleteLast();
            size--;
            return;
        }
        if (index==0) {
            deleteFirst();;
            size--;
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
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


    public Node get(int idx){
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
        public class Node{
            private int value;
            private Node next;

            public Node(int val){
                this.value = val;
            }
            public Node(int val,Node next){
                this.value = val;
                this.next = next;
            }
        }



        public static void main(String[] args) {
LL list = new LL();
list.insertFirst(10);
list.insert(15, 1);
list.insertLast(50);
// list.deleteFirst();
// list.deleteLast();
// list.delete(1);
list.display();

        Node node = list.find(15);
        if (node != null) {
            System.out.println(node.value);
        } else {
            System.out.println("Node not found");
        }
        System.out.println(list.get(1).value);

}
}

