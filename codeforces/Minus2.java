import java.util.Arrays;
import java.util.Scanner;

public class Minus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] count = new int[3];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 2 == 1) {
                    count[1]++;
                } else if ((x / 2) % 2 == 0) {
                    count[2]++;
                } else {
                    count[0]++;
                }
            }

            System.out.println(Math.max(count[0],
                    Math.max(count[1], count[2])));
        }
    }
}
