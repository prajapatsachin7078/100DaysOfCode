package DSA_1.Search;
//{ Driver Code Starts
import java.io.IOException;
import java.util.*;

public class RoofTop
{
    
    public static void main(String args[])throws IOException
    {
        try (// BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                // int t = Integer.parseInt(read.readLine());
        Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                // int n = Integer.parseInt(read.readLine());
                int n = sc.nextInt();
                
                int arr[] = new int[n];
                
                // String st[] = read.readLine().trim().split("\\s+");
                
                for(int i = 0; i < n; i++)
                //   arr[(int)i] = Integer.parseInt(st[(int)i]);
                arr[(int)i] = sc.nextInt();
                  
                
                System.out.println(Solution.maxStep(arr, n));
            }
        }
    }
    
    
}
    
    

// } Driver Code Ends



class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int arr[], int N)
    {
        // Your code here
        int count=0,max = 0;
        for(int i = 0;i<N-1;i++){
            if(arr[i+1] > arr[i]){
                count++;
                max = Math.max(count,max);
            }
            else {count=0;}
        }
        return max;
    }
    
}