//check whether the array sorted in ascending or descending order and then apply binary search...
public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] asc = {-8, -7, -2, 0, 5, 8, 14, 18, 25, 48, 58, 93, 115};
        System.out.println(orderAgnostic(asc,58));
        int [] desc = {784,574,446,245,115,18,12,9,-5,-8,-12,-19};
        System.out.println(orderAgnostic(desc,-8));

    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            //runs when isAscending = false or array is in descending order..
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        //otherwise element not found
        return -1;
    }
}

