//find no. of nos. which contains even numbers of digits
public class EvenDigits {
    public static void main(String[] args) {
        int[] num = {18, 456, 2569, 12645, 48};
        int ans = findNumbers(num);
        System.out.println(ans);
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //function for checking digits is even or odd
    static boolean even(int num) {
        int numberOfDigits = digits2(num);
        return (num % 2 == 0);
    }

    //funtions for counting number of digits

//    static int digits(int num){

//    if(num<0){
//        num=num*-1;
//    }

    //if(num==0){
 //   return 1;
// }
//        int count=0;
//        while(num>0){
//            count++;
//            num = num/10;
//        }
//        return count;
//    }
//}

//best funtions for counting number of digits
static int digits2(int num) {
        if(num<0){
            num=num*-1;
        }

    if(num==0){
       return 1;
 }

    return (int) (Math.log10(num)) + 1;
}
}