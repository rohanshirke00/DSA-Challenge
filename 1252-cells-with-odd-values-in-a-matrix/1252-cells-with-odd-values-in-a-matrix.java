// class Solution {
//     public int oddCells(int m, int n, int[][] indices) {
//         int [][] ans = new int[m][n];
//         for(int i=0; i<indices.length; i++){
//             for(int j=0; j<n; j++){
//                 ans[indices[i][0]][j]++;
//             }
//             for(int j=0; j<m; j++){
//                 ans[j][indices[i][1]]++;
//             }
            
//         }
        
//         int count = 0;
        
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 if(!(ans[i][j]%2==0)) count ++;
//             }
//         }
//         return count;
        
//     }
// }


class Solution {
public int oddCells(int m, int n, int[][] indices) {
int[] r=new int[m];
int[] c=new int[n];

    int len=indices.length;
    for(int i=0;i<len;i++){
        r[indices[i][0]]++;
        c[indices[i][1]]++;
        
        
    }
    int[][] arr=new int[m][n];
    int count=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=r[i]+c[j];
            if(arr[i][j]%2!=0){
                count++;
            }
        }
    }
   
    return count;
}
}