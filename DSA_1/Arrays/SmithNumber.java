package DSA_1.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SmithNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int t = scanner.nextInt();

        while (t-- > 0) {
            System.out.println("Enter the value of n:");
            int n = scanner.nextInt();
            scanner.nextLine();
            Solution solution = new Solution();
            System.out.println("Result for n=" + n + ": " + solution.smithNum(n));
            // Consume the remaining EOL character
            scanner.nextLine();
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

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
