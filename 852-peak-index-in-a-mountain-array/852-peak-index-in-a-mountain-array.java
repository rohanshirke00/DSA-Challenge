//Binary search O(LogN)

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int s = 0;
        int e = arr.length-1;
        int ans=-1;
        while(s<e){
            int mid = s + (e-s) / 2;   
            if(arr[mid] < arr[mid+1]){
                ans = mid+1;
                s = mid+1;
            }
            else{
                ans = mid;
                e = mid;
            }
        }   
        return ans;
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