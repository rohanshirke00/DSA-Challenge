class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        
        // we know that sqrt(x) = y
        // y*y = x
        
        while(start<=end){
            //mid point
            long mid = start + (end-start)/2;
            
            //checking square of mid gives us x or not
            if(mid*mid==x){
             
                return (int)mid;
            
            }else if(mid*mid < x){
                start = mid+1;
            }else{
                end = mid-1;
            }
            
        }
        return (int)end;
        
    }
}