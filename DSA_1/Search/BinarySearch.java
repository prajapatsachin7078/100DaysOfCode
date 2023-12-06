package DSA_1.Search;

//{ Driver Code Starts
    // import java.util.*;
    // import java.lang.*;
    import java.io.*;
    
    public class BinarySearch
    {
        
        public static void main(String args[])throws IOException
        {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            
            while(t-- > 0)
            {
                String s[] = read.readLine().trim().split("\\s+");
                
                int n = Integer.parseInt(s[0]);
                int k = Integer.parseInt(s[1]);
                
                int arr[] = new int[n];
                
                String st[] = read.readLine().trim().split("\\s+");
                
                for(int i = 0; i < n; i++)
                {
                    arr[i] = Integer.parseInt(st[i]);
                }
                
                // Solution obj = new Solution();
                
                System.out.println(Solution.searchInSorted(arr, n, k));
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution{
        static int searchInSorted(int arr[], int N, int K)
        {
            
            // Your code here
            return search(arr,0,N-1,K);
           
        }
        static int search(int arr[], int l, int r, int k){
            while(l<=r){
                int mid = l+(r-l)/2;
                if(arr[mid] == k)return 1;
                else if(arr[mid] > k) r = mid-1;
                else l =  mid+1;
            }
            return -1;
        }
        // static int search(int arr[], int l, int r, int k){
        //     if(l>r){
        //         return -1;
        //     }
        //     int mid = l+(r-l)/2;
        //     if(arr[mid] == k)return 1;
        //     else if(arr[mid] > k) return search(arr,l,mid-1,k);
        //     else return search(arr,mid+1,r,k);
        // }
    }