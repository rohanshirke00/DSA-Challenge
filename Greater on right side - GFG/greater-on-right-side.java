//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().nextGreatest(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    
    /*
    void nextGreatest(int arr[], int n) {
        
        int max = arr[n-1];
        arr[n-1] = -1;
        for(int i=n-2; i>=0; i--)
        {
            if(arr[i]>max)
            {
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            }
            else
            {
                arr[i] = max;
            }
        }
    }
    */
    void nextGreatest(int arr[], int n) {
        
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        arr[n-1] = -1;
        for(int i=n-2; i>=0; i--)
        {
            if(st.size() == 0)
            {
                arr[i] = -1;
                st.push(arr[i]);
            }
            else if(arr[i] > st.peek())
            {
                int val = st.pop();
                st.push(arr[i]);
                arr[i] = val;
            }
            else
            {
                arr[i] = st.peek();
            }
        }
        
    }
    
}