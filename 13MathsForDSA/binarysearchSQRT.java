public class binarysearchSQRT {
    public static void main(String[] args) {
    int n =40;
    int p=3;
    double ans = sqrt(n,p);    
    System.out.println(ans);
    }
static public double sqrt(int n,int digitsAfterDecimal){
    int s = 1;
    int e = n;
    double root =0.0;
    while (s<=e) {
        int mid = s+(e-s)/2;
        if (mid*mid == n) {
            return mid;
        }
        if (mid*mid>n) {
            e = mid-1;
        } else{
            s=mid+1;
        }
    }
    double incr = 0.1;
    for (int i = 0; i <=digitsAfterDecimal; i++) {
        while (root*root<=n) {
            root += incr;

        }
        root -= incr;
        incr /=10;
    }
return root;

}
}
