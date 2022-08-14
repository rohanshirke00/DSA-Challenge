class Solution {
    public int[] twoSum(int[] numbers, int target) {
            
        int start = 0;
        int end = numbers.length-1;
        
        while(start<=end){
            
            int sum = numbers[start] + numbers[end];
            
            if(sum>target){
                end = end - 1;
            }else if(sum<target){
                start = start + 1;
            }else{
                return new int[] {start+1,end+1};
            }
        }
        return new int[] {};
    }
    
}