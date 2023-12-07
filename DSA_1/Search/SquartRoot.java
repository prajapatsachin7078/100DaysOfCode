package DSA_1.Search;

//{ Driver Code Starts
import java.util.Scanner;

public class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
		sc.close();
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
	    if(x==0 || x == 1)return x;
	    return sqrtUsingBinarySearch(x,1,x/2);
	 }
	 // using binary search
	 long sqrtUsingBinarySearch(long x, long l, long r){
	     if(l>r)return (long)(l-1);
	     
	     long mid = l+(r-l)/2;
	     if(mid*mid == x)return (long)mid;
	     else if(mid*mid>x)return sqrtUsingBinarySearch(x,l,mid-1);
	     else return sqrtUsingBinarySearch(x,mid+1,r);
	 }
	 // normal method
	 long sqrtSimple(long x){
	     	// Your code here
		if(x<2)return 1;
		int i = 1;
		int sqrt = 0;
		while(i*i<=x){
		    sqrt = i;
		    i++;
		}
		return sqrt*sqrt>x?sqrt-1:sqrt;
	 }
}

