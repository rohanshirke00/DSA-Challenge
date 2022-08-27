//Brute force T -> O(N^2)

// class Solution {
//     public int maxProfit(int[] arr) {
//         int max = Integer.MIN_VALUE;
//             for (int i = 0; i < arr.length; i++) {
//                 for (int j = i+1; j < arr.length; j++) {
//                     if(arr[j]>arr[i]){
//                         max = Math.max(max, arr[j] - arr[i]);
//                     }
//                 }
//             }
//             return max;
//     }
// }


// optimal T -> O(N)

class Solution {
    public int maxProfit(int[] arr) {
        int max = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            
            minPrice = Math.min(minPrice, arr[i]);
            max = Math.max(arr[i] - minPrice , max);
            
        }
        
        return max;
    }
}