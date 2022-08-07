class Solution {
    
    public boolean check(int[][] mat,int[][] target){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    
    public int[][] rotate(int[][] mat){
        int n = mat.length;
        //transpose
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        //reverse(swapping)
        int start = 0;
        int end = n-1;
        while(start<=end){
            for(int i=0; i<n; i++){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
            }
            start++;
            end--;
        }
        
        return mat;
    }
    
    
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<4; i++){
            if(check(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
        
    }
}