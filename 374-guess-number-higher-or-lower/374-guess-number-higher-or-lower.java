/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int notFound = 0;
        if(n<1) return notFound;
        
        int start = 1;
        int end = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            int apiNumber = guess(mid);
            
            if(apiNumber == -1){
                end = mid-1;
            }else if(apiNumber == 1){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return notFound;
        
    }
}