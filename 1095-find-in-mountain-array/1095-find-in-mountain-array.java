/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int start = 0;
        int end = mountainArr.length()-1;
        int peakIndex = peakIndexInMountainArray(mountainArr);
        
        int firstHalf = orderAgnosticBinarySearch(mountainArr,target,start,peakIndex);
        
        if(firstHalf != -1){
            return firstHalf;
        }
        return orderAgnosticBinarySearch(mountainArr,target,peakIndex+1,end);
    }
    
    
    
    //Binary search O(LogN)

    public int peakIndexInMountainArray(MountainArray mountainArr) {
        
        int s = 0;
        int e = mountainArr.length()-1;

        while(s<e){
            int mid = s + (e-s) / 2;   
            if(mountainArr.get(mid) < mountainArr.get(mid+1)){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }   
        return s; // return e
    }

    
    
    static int orderAgnosticBinarySearch(MountainArray mountainArr, int target, int start, int end){
        
        if(mountainArr.get(start) < mountainArr.get(end)){
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target==mountainArr.get(mid)){
                    return mid;
                }else if(target < mountainArr.get(mid)){
                    end = mid - 1;
                }else{
                    start = mid+1;
                }
            }
            return -1;
        }else{
            
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target==mountainArr.get(mid)){
                    return mid;
                }else if(target > mountainArr.get(mid)){
                    end = mid - 1;
                }else{
                    start = mid+1;
                }
            }
            return -1;
        }
        
    }
    
}