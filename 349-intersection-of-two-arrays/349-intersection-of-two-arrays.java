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


//binary search

class Solution {

public int[] intersection(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
 
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i=0; i<nums1.length; i++){
        if(i==0 || (i>0 && nums1[i]!=nums1[i-1])){
            if(Arrays.binarySearch(nums2, nums1[i])>-1){
                list.add(nums1[i]);
            }
        }
    }
 
    int[] result = new int[list.size()];
    int k=0;
    for(int i: list){
        result[k++] = i;
    }
 
    return result;
}
}
