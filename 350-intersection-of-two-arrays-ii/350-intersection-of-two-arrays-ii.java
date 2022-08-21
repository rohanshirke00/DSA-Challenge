
// Code 1 -> O(nlogn) time without extra space

class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                nums1[k++] = nums1[i];
                i++;j++;
            }
            else if(nums1[i]>nums2[j])
                j++;
            else
                i++;
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}



// Code 1 -> O(n) time and extra space 100% faster
// class Solution {

//     public int[] intersect(int[] nums1, int[] nums2) {
//         int map[] = new int[1001];
//         int res[] = new int[1001];
//         int count = 0;
//         for(int i:nums1)
//             map[i]++;
//         for(int i:nums2){
//             if(map[i]>0){
//                 res[count++]=i;
//                 map[i]--;
//             }
//         }
//         return Arrays.copyOfRange(res,0,count);
//     }
// }





// public class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         ArrayList<Integer> result = new ArrayList<Integer>();
//         for(int i = 0; i < nums1.length; i++)
//         {
//             if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i])+1);
//             else map.put(nums1[i], 1);
//         }
    
//         for(int i = 0; i < nums2.length; i++)
//         {
//             if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
//             {
//                 result.add(nums2[i]);
//                 map.put(nums2[i], map.get(nums2[i])-1);
//             }
//         }
    
//        int[] r = new int[result.size()];
//        for(int i = 0; i < result.size(); i++)
//        {
//            r[i] = result.get(i);
//        }
    
//        return r;
//     }
// }