class Solution {
    public int largestAltitude(int[] gain) {
//         int[] ans = new int[gain.length+1];
//         int max=0;
//         for(int i=1; i<ans.length; i++){
//             ans[i] = ans[i-1] + gain[i-1];
//             max = ans[i]>max?ans[i]:max;
//         }
        
        int max=0;
        int runSum=0;
        for(int i=0;i<gain.length; i++){
            runSum = runSum + gain[i];
            if(runSum>max) max = runSum;
        }
        
        return max;
    }
}