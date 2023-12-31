package DSA_1.Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
       // first Array input
           System.out.println("Enter the size1: ");
           int n1 = sc.nextInt();
           int arr1[] = new int[n1];
           System.out.println("Enter array1: ");
           for(int i = 0;i<n1;i++){
               arr1[i] = sc.nextInt();
           }

           mergeSort(arr1,0,n1-1);
           for(int k = 0;k<n1;k++){
                System.err.print(arr1[k] + " ");
            }
        }
        
    }

    

    private static void mergeSort(int[] arr1,int l, int r) {
        if(l<r){
            int mid = l + (r-l)/2;

            mergeSort(arr1,l,mid);
            mergeSort(arr1,mid+1,r);
            merge(arr1,l,mid,r);
        }
         
    }



    private static void merge(int[] arr, int l, int m, int r) {
        
    
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
