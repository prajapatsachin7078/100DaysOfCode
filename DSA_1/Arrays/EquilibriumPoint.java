package DSA_1.Arrays;

import java.util.Scanner;
public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array has equilibrium point: "+ hasEquilibruimPoint(arr,n));
        sc.close();
    }

    private static boolean hasEquilibruimPoint(int[] arr, int n) {
        int sum1=0,sum2=0;
        for (int i = 0; i < n ; i++) {
            sum1+=arr[i];
        }

        for(int i = n-1;i>=0;i--){
            sum1-=arr[i];
            if(sum1==sum2){
                return true;
            }
            sum2+=arr[i];
        }
        return false;
    }
}

