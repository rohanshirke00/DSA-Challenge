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