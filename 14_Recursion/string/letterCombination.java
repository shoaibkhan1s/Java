import java.util.ArrayList;

public class letterCombination {
public static void main(String[] args) {
    // letterComb("", "12");
    System.out.println(letterCombRet("", "12").size());
    System.out.println(letterCombCount("", "12"));
}
static void letterComb(String p,String up){
    if (up.isEmpty()) {
        System.out.println(p);
        return;
    }
    int digit = up.charAt(0) - '0';
    for (int i = (digit -1)*3; i < digit*3; i++) {
        char ch =(char)('a' + i);
        letterComb(p+ch, up.substring(1));
    }
}

static ArrayList<String> letterCombRet(String p,String up){
    if (up.isEmpty()) {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }
    int digit = up.charAt(0)-'0';
    ArrayList<String> ans = new ArrayList<>();

    for (int i = (digit-1)*3; i < digit*3; i++) {
        char ch = (char)('a' + i);
        ans.addAll(letterCombRet(p+ch, up.substring(1)));
    }
    return ans;
}


static int letterCombCount(String p,String up){
    int count =0;
    if (up.isEmpty()) {
      return 1;
    }
    int digit = up.charAt(0)-'0';
   
    for (int i = (digit-1)*3; i < digit*3; i++) {
        char ch = (char)('a' + i);
        count += letterCombCount(p+ch, up.substring(1));
    }
    return count;
}
}
