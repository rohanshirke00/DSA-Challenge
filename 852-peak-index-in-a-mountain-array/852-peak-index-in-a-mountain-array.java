//Binary search O(LogN)

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int s = 0;
        int e = arr.length-1;
        
        while(s<=e){
            int mid = s + (e-s) / 2;   
            if(arr[mid] < arr[mid+1]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }   
        return s;
    }
}




//linear search O(N)

// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int i=0;
//         while(arr[i]<arr[i+1]) i++;
//         return i;       
//     }
// }