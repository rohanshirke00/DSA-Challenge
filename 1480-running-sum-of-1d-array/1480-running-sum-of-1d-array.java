class Solution {
    public int[] runningSum(int[] nums) {
        
        int n = nums.length;
        int sum = nums[0];
        for(int i = 1; i<n; i++){
            nums[i] = sum + nums[i];
            sum = nums[i];
        }
        return nums;
    }
}