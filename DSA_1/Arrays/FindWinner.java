package DSA_1.Arrays;

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

public class FindWinner
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[n];
            for(int i = 0; i < n; i++)
                A[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(Solution.findWinner(n, A));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int findWinner(int n, int A[]){
        // code here
        int xor = findXor(0,A,0);
        // base case
        if(xor == 0||n%2 == 0){
            return 1;
        }
        else{
            return 2;
        }
    }
    static int findXor(int i, int arr[], int xor){
        if(i == arr.length){
            return xor;
        }
        xor ^= arr[i];
        return findXor(++i,arr,xor);
    }
}
