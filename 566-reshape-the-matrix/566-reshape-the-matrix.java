// class Solution {
//     public int[][] matrixReshape(int[][] mat, int r, int c) {
//         if(mat.length*mat[0].length != r*c){
//             return mat;
//         }
//         int[][] arr = new int [r][c];
//         List<Integer> list = new ArrayList<>();
        
//         for(int i=0; i<mat.length; i++){
//             for(int j=0; j<mat[i].length; j++){
//                 list.add(mat[i][j]);
//             }
//         }
        
//         int k=0;
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr[i][j] = list.get(k);
//                 k++;
//             }
//         }
        
//         return arr;
//     }
// }




class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c){
            return mat;
        }
        int[][] arr = new int [r][c];
        
        for(int i=0; i<r*c; i++){
            arr[i/c][i%c] = mat[i/mat[0].length][i%mat[0].length];
        }
        
        return arr;
    }
}