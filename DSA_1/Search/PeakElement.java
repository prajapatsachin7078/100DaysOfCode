package DSA_1.Search;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("PeakElement: " + peakElement(arr, n));
        }
    }

    	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public static int peakElement(int[] arr,int n)
    {
       //add code here.
        int left = 0;
        int right = n-1;
    
        while (left < right) {
            int mid = left + (right - left) / 2;
    
            // Compare the middle element with its neighbors
            if (arr[mid] > arr[mid + 1]) {
                // The peak might be on the left side
                right = mid;
            } else {
                // The peak might be on the right side (or mid itself)
                left = mid + 1;
            }
        }
    
        // At the end of the loop, 'left' and 'right' will be pointing to a potential peak element
        return left;
    }
}
