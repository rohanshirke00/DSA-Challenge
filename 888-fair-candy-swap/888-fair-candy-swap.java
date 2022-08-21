// approach 1

// class Solution {

//     public int[] fairCandySwap(int[] A, int[] B) {
    
//         int diff = (IntStream.of(A).sum() - IntStream.of(B).sum()) / 2;
//         Set<Integer> set = new HashSet<>();
//         for (int b : B)
//           set.add(b);
    
//         for (int a : A)
//           if (set.contains(a - diff))
//             return new int[] {a, a - diff};

//         return null;
//     }

// }



class Solution {
    
    private int binarySearch(int[] arr,int target){ 
        int s=0,e = arr.length-1;
        
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
            
        }
        return -1;
    }
    
    public int[] fairCandySwap(int[] a, int[] b) { //a = Alice , b=Bob
        int suma=0,sumb=0;
        for(int i=0;i<a.length;i++)
            suma+=a[i];
        for(int i=0;i<b.length;i++)
            sumb+=b[i];
        
        int diff = (suma-sumb)/2;
        
        Arrays.sort(a);
        for(int num:b){
            if (binarySearch(a,num+diff) !=-1) return new int[]{num+diff,num};
        }
        
        return null;
        
    }
}