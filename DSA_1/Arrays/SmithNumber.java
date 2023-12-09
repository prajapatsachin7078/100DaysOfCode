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

    // Function to check if a number is a Smith number
    public int smithNum(int n) {
        int sum = 0;
        int num = n;
        List<Integer> primes = primeFactors(n);

        // Calculate sum of digits of the given number
        int digitSum = sumOfDigits(n);

        // Calculate sum of digits of prime factors
        int primeFactorSum = sumOfDigitsOfPrimes(primes);

        // Check if the sums are equal
        return digitSum == primeFactorSum ? 1 : 0;
    }

    // Function to find prime factors of a number
    private List<Integer> primeFactors(int n) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n / 2; i++) {
            while (n % i == 0) {
                primes.add(i);
                n /= i;
            }
        }

        return primes;
    }

    // Function to calculate sum of digits of a number
    private int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    // Function to calculate sum of digits of prime factors
    private int sumOfDigitsOfPrimes(List<Integer> primes) {
        int sum = 0;
        for (int prime : primes) {
            while (prime > 0) {
                int digit = prime % 10;
                sum += digit;
                prime /= 10;
            }
        }
        return sum;
    }
}

