/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==0) return 0;
        int start = 1;
        int end = n;
        int fbv = -1;
        
        while(start <= end) {
            
            int mid = start + (end-start)/2;
            
            if(isBadVersion(mid)){
                fbv = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
        }
        return fbv;
    }
}