class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sums= n%2!=0 ? mat[n/2][n/2] : 0 ;
        for(int i=0;i<n;i++){
            if(i!=(n-1-i))
             sums+=(mat[i][i]+mat[i][n-1-i]);
        }
        return sums;
    }
}