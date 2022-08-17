class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length-1;
        int n = grid[0].length;
        
        int count=0, p=0;
        
        while(m>=0 && n>p){
            if(grid[m][p]<0){
                m--;
                count = count + n - p;
            }
            else{
                p++;
            }
        }
        return count;
        
        
    }
}