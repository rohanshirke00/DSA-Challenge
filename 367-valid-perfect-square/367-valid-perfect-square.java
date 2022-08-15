class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1, end = 46340;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid * mid == num)
                return true;
            else if(mid * mid < num)
                start = mid + 1;
            else
                end = mid - 1;
        }
        
        return false;
    }
}