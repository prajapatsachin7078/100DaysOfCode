//{ Driver Code Starts

    import java.io.*;
    // import java.util.*;
    
    public class TransformToPrime {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testcases = Integer.parseInt(br.readLine());
            while (testcases-- > 0) {
                int n = Integer.parseInt(br.readLine());
                String line1 = br.readLine();
                String[] a1 = line1.trim().split("\\s+");
                int a[] = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(a1[i]);
                }
                Solution ob = new Solution();
                int ans=ob.minNumber(a,n);
                System.out.println(ans);
            }
        }
    }
    
    // } Driver Code Ends
    
    
    //User function Template for Java
    
    
    class Solution
    {
        public int minNumber(int arr[], int N)
        {
            int sum = findSum(arr,N-1);
            if(checkPrime(sum))return 0;
            int candidateSum = sum + 1;
            while(!checkPrime(candidateSum))
                candidateSum+=1;
            
            return candidateSum-sum;
        }
        
        public boolean checkPrime(int num){
            if(num<2)return false;
            
            if(num == 2 || num == 3)return true;
            
            for(int i = 2;i<=Math.sqrt(num);i++){
                if(num%i == 0)return false;
            }
            
            return true;
        }
        
        public int findSum(int arr[],int n){
            if(n == 0){
                return arr[n];
            }
            
            return arr[n] + findSum(arr,n-1);
        }
    }
    