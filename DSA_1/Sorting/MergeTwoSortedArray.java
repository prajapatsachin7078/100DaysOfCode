import java.util.Scanner;

public class MergeTwoSortedArray {
    
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
            // Second array input
            System.out.println("Enter the size2: ");
            int n2 = sc.nextInt();
            int arr2[] = new int[n2];
            System.out.println("Enter array2: ");
            for(int i = 0;i<n2;i++){
                arr2[i] = sc.nextInt();
            }
            int arr[] = mergeTwoSortedArr(arr1,arr2,n1,n2);
            for (int val : arr) {
                System.out.print(val + " ");
            }
        }
    }

    private static int[] mergeTwoSortedArr(int[] a, int[] b, int m, int n) {
        if(n == 0 && m == 0){
            return null;
        }else if(n == 0){
            return a;
        }else if( m == 0){
            return b;
        }

        int[] arr = new int[m+n];
        
        int i = 0,j = 0,k = 0;

        while(i<m && j < n){
            if(a[i] <= b[j]){
                arr[k++] = a[i++];
            }else{
                arr[k++] = b[j++];
            }
        }
        while(i<m){
            arr[k++] = a[i++];
        }
        while(j<n){
            arr[k++] = b[j++];
        }
        return arr;
    }

}
