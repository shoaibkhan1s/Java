import java.util.Arrays;

public class dynamicCustomStack extends CustomStack {
    public dynamicCustomStack() {
        super(); // it will call CustomStack()
    }

    public dynamicCustomStack(int size) {
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int elem) {
        if (this.isFull()) {
            int[] temp = Arrays.copyOf(data, data.length * 2);

            data = temp;
        }
        // at this point we know that array is not full
        // insert item
        return super.push(elem);
    }


}
