public class removeAfromString {
public static void main(String[] args) {
    skip("", "baaccabaafgsd");
    
   String ans = skipRet("baaacdfgacv");
   System.out.println(ans);

}

static void skip(String p, String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch = up.charAt(0);
    if (ch=='a') {
        skip(p, up.substring(1));
    }else{
        skip(p + ch, up.substring(1));
    }
}


//what if we want return a string dont print inside the function...
static String skipRet(String up){
    if (up.isEmpty()) {
        return "";
    }
    char ch = up.charAt(0);
    if(ch=='a'){
        return skipRet(up.substring(1));
    }
    else{
        return ch + skipRet(up.substring(1));
    }
}
}
