//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    
    public static long[] nextLargerElement(long[] arr, int n) {
         
        long[] ans = new long[n];

        Stack<Long> s = new Stack<>();

        for (int i = n-1; i >= 0; i--) {
            if(s.size() == 0){
                ans[i] = -1;
            }
            else if(s.size() > 0 && s.peek() > arr[i]){
                ans[i] = s.peek();
            }
            else if(s.size() > 0 && s.peek() <= arr[i]){

                while ((s.size() > 0) && (s.peek() <= arr[i])) {
                    s.pop();
                }
                if(s.empty()){
                    ans[i] = -1;
                }
                else{
                    ans[i] = s.peek();
                }
            
            }
            s.push(arr[i]);
        }

        return ans;

    }
    
    
}