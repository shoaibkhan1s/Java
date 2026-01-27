
public class palindrome {
    public static int method2(int n){
    int digit = (int)Math.log10(n) + 1; //counts number of digits in n
    return helper(n,digit);
}
public static int  helper(int n,int digit){
    if (n%10==n) {
        return n;
    }
    int  rem = n%10;
    return rem*(int)Math.pow(10,digit-1) + helper(n/10, digit-1);
}
static boolean palind(int n){
    return n == method2(n);
}
public static void main(String[] args) {
    System.out.println(palind(14415));
}
}
