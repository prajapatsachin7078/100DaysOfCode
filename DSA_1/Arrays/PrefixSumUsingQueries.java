package DSA_1.Arrays;

import java.util.Scanner;

public class PrefixSumUsingQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int preFixSum[] = preFixSumArray(arr,n);
        // take query size and query indexes
        int q = sc.nextInt();
        for(int i = 0;i<q;i++){
            System.out.println("Enter indexes: ");
            int l = sc.nextInt();
            int r= sc.nextInt();
            System.out.println("Query 1: ("+l+","+r+"): "+getSum(preFixSum,l,r));
        }
        sc.close();
    }

    private static int getSum(int[] preFixSum, int l, int r) {
        if(l==0){
            return preFixSum[r];
        }
        return preFixSum[r]-preFixSum[l-1];
    }

    private static int[] preFixSumArray(int[] arr, int n) {
        int prefixsum[]=new int[n];
        prefixsum[0]=arr[0];
        for(int i = 1;i<n;i++){
            prefixsum[i] = prefixsum[i-1] + arr[i];

        }
        return prefixsum;
    }
}
