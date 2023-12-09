package DSA_1.Arrays;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class SmithNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.smithNum(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public int smithNum(int n) {
        int sum = 0;
        int num = n;
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            while (num % i == 0) {
                primes.add(i);
                num /= i;
            }
        }

        num = 0;
        while (n > 0) {
            int digit = n % 10;
            num += digit;
            n /= 10;
        }

        for (int i = 0; i < primes.size(); i++) {
            int prime = primes.get(i);
            while (prime > 0) {
                int digit = prime % 10;
                sum += digit;
                prime /= 10;
            }
        }

        return num == sum ? 1 : 0;
    }
}
