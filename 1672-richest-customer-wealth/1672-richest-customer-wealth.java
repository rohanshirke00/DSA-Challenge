class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int ans = Integer.MIN_VALUE;
            
        //using enhanced forloop
        for(int[] peoples : accounts){
            int sum = 0;
            for(int num : peoples) sum += num;
            ans = sum>ans?sum:ans;
        }
        return ans;
        
        
        
        //method 2 using normal forloop
        
//         int ans = Integer.MIN_VALUE;
//         for(int i=0; i<accounts.length; i++){
//             int sum = 0;
//             for(int j=0; j<accounts[i].length; j++){ 
//                 sum += accounts[i][j];
//             }
//             ans = sum>ans?sum:ans;
//         }
//         return ans;
        
    }
}