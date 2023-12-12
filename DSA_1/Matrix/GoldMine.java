package DSA_1.Matrix;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        try (Scanner sc = new Scanner(System.in)) {
            int t= sc.nextInt();
            while(t-- > 0){
                // String inline[] = in.readLine().trim().split("\\s+");
                int n = sc.nextInt();
                int m = sc.nextInt();
                // String inline1[] = in.readLine().trim().split("\\s+");
                int M[][] = new int[n][m];
                for(int i = 0;i < n*m;i++){
                    M[i/m][i%m] = sc.nextInt();
                }
                
                System.out.println(Solution.maxGold(n, m, M));
            }
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
         for(int j=1;j<m;j++){
            for(int i=0;i<n;i++){
                int sum=0;
                if(i-1 >=0 && j-1>=0) sum=Math.max(M[i-1][j-1],sum);
                if(i+1 <n && j-1>=0) sum=Math.max(sum,M[i+1][j-1]);
                if(j-1>=0)  sum=Math.max(sum,M[i][j-1]);
                M[i][j]+=sum;
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,M[i][m-1]);
            
        }
        return ans;
    }
    
}