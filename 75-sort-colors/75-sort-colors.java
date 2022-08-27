class Solution {
    public void sortColors(int[] arr) {
        
        if(arr.length == 1 || arr.length == 0){
            return;
        }
        
        int l = 0, m = 0, h = arr.length-1;
        
        
        while(m<=h){
            if(arr[m]==0){
                int tmp = arr[l];
                arr[l] = arr[m];
                arr[m] = tmp;
                l++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            }else{
                int tmp = arr[m];
                arr[m] = arr[h];
                arr[h] = tmp;
                h--;
            }
        }
    }
    
}