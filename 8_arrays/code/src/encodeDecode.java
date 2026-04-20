import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class encodeDecode {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("VeryLongStringWithoutAnySpacesOrSpecialCharactersRepeatedManyTimesVeryLongStringWithoutAnySpacesOrSpecialCharactersRepeatedManyTimes");
        // strs.add("Hello");
        // strs.add("World");
        String estr = encode(strs);
        System.out.println(estr);
        List<String> list = decode(estr);
        System.out.println(list);
    }

    

     public static String encode(List<String> strs) {
        
            StringBuilder sb = new StringBuilder();
            for(String str: strs){
                sb.append(str.length()).append("#").append(str);
            }
            return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();
            int i =0;
int j = 0;
            while(i<str.length()){
                j = i;
                while (str.charAt(j)!='#') {
                    j++;
                }
                int length = Integer.parseInt(str.substring(i, j));
                list.add(str.substring(j+1, j+1+length));
                i = j+1+length;

            }
            return list;
    }
}
