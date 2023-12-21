import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int arr[] = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        arr =  bubbleSortFun(arr,n);
        System.out.println("After sorting: ");
        for(int i= 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] bubbleSortFun(int[] arr, int n) {
        if(n <= 1){
            return arr;
        }
        for(int len = 1;len<n;len++){
            for(int i = 0;i<=n-len-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}
