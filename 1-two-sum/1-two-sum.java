//brute force T => O(N^2) S => O(1)

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i =0; i< nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(target== nums[i] + nums[j]) return new int[] {i,j};
//             }
//         }
//         return null;
//     }
// }


//optimized approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        Map<Integer, Integer> map =new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            
            if(map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i],i);
            
        }
        return result;
        
    }
}