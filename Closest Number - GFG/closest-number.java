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
        double remainder=Math.abs(N%M); //double cause k is in fraction, causes error 
        double res=0;                   // 4234/2823,k=1411.5 && remainder=1411..... last case will be wrongly implemented if int used
        double k=Math.abs(M);      //sign of divisor does not effect answer but wronly changes if cases
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
        return (int)res;     //double to int
    }
}