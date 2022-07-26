class Solution {
    public int[] runningSum(int[] nums) {
        
        int n = nums.length;
        
        //method 1
        // int sum = nums[0];
        // for(int i = 1; i<n; i++){
        //     nums[i] = sum + nums[i] + nums[i-1];
        //     sum = nums[i];
        // }
        
        
        //method 2
        for(int i = 1; i<n; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        
        
        
        return nums;
    }
}