package DSA_1.Arrays;

import java.util.Scanner;

public class ArrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        arrange(arr,n);
        for(int val:arr){
            System.out.print(val + " ");
        }
        sc.close();
    }
    // arr[i] = arr[arr[i]];
    private static void arrange(int[] arr, int n) {
        // here we use encoding and decoding approach 
        // where first we encode the array using arr[i]+=(arr[arr[i]]%n)*n;
        // then we decode it using arr[i]/=n;
        // it rearranges the array in desired way we want 
        for(int i = 0;i<n;i++){
            arr[i]+=(arr[arr[i]]%n)*n;
        }
        for(int i = 0;i<n;i++){
            arr[i]/=n;
        }
    }
}
