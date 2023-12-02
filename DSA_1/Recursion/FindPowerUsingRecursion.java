package DSA_1.Recursion;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();//testcases
        
        while(t-- > 0)
        {
            //input n and p
            int n = sc.nextInt();
            int p = sc.nextInt();
            
            new Solution();
            //calling RecursivePower() method 
            System.out.println(Solution.RecursivePower(n,p));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int RecursivePower(int n,int p)
    {
        // add your code here
        if(p == 0){
            return 1;
        }
        int k = 1;
        return RecursivePower(n,p,k);
        // return n*RecursivePower(n,p-1);
    }
    static int RecursivePower(int n, int p, int val){
        if(p == 0)return val;
        
        return RecursivePower(n,p-1,val*n);
        
    }
 
}
