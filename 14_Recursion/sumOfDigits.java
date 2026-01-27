public class sumOfDigits {
public static void main(String[] args) {
System.out.println(sum(1345));
}
static public int sum(int n){
    if (n==0) {
        return 0;
    }
    int rem = n%10;
    n = n/10;
    return rem + sum(n);
}
}
