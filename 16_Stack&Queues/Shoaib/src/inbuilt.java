import java.util.Stack;

public class inbuilt {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(10);
        stack.add(15);
        stack.add(20);
        stack.add(2, 50);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
