package DSA_1.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * LeaderInArray
 */
public class LeaderInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer>res = findLeaders(arr,n);
		for(Integer I : res){
			System.out.print(I + " ");
		}
		sc.close();
	}

	private static ArrayList<Integer> findLeaders(int[] arr, int n) {
		ArrayList<Integer>list = new ArrayList<>();
		int curr_ldr = arr[n-1];
		list.add(curr_ldr);
		for(int i = n-2;i>=0;i--){
			if(curr_ldr <= arr[i]){
				list.add(0,arr[i]);
				curr_ldr = arr[i];
			}
		}
		return list;
	}
}