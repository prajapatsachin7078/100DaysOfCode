package DSA_1.Arrays;
import java.io.*;
import java.util.*;

public class StockBuySellAllPossibleDays {
    public static void main (String[] args) throws IOException {
            Scanner sc  = new Scanner(System.in);
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }
            int p = 0;
            for(int i=0; i<n-1; i++)
                p += Math.max(0,A[i+1]-A[i]);
                
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer> > ans = obj.stockBuySell(A, n);
            if(ans.size()==0)
                System.out.print("No Profit");
            else{
                int c=0;
                for(int i=0; i<ans.size(); i++)
                    c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];
                
                if(c==p)
                    System.out.print(1);
                else
                    System.out.print(0);
            }System.out.println();
    }
}

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer> > days = new ArrayList<>();
        int hold=-1;
        for(int i = 0;i<n-1;i++){
            // if I don't have any stock currently
            if(hold == -1 && A[i+1]>A[i]){
                hold=i;
            }
            else if(hold != -1 && A[i+1]<A[i]){ // have stock and tomorrow the price will fall
                ArrayList<Integer> row1 = new ArrayList<>();
                row1.add(hold);
                row1.add(i);
                days.add(row1);
                hold = -1;
            }
        }
        
        // if I've stock at the end,then sell it
        if(hold != -1){
            ArrayList<Integer> row1 = new ArrayList<>();
            row1.add(hold);
            row1.add(n-1);
            days.add(row1);
        }
        
        return days;
    }
}
