// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;
        
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
                
//                 if(matrix[i][j]==0){
                    
//                     int ind = i-1;
//                     while(ind>=0){
//                         if(matrix[ind][j]!=0){
//                             matrix[ind][j]=-1;
//                         }
//                         ind--;
//                     }
                    
//                     ind = i+1;
//                     while(ind<rows){
//                         if(matrix[ind][j]!=0){
//                             matrix[ind][j]=-1;
//                         }
//                         ind++;
//                     }
                    
//                     ind = j-1;
//                     while(ind>=0){
//                         if(matrix[i][ind]!=0){
//                             matrix[i][ind]=-1;
//                         }
//                         ind--;
//                     }
                    
//                     ind = j+1;
//                     while(ind<cols){
//                         if(matrix[i][ind]!=0){
//                             matrix[i][ind]=-1;
//                         }
//                         ind++;
//                     }
//                 }
                
//             }
//         }
        
//         for(int i=0; i<rows; i++){
            
//             for(int j=0; j<cols; j++){
                
//                 if(matrix[i][j]==-1){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
        
//     }
// }





class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r = matrix.length;
        int c = matrix[0].length;
        
        int[] rows = new int[r];
        int[] cols = new int[c];
        
        for(int i=0; i<r; i++){
            
            for(int j=0; j<c; j++){
                
                if(matrix[i][j]==0){
                    
                    rows[i] = -1;
                    cols[j] = -1;
                    
                }
                
            }
        }
        
        for(int i=0; i<r; i++){
            
            for(int j=0; j<c; j++){
                
                if(rows[i]==-1 || cols[j]==-1){
                    
                    matrix[i][j] = 0;
                
                }
            }
        }
        
    }
}