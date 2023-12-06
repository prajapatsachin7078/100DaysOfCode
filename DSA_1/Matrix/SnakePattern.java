package DSA_1.Matrix;
import java.io.*;
import java.util.*;

public class SnakePattern
{
    public static void main(String args[])throws IOException
    {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int n = sc.nextInt();
                int matrix[][] = new int[n][n];
                
                for(int i = 0; i < n; i++)
                {
                    for(int j = 0; j < n; j++)
                     matrix[i][j] = sc.nextInt();
                }
                
                // Solution ob = new Solution();
                ArrayList<Integer> ans = Solution.snakePattern(matrix);
                for (Integer val: ans) 
                    System.out.print(val+" "); 
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends
//User function Template for Java
class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
         ArrayList<Integer> snakePattern = new ArrayList<>();
        int toAdd = 1;
        int col = 0;
        for(int row = 0; row < matrix.length; row++) {
            while(col != -1 && col != matrix[row].length) {
                snakePattern.add(matrix[row][col]);
                col += toAdd;
            }
            
            toAdd *= -1;
            col += toAdd;
        }
        
        return snakePattern;
    
    }
    // static ArrayList<Integer> snakePattern(int matrix[][])
    // {
    //     // code here 
    //     boolean isRight = true;
    //     ArrayList<Integer>list = new ArrayList<>();
    //     for(int i = 0;i<matrix.length;i++){
    //         if(isRight){
    //             for(int j = 0;j<matrix[i].length;j++){
    //                 list.add(matrix[i][j]);
    //             }
    //              isRight = !isRight;
    //         }
    //         else{
    //              for(int j = matrix[i].length-1;j>=0;j--){
    //                 list.add(matrix[i][j]);
    //                 }
    //             isRight = !isRight;
    //         }
    //     }
    //     return list;
    // }
}
