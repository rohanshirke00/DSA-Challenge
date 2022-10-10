//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        int i=0, j=0;
        
        while(j<s.length())
        {
            map.put(s.charAt(j), (map.getOrDefault(s.charAt(j), 0) + 1));

            if(map.size() < k)
            {
                j++;
            }
            else if(map.size() == k)
            {
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }
            else if(map.size() > k)
            {
                while(map.size() > k)
                {
                    if(map.get(s.charAt(i)) == 1)
                    {
                        map.remove(s.charAt(i));
                    }
                    else
                    {
                        map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    }
                    i++;
                }
                j++;
            }

        }

        return maxLen !=  Integer.MIN_VALUE ? maxLen : -1;
    }
}