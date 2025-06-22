public class rotationCountInRotatedArr {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,8,10,15,20};
        int rotationCount = rotation(arr);
        System.out.println(rotationCount);

    }

    static int rotation( int[] arr){
       int pivot = pivot(arr);
            return pivot + 1;    //if pivot = -1 means array in not rotated it return -1+1=0;

    }


    static int pivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            //4 cases over here
            if(mid<end && arr[mid]>arr[mid + 1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;

            }

            if(arr[start] >= arr[mid]){
                end=mid-1;
            }

            else{
                start=mid+1;
            }

        }
        return -1;
    }
}
