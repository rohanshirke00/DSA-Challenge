class Solution {
    public int[] shuffle(int[] nums, int n) {

        //brute-force approach
        
        //time & space complexity is O(n)
        
        int[] ans = new int[2*n];
        int j=0;
        for(int i=0; i<2*n; i+=2,j++){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
        }
        return ans;
        
        
        
        //optimise approach to make space complexity to O(1)
//         for(int i=0; i<n; i++){
//             nums[i+n] = nums[i] * 10000 + nums[i+n];
            
//         }

//         for(int i=0; i<n; i++){
//             nums[2*i] = nums[i+n]/10000;
//             nums[2*i+1] = nums[i+n]%10000;
            
//         }
//         return nums;
        
        
        
        
        
    }
}