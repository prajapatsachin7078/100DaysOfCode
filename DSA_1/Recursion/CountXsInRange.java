package DSA_1.Recursion;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            int X = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.countX(L, R, X));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countX(int L, int R, int X) {
        // code here
        int count = 0;
        for(int i = L+1;i<R;i++){
            count+=(i>9?checkOnes(i,X):(i==X?1:0));
        }
        return count;
    }
    
    int checkOnes(int L,int X){
        if(L==0)return 0;
        
        if(L%10 == X){
            return 1 + checkOnes(L/10,X);
        }else
            return checkOnes(L/10,X);
    }
    
    // int checkOnes(int L,int X){
    //     int count = 0;
    //     while(L!=0){
    //         if(L%10 == X)
    //             count++;
    //         L/=10;
    //     }
        
    //     return count;
    // }
};