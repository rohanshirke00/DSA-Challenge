class Solution {
    public int specialArray(int[] nums) {
        
        int total = nums.length;
        
        int[] buckets = new int[1001];
        
        for(int num : nums){
            buckets[num]++;
        }
        for(int i=0; i<1001; i++){
            if(i==total){
                return i;
            }
            total -= buckets[i];
        }
        
        return -1;
        
    }
}