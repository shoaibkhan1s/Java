import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
  public  static  void bubbleSort(int[] arr){
      boolean swapped;
      //run the steps n-1 times
      for(int i=0;i<arr.length;i++){
          swapped=false;
        //for each step max item come at last respective index
          for(int j=1;j<arr.length-i;j++){
              
            //swap if the item is smaller then the previous item
              if(arr[j]<arr[j-1]){
                  //swap
                  int temp= arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
                  swapped=true;
              }
          }
          
          //if array is already sorted then below code is run just after 1st pass of 1st step...
          if(!swapped){
              break;
          }
      }

    }
}
