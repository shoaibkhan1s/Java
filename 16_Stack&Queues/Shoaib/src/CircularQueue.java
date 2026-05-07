public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int elem) {
        if (isFull()) {
            System.out.println("queue is full");
            return false;
        }

        data[end++] = elem;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;

        return removed;

    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty");
        }
        return data[0];
    }

    public void display() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty");
        }

        int i = front;
        do {
            System.out.print(data[i] + " <- ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) throws Exception {
        CircularQueue c = new CircularQueue(3);
        c.insert(5);
        c.insert(10);
        c.insert(15);

        c.display();
        c.remove();
        c.remove();
        c.insert(50);
        c.display();
    }

}
