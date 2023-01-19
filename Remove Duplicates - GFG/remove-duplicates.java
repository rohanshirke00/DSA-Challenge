//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
       
       HashMap<Character,Integer> map = new HashMap<>();
       String ans="";
       for(int i=0; i<S.length(); i++){
           
          char ch = S.charAt(i);
          if(map.containsKey(ch)){
              continue;
          }
          else{
              ans += ch;
          }
          map.put(ch,map.getOrDefault(ch,0) + 1);
       }
       
       return ans;
       
    }
}