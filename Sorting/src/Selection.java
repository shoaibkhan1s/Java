import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
	    int[] arr = {5,4,3,2,1};
	    selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static public void selection(int[] arr){
	    for(int i=0;i<arr.length;i++){
            //find max element from the array and then swap it from last
	        int last = arr.length -i-1;
	        int maxIndex = getMax(arr,0,last);
	        swapped(arr,maxIndex,last);
	    }
	}
	static public int getMax(int[] arr, int start, int end){
	    int max=start;
	    for(int i=start;i<=end;i++){
	        if(arr[max]<arr[i]){
	            max= i;
	        }
	    }
	    return max;
	}
	static void swapped(int[] arr,int first,int second){
	    int temp = arr[first];
	    arr[first] = arr[second];
	    arr[second] = temp;
	} 
}
