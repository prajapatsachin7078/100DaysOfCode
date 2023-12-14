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
            System.out.println("PeakElement: " + findPeak(arr, n));
        }
    }

    	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	// A binary search based function that returns index of
	// a peak element
	static int findPeak(int arr[], int n)
	{
		int l = 0;
		int r = n-1;
		int mid = 0;
	
		while (l <= r) {

			// finding mid by binary right shifting.
			mid = (l + r) >> 1;

			// first case if mid is the answer
			if ((mid == 0|| arr[mid - 1] <= arr[mid])&& (mid == n - 1|| arr[mid + 1] <= arr[mid]))
				break;

			// move the right pointer
			if (mid > 0 && arr[mid - 1] > arr[mid])
				r = mid - 1;

			// move the left pointer
			else
				l = mid + 1;
		}
	
		return mid;
	}
}
