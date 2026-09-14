import java.util.Arrays;
import java.util.Scanner;

public class C2259 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
        int n = sc.nextInt();
        int[] a = new int[n];
      
        for (int i = 0; i < a.length; i++) {
            int x = sc.nextInt();
            a[i] = x;
        }

        System.out.println(Arrays.toString(solve(a)));
    }
}
private static  int[] solve(int[] a){
boolean left = false;
int right = a.length-1;
boolean ckRight = false;
boolean oneNotSeen = false;

for (int i = 0; i < a.length; i++) {
    int x = a[i];
    if (a[right]==1 && !oneNotSeen && !ckRight ) {
        a[right] = 1;
        oneNotSeen = true;
        ckRight = true;
    }
    if (a[right]==-1 && !ckRight && !oneNotSeen) {
        a[right] = 1;
        ckRight = true;
    }else if (a[right]!=-1) {
        right--;
    }
    if (!left && x==-1) {
        a[i] = 1;
        left = true;
    }else if (left && x==-1) {
        a[i] = 0;
    }
}
return a;
}
}
