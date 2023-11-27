package DSA_1.Arrays;

import java.util.Scanner;

public class EquilibruimThreeArrays {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array has equilibrium point: "+ hasEqualArrays1(arr,n));
        sc.close();
    }
    private static boolean hasEqualArrays2(int[] arr, int n){
        int lsum = 0,rsum = 0,msum = 0;
        int temp = 0;

        for(int val: arr)// get the total sum as left sum
            lsum+=val;
        
        for(int i = n-1;i>=0;i--){
            if(lsum == msum && msum == rsum)
                return true;
            
            lsum-=arr[i];
            msum+=arr[i];
            
        }



        return false;
    }

    private static boolean hasEqualArrays1(int[] arr, int n) {
        boolean isTwoEquillExist = false;
        int sum1= 0,sum2 = 0,sum3 = 0;
        for(int i = 0;i<n-1;i++){
            int j;
            for(j = i;j<n;j++){
                sum2+=arr[j];
                if(sum1 == sum2){ // CHECK IF SUM1 AND SUM2 EXISTS
                    isTwoEquillExist = true;
                    break;
                }
            }
            // IF SUM1 AND SUM2 BOTH ARE EQUAL 
            // FIND SUM3 AND COMPARE IT
            if(isTwoEquillExist){
                if(j+1 == n && sum1 == sum2 && sum2 == sum3){
                    return true;
                }
                for(int k = j+1;k<n;k++){
                    sum3+=arr[k];
                }
                if(sum1==sum2&&sum2==sum3)
                    return true;
                else    
                    return false;
            }else{
                sum2 = 0;
                sum1+=arr[i];
            }
        }
        return false;
    }
}
