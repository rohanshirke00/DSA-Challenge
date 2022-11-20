//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a1[] = in.readLine().trim().split("\\s+");
            int a[] = new int[n];
            for(int i = 0;i < n;i++)
                a[i] = Integer.parseInt(a1[i]);
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.leftSmaller(n, a);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    
    //brute force
//     static List<Integer> leftSmaller(int n, int arr[])
//     {
//         List<Integer> list = new ArrayList<>();

//         list.add(-1);

//         for (int i = 0; i < n; i++) {
//             for (int j = i-1; j >=0; j--) {
//                 if(arr[j] < arr[i]){
//                     list.add(arr[j]);
//                     break;
//                 }
//             }
//         }

//         return list;
//     }


    //optimal solution
    static List<Integer> leftSmaller(int n, int arr[])
    {
        List<Integer> list = new ArrayList<>();


        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if(st.size() == 0){
                list.add(-1);
            }
            else if(st.size() > 0 && st.peek() < arr[i]){
                list.add(st.peek());
            }
            else if(st.size() > 0 && st.peek() >= arr[i]){

                while ((st.size() > 0) && (st.peek() >= arr[i])) {
                    st.pop();
                }
                if(st.empty()){
                    list.add(-1);
                }
                else{
                    list.add(st.peek());
                }
            
            }
            st.push(arr[i]);
        }

        return list;

    }

}