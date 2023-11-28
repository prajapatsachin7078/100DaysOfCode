package DSA_1.Arrays;

import java.util.Scanner;

public class PrefixSumGreaterThanX {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Value X: ");
        int x = sc.nextInt();
        System.out.println("Enter elements of array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Prefix sum greater than "+x+" is " + prefixSumGreaterThanX(arr,n,x));
        sc.close();
    }

    private static int prefixSumGreaterThanX(int[] arr, int n, int x) {
        int prefixS[] = prefixSum(arr,n);
        for(int i = 0;i<n;i++){
            if(prefixS[i]>=x){
                return i;
            }
        }
        return -1;
    }

    private static int[] prefixSum(int[] arr, int n) {
        int pSum[] = new int[n];
        pSum[0] = arr[0];
        for(int i = 1;i<n;i++){
            pSum[i] = pSum[i-1] + arr[i];
        }

        for (int i : pSum) {
            System.out.print(i + " ");
        }
        return pSum;
    }
}
