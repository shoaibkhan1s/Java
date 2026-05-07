public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int elem)  {
        if (isFull()) {
           System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = elem;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack underflow");
        }
        // int removed = data[ptr];
        // data[ptr] = 0;
        // ptr--;
        // return removed;

        return data[ptr--];
    }

    public int peek() {
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) throws StackException {
        // CustomStack stack = new CustomStack(3);
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

     
             CustomStack stack = new dynamicCustomStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    
    }
}
