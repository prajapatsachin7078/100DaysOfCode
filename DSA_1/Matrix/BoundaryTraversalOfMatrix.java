package DSA_1.Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class BoundaryTraversalOfMatrix 
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            ArrayList<Integer> ans = boundaryTraversal(a, n, m);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        sc.close();
    }
    
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();

        // Traverse the top row
        for (int j = 0; j < m; j++) {
            list.add(matrix[0][j]);
        }

        // If there is only one row, return the list
        if (n == 1) {
            return list;
        }

        // Traverse the rightmost column (excluding the first and last elements)
        for (int i = 1; i < n - 1; i++) {
            list.add(matrix[i][m - 1]);
        }

        // If there is only one column, return the list
        if (m == 1) {
            list.add(matrix[n-1][m-1]);
            return list;
        }

        // Traverse the bottom row in reverse order
        for (int j = m - 1; j > 0; j--) {
            list.add(matrix[n - 1][j]);
        }

        // Traverse the leftmost column (excluding the first and last elements)
        for (int i = n - 2; i > 0; i--) {
            list.add(matrix[i][0]);
        }

        return list;
    }
}
