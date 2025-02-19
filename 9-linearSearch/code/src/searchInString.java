public class searchInString {
    public static void main(String[] args) {
        String name = "Shoaib";
        char target = 'i';
        boolean ans = search(name,target);
        System.out.println(ans);
//        boolean ans2 = search2(name,target);
//        System.out.println(ans2);
    }

    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if(target==str.charAt(index)){
                return true;
            }
        }

        //this statement will execute when target element is not found in the array.
        return false;
    }

//usign forEach loop
    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (char ch: str.toCharArray()) {
            if(target==ch){
                return true;
            }
        }

        //this statement will execute when target element is not found in the array.
        return false;
    }
}
