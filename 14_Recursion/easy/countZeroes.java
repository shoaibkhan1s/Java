public class countZeroes {
public static void main(String[] args) {
    System.out.println(count(200020, 0));
}
static int count(int n,int count){
    if (n==0) {
        return count;
    }
    if (n%10==0) {
       return count(n/10,count+1);
    }
   return count(n/10,count);
}
}
