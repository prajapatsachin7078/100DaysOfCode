package DSA_1.Strings;

import java.util.*;

// Your GeekforGeeks profile completion code
// import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        for (int t = 0; t < T; t++) {
            // Read strings A and B
            String A = scanner.nextLine();
            String B = scanner.nextLine();
            
            // Find the leftmost starting index of B in A
            int index = findSubstring(A, B);
            
            // Print the result for each test case
            System.out.println(index);
        }
        
        scanner.close();
    }
    
    private static int findSubstring(String A, String B) {
        int n = A.length();
        int m = B.length();
        
        for (int i = 0; i <= n - m; i++) {
            // Check if substring of length m starting from index i matches B
            if (A.substring(i, i + m).equals(B)) {
                return i;
            }
        }
        
        // B is not a substring of A
        return -1;
    }
}

