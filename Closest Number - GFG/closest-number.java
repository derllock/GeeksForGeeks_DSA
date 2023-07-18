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
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.closestNumber(N,M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int closestNumber(int N , int M) {
        // code here
        double remainder=Math.abs(N%M);
        double res=0;
        double k=Math.abs(M);
        if(remainder<(k/2)){
            if(N>0 || N==0) res=N-remainder;
            else res= N+remainder;
        }
        else if(remainder>(k/2)){
            if(N>0 || N==0)res=N+(k-remainder);
            else res= N-(k-remainder);
        }
        else if(remainder==(k/2)){
            if(N>0 || N==0) res=N+remainder;
            else res= N-remainder;
        }
        return (int)res;
    }
}