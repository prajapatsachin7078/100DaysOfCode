package DSA_1.Strings;

//{ Driver Code Starts
//Initial Template for Java

// import java.util.*;
import java.io.*;
// import java.lang.*;

public class IsPalindromeNum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            System.out.println(Solution.isPalin(n)?1:0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    // Complete the function
    // N: input element
    // Approach: 1
    // static boolean isPalin(int N)
    // {
    //     int res=0;
    //     return reverse(N, res)==N;
    // }
    // static int reverse(int N, int res)
    // {
    //     if (N == 0) {
    //         return res;
    //     }
        
    //     // int lastDigit = N % 10;
    //     res = res * 10 + N % 10;
        
    //     return reverse(N / 10, res);
    // }
    
        // Approach: 1
    static boolean isPalin(int N)
    {
        // Check if the number is palindrome or not
        //You may use a helper function if you like
        return isPalin(N,N,0);
    }
    
    static boolean isPalin(int n , int hold, int toCheck){
        if(n<=0){
            return hold == toCheck;
        }
        toCheck = toCheck*10 + n%10;
        return isPalin(n/10,hold,toCheck);
    }
}