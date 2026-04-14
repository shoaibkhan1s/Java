// class leetcode3379 {
//     public int[] constructTransformedArray(int[] arr) {
//        int[] result = new int[arr.length];
//         if(arr.length==1){
//         return arr;
            
//         }
       
//         for(int i =0;i<arr.length;i++){
//             int n = arr[i];
//             if (n>=0) {
//             if(n+i<arr.length){
//                 result[i] = arr[n+i];
//             }
//             else{
//                 int k = n+i;
////wraping positive index
//             while(k>=arr.length){
                
//                k = k - arr.length;
//             }
//             result[i] = arr[k];
//         }
//             }
//             else{
//                 if (n+i>=0) {
//                     result[i]  = arr[n+i];
//                 }
//                 else{
//                 int k = n+i;
////wraping negative index
//                 while(k<0){
//                      k = k+arr.length;
//                 }
//                  result[i]  = arr[k];
//                 }
//             }


//         }
//         return result;
//     }
// }


class leetcode3379 {
    public int[] constructTransformedArray(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            int k = (i + arr[i]) % n; //formula for wrapping index
            if(k < 0) k += n;
            result[i] = arr[k];
        }
        return result;
    }
}