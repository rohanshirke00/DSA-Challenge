class Solution {
    public int findDuplicate(int[] A) {
        
        int[] frequency =  new int[A.length];
        for (int i = 0; i < frequency.length; i++) {
            if(frequency[A[i]] == 0){
                frequency[A[i]]++;
            }
            else{
                return A[i];
            }
        }
        
        return A.length;
        
    }
}