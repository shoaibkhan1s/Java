import java.util.ArrayList;

public class powerOf2 {
public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1073741825));
}

 public static boolean isPowerOfTwo(int n) {
    if(n==0 || n==1){
        return true;
    }
    if (n%2==1) {
        return false;
    }
    System.out.println(check(n/2, 2).getFirst());
        return check(n/2,2).getFirst() == n/2 ? true : false;
    }
    
    public static ArrayList<Integer>  check(int n, int a){
        ArrayList<Integer> list = new ArrayList<>();
        if(n==a){
            list.add(n);
            return list;
        }
         ArrayList<Integer> ans = new ArrayList<>();
        if(a>n){
            list.add(a);
            return list;
        }
        
          ArrayList<Integer> belowCall =  check(n,2*a);
        ans.addAll(belowCall);
        System.out.println(ans);
        return ans;
    }
}
