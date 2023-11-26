package DSA_1.Arrays;

import java.util.Scanner;

public class KConsecutiveElementMaxSum {
    public static void main(String[] args) {
        System.out.println("K elements max sum");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr: ");;
        int n = sc.nextInt();
        System.out.println("Enter K: ");
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum = maxSum(arr,n,k);
        System.out.println("The maximum sum is "+sum);
        sc.close();
    }

    private static int maxSum(int[] arr, int n,int k) {
        // check if k is valid number
        if(n<k){
            System.out.println("Invalid");
            return 0;
        }
        // get first k elements sum
        int window_sum = 0;
        for (int j=0 ;j < k; j++){
            window_sum += arr[j];
        }
        // take max_sum as window_sum 
        // slide to next window to compare max_sum with window_sum
        // continue this process till the last possible window
        int max_sum = window_sum;
        for (int i=k; i<n; i++) {
            window_sum += (arr[i]-arr[i-k]);
            max_sum = Math.max(window_sum,max_sum); // compare current window with new window sum
        }
        return max_sum;
    }
}
