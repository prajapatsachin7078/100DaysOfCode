package DSA_1.Recursion;
import java.util.*;

class MaximizeRopeCuts {

	
	static int maxCuts(int n, int a, int b, int c)
	{
		if(n == 0)
			return 0;
		if(n <= -1)
			return -1;

		int res = Math.max(maxCuts(n-a, a, b, c), 
		          Math.max(maxCuts(n-b, a, b, c), 
		          maxCuts(n-c, a, b, c)));

		if(res == -1)
			return -1;

		return res + 1; 
	}
    public static void main(String [] args) 
    {   
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt(),a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();;
			
			System.out.println(maxCuts(n, a, b, c));
		}
        
    }

}
