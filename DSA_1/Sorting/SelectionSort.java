
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int arr[] = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr,n);
        System.out.println("After sorting: ");
        for(int i= 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void selectionSort(int[] arr, int n) {
        if(n <= 1){
            return;
        }
        for(int i = 0;i<n;i++){
           int min_idx = i;
           for(int j = i+1;j<n;j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
           }
           swap(arr,i,min_idx);
        }
    }

    private static void swap(int[] arr, int i, int min_idx) {
        int temp = arr[i];
        arr[i] = arr[min_idx];
        arr[min_idx] = temp;
    }

}
