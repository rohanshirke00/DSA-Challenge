class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr = new ArrayList<Integer>();
        
        for(int i=0; i<matrix.length; i++){
            int minIdx = 0;
            int min = matrix[i][0];
            
            for(int j=0; j<matrix[i].length; j++){
                
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                    minIdx = j;
                }
                
            }
            
            boolean isLucky = true;
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][minIdx] < matrix[j][minIdx]){
                    isLucky = false;
                    break;
                }
            }
            if(isLucky){
                arr.add(matrix[i][minIdx]);
            }
            
        }
        
        return arr;
    }
}