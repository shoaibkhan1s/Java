import java.util.Scanner;

public class foodStamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of types of food : ");
        int n = sc.nextInt();

        System.out.println("Enter the maximum number of meals");
        int m = sc.nextInt();

        int[] v = new int[n];
        System.out.println("Enter value of each food");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int[] d  =  new int[n];
        System.out.println("Enter decrease in value after consuming meal");
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        int ans = findAns(n,m,v,d);
        System.out.println(ans);

    }

    private static int findAns(int n, int m, int[] v, int[] d) {
      
    }
}
