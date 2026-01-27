public class linearSearch {
public static void main(String[] args) {
    int[] arr = {4,8,7,512,1,23,78};
    System.out.println(search(arr, 78, 0));
}
 static int search(int[] arr, int target,int index){
    if (index==arr.length) {
        return -1;
    }
    if (arr[index]==target) {
        return index;
    }
    else{
       return search(arr, target, index+1);
    }

 }
}
