
import java.util.ArrayList;

public class linearSearchOnMultipleOccurence {
    public static void main(String[] args) {
         int[] arr = {4,8,7,512,4,23,4};
       //  findIndex1(arr, 4, 0);

    // ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<Integer> returnedList = findIndex2(arr, 4, 0, list);
    //     System.out.println(returnedList);

    ArrayList<Integer> returnedList = findIndex3(arr, 4, 0);
    System.out.println(returnedList);
    }

    //method 1
//    static ArrayList<Integer> list = new ArrayList<>();
//     static void findIndex1(int[] arr, int target,int index){
//         if(index==arr.length){
//             return; 
//         }
//         if(arr[index] == target){
//         list.add(index);
//         }
//         findIndex1(arr, target, index+1);
//     }

//method 2 (if we don't want a separate variable list outside the function)
//  static ArrayList<Integer> findIndex2(int[] arr,int target,int index,ArrayList<Integer> list){
//     if (index == arr.length) {
//         return list;
//     }

//     if(arr[index]==target){
//         list.add(index);
//     }
//     return findIndex2(arr, target, index+1, list);
    
//  }  


//method 3 (if we don't want to pass arraylist inside the parameter as well as outside the function)

static ArrayList<Integer> findIndex3(int[] arr, int target, int index){
    ArrayList<Integer> list = new ArrayList<>(); //this will create new arraylist at every function call
    if(index == arr.length){
        return list;
    }
    if (arr[index] == target) {
        list.add(index);
    }

    //ab agar hum direct hi list ko return karenge to wo empty ya fir sahi nhi aayegi because every function call me ek nayi arraylist create o rhi hai..
    
//to is se bachne ke liye hum arraylist ko bottom to top pass karenge aur har function se puchte jayenge ki kya tumne jo list create kri thi uske andar koi index add kra tha agar ha to hum us index apni arraylist me add krwa lenge...

ArrayList<Integer> answerBeforeCall = findIndex3(arr, target, index+1);
list.addAll(answerBeforeCall);

return list;

}
}
