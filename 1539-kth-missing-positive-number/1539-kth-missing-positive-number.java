class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i=0; i<arr.length; i++){
            if(k>=arr[i]) k++;
            else break;
        }
        return k;
    }
}