
//DP approach

class Solution {
    public int maxSubArray(int[] nums) {
        
        // Initialize currMaxSum & take first element of array from which we start to do sum...
        int maxSum = nums[0];
        
        // Initialize the current sum of our subarray as nums[0]...
        int currSum = nums[0];
        
        // Traverse all the element through the loop...
        for (int i = 1; i < nums.length; i++) {
            // Do sum of elements contigous with curr sum...
            // Compare it with array element to get maximum result...
            currSum = Math.max(currSum + nums[i], nums[i]);
            
            // Compare current sum and max sum.
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;      // return the contiguous subarray which has the largest sum...
    }
}



// Kadanes approach

// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int n = nums.length;
//         int currentSum = 0;
//         int max=Integer.MIN_VALUE;
        
        
//         for(int i=0; i<n; i++){
            
//             currentSum = currentSum + nums[i];
            
//             max = currentSum>max?currentSum:max;
            
//             if(currentSum < 0){
//                 currentSum = 0;
//             }
//         }
        
//         return max;
//     }
// }