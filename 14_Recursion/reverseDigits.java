
public class reverseDigits {
   static int sum = 0;
    public static void method1(int n){
        if (n==0) {
            return;
        }
int rem = n%10;
sum = 10*sum + rem;
 method1(n/10);
}


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
public static void main(String[] args) {
    // method1(1475);
    // System.out.println(sum);
    System.out.println(method2(14477));
}

}
