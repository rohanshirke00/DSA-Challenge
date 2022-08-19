class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int sum = 0;
        
        //reversing the number
        while(temp>0){
            int rem = temp%10;
            sum = sum * 10 + rem;
            temp = temp/10;
        }
        
        //cheking whether original no and reversed no is same or not
        if(sum == x){
            return true;
        }
        return false;
    }
}