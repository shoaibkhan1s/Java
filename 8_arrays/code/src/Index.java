
public class Index
{
	public static void main(String[] args) {
	    int[] arr = {0,2,0,3,1,0,1,3,2,1};
	    System.out.println(trap(arr));
		System.out.println("Hello World");
	}
	
	    public static int trap(int[] arr) {
        int leftMax =0;
        int rightMax = arr.length-1;
        int count =0;
while(leftMax<rightMax){

        for(int i=rightMax;i>leftMax && i>0;i--){
            if(i> 0 && arr[i]>arr[i-1]){
                rightMax = arr[i];
                break;
            }
        }
        for(int i=leftMax;i<rightMax && i<arr.length;i++){
            if(i<arr.length-1  && arr[i]>arr[i+1]){
                leftMax = arr[i];
                break;
            }
        }

        for(int i=0;i<=arr.length-1;i++){
            count += Math.min(leftMax,rightMax)-arr[i];
        }

    }
    return count;
    }
}