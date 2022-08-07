//approach 1 T => O(log2N) S => O(1)

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n>1 && (n&1)==0){
            n=n>>1;
        }
        return n==1?true:false;
    }
}


//approach 2    T => O(1)    S => (1)
// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n==0){
//             return false;
//         }

//         return floor(log2(n))==ceil(log2(n))?true:false;
//     }
// }