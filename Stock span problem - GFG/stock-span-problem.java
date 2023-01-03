//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    /*
    
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int[] stock, int n)
    {
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if(st.size() == 0){
                ans[i] = i+1;
            }
            else if(st.size() > 0 && stock[i] < stock[st.peek()]){
                ans[i] = i - st.peek();
            }
            else if(st.size() > 0 && stock[i] >= stock[st.peek()]){

                while ((st.size() > 0) && (stock[i] >= stock[st.peek()])) {
                    st.pop();
                }
                if(st.empty()){
                    ans[i] = i+1;
                }
                else{
                    ans[i] = i - st.peek();
                }
            
            }
            st.push(i);
        }

        return ans;
    }
    
    */
    
    
    public static int[] calculateSpan(int[] stock, int n){

        // nearest greatest to Left
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if(st.size() == 0){
                span[i] = -1;
            }
            else if(st.size() > 0 && stock[i] < stock[st.peek()]){
                span[i] = st.peek();
            }
            else if(st.size() > 0 && stock[i] >= stock[st.peek()]){
                
                while ((st.size() > 0) && (stock[i] >= stock[st.peek()])) {
                    st.pop();
                }
                if(st.empty()){
                    span[i] = -1;
                }
                else{
                    span[i] = st.peek();
                }
                
            }
            st.push(i);
        }

        for (int i = 0; i < span.length; i++) {
            span[i] = i - span[i];
        }

        return span;

    }
    
}