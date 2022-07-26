class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
       
        //method 1
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        
        //method 2
        // for(int i=0; i<n*2; i++){
        //     if(i<n) ans[i] = nums[i];
        //     else ans[i] = nums[i-n];
        // }
        return ans;
    }
}