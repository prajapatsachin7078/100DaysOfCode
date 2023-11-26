package DSA_1.Arrays;

import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for (int index = 0; index <n; index++) {
            arr[index] = sc.nextInt();
        }

        arr = moveZeroToEnd(arr,n);
        for (int val : arr) {
            System.out.printf("%d ",val);
        }
        sc.close();
    }

    private static int[] moveZeroToEnd(int[] arr, int n) {
        int count = 0;
        // count non-zero elements 

        for(int i = 0;i<n;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count<n){
            arr[count++] = 0;
        }
        return arr;
    }
}
