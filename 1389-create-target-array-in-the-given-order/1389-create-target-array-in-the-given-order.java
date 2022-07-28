class Solution {
    
//     public void solve(int[] target, int value, int index){
//             for(int i=target.length-1; i>index; i--){
//                 target[i] = target[i-1];
//             }
//             target[index] = value;
            
//     }
    
    
        

//     public int[] createTargetArray(int[] nums, int[] index) {
//         int[] target = new int[index.length];
//         for(int i=0; i<index.length; i++){
//             solve(target,nums[i],index[i]);
            
//         }
        
//         return target;
//     }
    
    
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];    
    
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){

            list.add(index[i], nums[i]);

        }
    
        for(int i=0; i<nums.length; i++){
        
            target[i] = list.get(i);
        
        }
        return target;
    }
    
}