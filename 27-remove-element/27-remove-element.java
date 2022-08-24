class Solution {
    public int removeElement(int[] A, int val) {
        
        int begin=0;
        for(int i=0;i<A.length;i++)
            if(A[i]!= val) 
                A[begin++]=A[i];
        return begin;
    
    }
}