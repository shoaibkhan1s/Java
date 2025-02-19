import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(2);
        for (int i = 0; i < 8; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] does not work here.
        }
    }
}
