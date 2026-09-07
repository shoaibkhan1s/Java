import java.util.Scanner;

public class WayTooLongWords71A {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] p = new String[n];
    for(int i=0;i<n;i++){
        p[i] = sc.next();
    }
    for (int i = 0; i < p.length; i++) {
        int length = p[i].length();
        if (length>10) {
            p[i] = p[i].charAt(0) + Integer.toString(length-2) + p[i].charAt(length-1); 
        }
    }
    
    for (String string : p) {
        System.out.println(string);
    }
}
}
