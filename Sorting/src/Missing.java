//leetcode 268,448,287
// ask in amazon = 268
//ask in google and microsoft = 448,287

//Solution of 268 :-
class Missing {
    public static void main(String[] args) {
        int[] arr = {0,2};
        int ans =  missingNumber(arr);
        System.out.println(ans);
    }

       static void swap(int []arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
  static  public int missingNumber(int[] arr) {
    //sorting the array :-
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if( correctIndex<arr.length &&  arr[i] != arr[correctIndex] ){
                swap(arr,i,correctIndex);
            } else{
                i++;
            }
        }
        
        //search for first missing number :- 
      int j=0;
        while(j<arr.length){
            
            if(arr[j]==j){
                j++;
            }else{
            return j;
            }

        }
        return arr.length;
}
}





//Solution of 448 and 287 :-

//class Solution {
//    static void swap(int []arr,int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//
//    static  public List<Integer> findDisappearedNumbers(int[] arr) {
//        int i=0;
//        while(i<arr.length){
//            int correctIndex = arr[i]-1;
//            if(  arr[i] != arr[correctIndex] ){
//                swap(arr,i,correctIndex);
//            } else{
//                i++;
//            }
//        }
//        List<Integer> ans = new ArrayList<>();
//
//        // searching missing number
//        for(int j=0;j<arr.length;j++){
//            if(arr[j]!=j+1){
//                ans.add(j+1);
//            }
//        }
//        return ans;
//
//
//    }
//}