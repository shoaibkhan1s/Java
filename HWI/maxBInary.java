import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class maxBInary {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter N: ");
    int n = sc.nextInt();

   List<Integer> A = new ArrayList<>();
   List<Integer> B = new ArrayList<>();
    System.out.println("enter element of A : ");
    for (int i = 0; i < n; i++) {
        A.add(sc.nextInt());
    }

    System.out.println("enter element of B : ");
    for (int i = 0; i < n; i++) {
        B.add(sc.nextInt());
    }

    int ans = findMax(n,A,B);
    System.out.println(ans);

}

private static int findMax(int n, List<Integer> A, List<Integer> B) {
   Collections.sort(A,Collections.reverseOrder());
   Collections.sort(B);
   StringBuilder sr = new StringBuilder();

   for (int i = 0; i < n; i++) {
    for (int j = 0; j < A.get(i); j++) {
        sr.append("1");
    }
    for (int j = 0; j < B.get(i); j++) {
        sr.append("0");
    }
   }
   System.out.println(sr);
   int ans = Integer.parseInt(sr.toString(),2);
   return ans;
}
}
