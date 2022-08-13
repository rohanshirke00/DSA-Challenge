class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = {-1, -1};
        
//         int start = firstIndex(nums, target, true);
//         int end = firstIndex(nums, target, false);
        
//         ans[0] = start;
//         ans[1] = end;
        
        
        ans[0] = firstIndex(nums, target, true);
        
        if(ans[0] != -1){

            ans[1] = firstIndex(nums, target, false);
                    
        }
        
        return ans;

    }
    
    int firstIndex(int arr[], int target, boolean indexFirst){
        
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        
        while(start<=end){
            
            int mid = start + (end-start)/2;
            
            if(target > arr[mid])
            {
                start = mid+1;
            }
            else if(target < arr[mid])
            {
                end = mid-1;
            }
            else
            {
                ans = mid;
                if(indexFirst==true){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            
        }
        return ans;
        
    }
    
}