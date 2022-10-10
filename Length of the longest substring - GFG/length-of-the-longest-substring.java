//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        int i=0, j=0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(j<S.length())
        {
            map.put(S.charAt(j), map.getOrDefault(S.charAt(j), 0) + 1);
            if(map.size() == j-i+1)
            {
                ans = Math.max(ans, j-i+1);
                j++;
            }
            else if(map.size() < j-i+1)
            {
                while(map.size() < j-i+1)
                {
                    if(map.get(S.charAt(i)) == 1)
                    {
                        map.remove(S.charAt(i));
                    }
                    else
                    {
                        map.put(S.charAt(i), map.get(S.charAt(i)) - 1);
                    }
                    i++;
                }
                j++;
            }
        }

        return ans;
    }
}