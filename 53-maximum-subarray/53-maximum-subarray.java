// class Solution{
    
//     public static int maxSubArray(int[] arr) {

//         int currentBest = 0;
//         int overAllBest = arr[0];

//         for(int i=1; i< arr.length; i++){

//             if(currentBest >= 0){
//                 currentBest += arr[i];
//             }
//             else{
//                 currentBest = arr[i];
//             }

//             if(currentBest > overAllBest){
//                 overAllBest = currentBest;
//             }

//         }

//         return overAllBest;
//     }
// }


// Kadanes approach

class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int currentSum = 0;
        int max=Integer.MIN_VALUE;
        
        
        for(int i=0; i<n; i++){
            
            currentSum = currentSum + nums[i];
            
            max = currentSum>max?currentSum:max;
            
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        
        return max;
    }
}