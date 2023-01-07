//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        int k = pat.length();
        int count = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < k ; i++)
            hm.put(pat.charAt(i), hm.getOrDefault(pat.charAt(i), 0) + 1);
        
        HashMap<Character, Integer> hmText = new HashMap<>();
        int i = 0, j = 0;
        while(j < txt.length()){
            char start = txt.charAt(i);
            char end = txt.charAt(j);
            
            if(hm.containsKey(end))
                hmText.put(end, hmText.getOrDefault(end, 0) + 1);
            else {
                j++;
                i = j;
                hmText.clear();
                continue;
            }
                
            if(j - i + 1 == k){
               if(hmText.equals(hm))
                    count++;
                hmText.replace(start, hmText.get(start) - 1);
                i++;
            }
            j++;
        }
            
        return count;
    }
    
    
}