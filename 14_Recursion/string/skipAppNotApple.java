
public class skipAppNotApple {
public static void main(String[] args) {
String ans1 = skipApp("bappsdbapplefsf");
String ans2 = skipApp("bappsdbappfsf");
System.out.println(ans1);   
System.out.println(ans2);   
}
static String skipApp(String up){
    if (up.isEmpty()) {
        return "";
    }

    if (up.startsWith("app") && !up.startsWith("apple")) {
        return skipApp(up.substring(3));
    }
    else{
        return up.charAt(0) + skipApp(up.substring(1));
    }

}
}
