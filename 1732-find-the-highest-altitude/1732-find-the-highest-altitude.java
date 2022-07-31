class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length+1];
        int max=0;
        for(int i=1; i<ans.length; i++){
            ans[i] = ans[i-1] + gain[i-1];
            max = ans[i]>max?ans[i]:max;
        }
        
        return max;
    }
}