package DSA_1.Matrix;

import java.util.Scanner;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();// as matrix should be square matrix
            int[][] arr = new int[n][n];
            
             for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    
                    arr[i][j]= sc.nextInt();
                }
            }
            System.out.println("Before transpose:");
             for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            transpose(n,arr);
            System.out.println("After transpose:");
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    public static void transpose(int n,int a[][])
    {
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                swap(a,i,j);
            }
        }
    }
    
    public static void swap(int[][] array, int index1, int index2) {
        // Swap the elements at the specified indices
        int temp = array[index1][index2];
        array[index1][index2] = array[index2][index1];
        array[index2][index1] = temp;
    }
}
