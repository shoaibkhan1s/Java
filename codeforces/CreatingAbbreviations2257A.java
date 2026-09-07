import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatingAbbreviations2257A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int p = sc.nextInt();
            int q = sc.nextInt();

            String[] n = new String[p];

            for (int i = 0; i < p; i++) {
                n[i] = sc.next();
            }

            String[] m = new String[q];

            for (int i = 0; i < q; i++) {
                m[i] = sc.next();
            }

            List<Character> x = new ArrayList<>();

            for (String str : n) {
                x.add(str.charAt(0));
            }

            System.out.println(solve(x, m) ? "YES" : "NO");
        }

        sc.close();
    }

    private static boolean solve(List<Character> x, String[] m) {

        for (String str : m) {

            for (int i = 0; i < str.length(); i++) {

                if (!x.contains(Character.toLowerCase(str.charAt(i)))) {
                    return false;
                }
            }
        }

        return true;
    }
}