
// linear search O(N)

// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         for(int i=0; i<arr.length; i++){
//             if(k>=arr[i]) k++;
//             else break;
//         }
//         return k;
//     }
// }


//Binary search O(logN)

class Solution {
    public int findKthPositive(int[] arr, int k) {
 
        int s = 0;
        int e = arr.length-1;
        
        while(s<=e){
            int mid = s + (e-s) / 2;
            
            if(arr[mid] - (mid+1) >= k){
                e = mid-1;
            }else{
                s = mid+1;
            }
            
        }
        return s+k;
    }
}