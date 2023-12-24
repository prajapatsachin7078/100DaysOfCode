import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter array: ");
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            insertionSort(arr,n);
            for (int val : arr) {
                System.out.print(val + " ");
            }
        }
    }

    private static void insertionSort(int[] arr, int n) {
        if(n <= 1){
            return;
        }
        for(int i = 1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            // check in sorted array key's right place
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return;
    }
}
