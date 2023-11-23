package DSA_1.Arrays;

import java.util.Scanner;

/**
 * StockBuySell
 */
public class StockBuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Days: ");
        int n = sc.nextInt();
        int maxProfit = 0;
        
        int[] prices = new int[n];
        System.out.println("Enter the stock prices/day: ");
        for (int index = 0; index <n; index++) {
            prices[index] = sc.nextInt();
        }
        for(int i = 1;i<n;i++){
            if(prices[i]>prices[i-1])
                maxProfit+=prices[i]-prices[i-1];
        }


        System.out.println("The max profit that can be earned: "+maxProfit);
        sc.close();

    }
    
}