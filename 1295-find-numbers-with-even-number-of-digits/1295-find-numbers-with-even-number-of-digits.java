class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int num : nums){
            if(isEvenNo(num)) count++;
        }
        
        return count;
    }
    
    static boolean isEvenNo(int num){
        if(countDigits(num)%2==0) return true;
        return false;
    }
    
    static int countDigits(int num){
        if(num<0) num *= -1;
        // int count = 0;
        // while(num!=0){
        //     count++;
        //     num /= 10;
        // }
        return (int)(Math.log10(num))+1;
    }
    
}