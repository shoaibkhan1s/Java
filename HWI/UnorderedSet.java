import java.util.HashMap;

public class UnorderedSet {
  
public static void main(String[] args) {
    int[] a = {2,4,6,8};
    int m = 2;
    int d = 4;
    System.out.println(solve(a,d,m));

}
private static int solve(int[] n,int d,int m){
    HashMap<String,Integer> map = new HashMap<>();
    int ans = 0;
    for(int x:n){
        int remD = x%d;
        int remM = x%m;
        int requiredD = (d-remD)%d;
        String requString = requiredD + "," + remM;
        if(map.containsKey(requString)){
            ans = ans + map.get(requString);
        }
        String puString = remD+","+remM;
        if(map.containsKey(puString)){
            map.put(puString, map.get(puString)+1);
        }else{
            map.put(puString, 1);
        }
    }
    return  ans;
}
}
