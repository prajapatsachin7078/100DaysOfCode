package DSA_1.Search;

import java.util.Scanner;

public class TwoSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the sum to find: ");
        int k = sc.nextInt();
        System.out.println("Enter the elements: " );
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum (two elements) " + k + findSum(arr,n,k) != null?"exist!":"not exist!");
    }

    private static boolean findSum(int[] arr, int n,int k) {
        int l = 0,r = n-1;
        while(l<r){
            if(arr[l] + arr[r] == k){
                return true;
            }else if(arr[l] + arr[r] < k){
                l++;
            }else{
                r++;
            }
        }
        return false;
    }
}
