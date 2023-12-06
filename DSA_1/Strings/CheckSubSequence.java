package DSA_1.Strings;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
// import java.util.*;

public class CheckSubSequence{

    public static void main (String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().split(" ");
            String A = S[0];
            String B = S[1];
            Solution ob = new Solution();
            boolean ans = ob.isSubSequence(A,B);
            if(ans)
                System.out.println("True");
            else
                System.out.println("False");
       }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to check if a string is subsequence of other string.
    public boolean isSubSequence(String A, String B)
    {
        //code here
        int i = 0,j=0;
        while(i<A.length() && j<B.length()){
            if(A.charAt(i) == B.charAt(j)){
                i++;j++;
            }else{
                j++;
            }
        }
        
        return (i==A.length());
    }
};