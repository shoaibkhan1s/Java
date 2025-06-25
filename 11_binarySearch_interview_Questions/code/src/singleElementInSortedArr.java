//leetcode 540

public class singleElementInSortedArr {
public static void main(String[] args){
    int[] arr = {3,3,7,7,10,11,11};
int ans = singleElement(arr);
System.out.println(ans);
}
static int  singleElement(int[] arr){
int n = arr.length-1;

if(arr[0]!=arr[1]){
    return arr[0]; //if start element is unique
}

if(arr[n]!=arr[n-1]){
    return arr[n]; // means last element is unique.
}
int start=1;
int end= n-1; //because we already checks edge cases...
while(start<=end){
    int mid = start+(end-start)/2;
    if(arr[mid]!=arr[mid+1] && arr[mid]!= arr[mid-1]){
        return arr[mid];
    }

    if((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1])){
        start =mid+1; //means unique element is right side
    } else{
        end =mid-1;  //means unique element in left side
    }
}

return -1;
}
}
