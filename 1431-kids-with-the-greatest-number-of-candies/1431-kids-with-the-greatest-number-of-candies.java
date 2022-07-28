import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> list = new ArrayList<Boolean>(n);
        // boolean[] ans = new boolean[n];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = candies[i]>max?candies[i]:max;
        }
        
        for(int i=0; i<n; i++){
            list.add((candies[i]+extraCandies) >= max);
        }
        return list;
        
    }
}