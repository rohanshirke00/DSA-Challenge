// class Solution {
//     public boolean checkIfExist(int[] arr) {
        
//         Set<Integer> set = new HashSet<>();
//         for(int a : arr){
//             if(set.contains(a*2) || (a%2 == 0 && set.contains(a/2)))
//                 return true;
//             set.add(a);
//         }
//         return false;
//     }
    
// }




//binary search

class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Arrays.sort(arr);
        
        for(int i = 0; i<arr.length; i++){
            
            int res = binarySearch(arr, arr[i]*2);
            if( res != i && res != -1){
                return true;
            }
            
        }
        
        return false;
    }
    
    static int binarySearch(int[] arr, int target){
        
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }
    
}