public class skipApple {
    public static void main(String[] args) {
        skip("", "bdfapplesd");
        String ans = skipRet("bdfapplesdfs");
        System.out.println(ans);
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (up.startsWith("apple")) {
            skip(p, up.substring(5));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skipRet(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (up.startsWith("apple")) {
            return skipRet(up.substring(5));
        } else {
            return ch + skipRet(up.substring(1));
        }
    }
}
