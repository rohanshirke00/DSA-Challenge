
// HashSet Time complexity: O(n)

// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         HashSet<Integer> set1 = new HashSet<Integer>();
//         for(int i: nums1){
//             set1.add(i);
//         }

//         HashSet<Integer> set2 = new HashSet<Integer>();
//         for(int i: nums2){
//             if(set1.contains(i)){
//                 set2.add(i);
//             }
//         }

//         int[] result = new int[set2.size()];
//         int i=0;
//         for(int n: set2){
//             result[i++] = n;
//         }

//         return result;
//     }
// }


// Binary search Time complexity: O(nlogn)

import java.util.*;
class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
            
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for(Integer num : nums1){
            
            if(binarySearch(nums2,num)){
                set.add(num);
            }
        }
        
        int[] ans = new int[set.size()];
        int i=0;
        for(int item : set){
            ans[i++] = item;
        }
        
        return ans;
        
    }
    
    static boolean binarySearch(int[] arr, int num){
        int start =0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==num){
                return true;
            }else if(arr[mid] > num){
                end = mid-1;
            }else{
                start = mid+1;
            }
            
        }
        return false;
    }

}
