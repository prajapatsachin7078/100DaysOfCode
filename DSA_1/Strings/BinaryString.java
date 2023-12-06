package DSA_1.Strings;

import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of test cases
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            
            String S = sc.nextLine();  // The string
            System.out.println(countSubstrings(S));
        }

        // Close the scanner
        sc.close();
    }

    public static int countSubstrings(String s) {
        int count = 0;
        int onesCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                onesCount++;
            }
        }

        // Counting substrings: nC2 = n * (n - 1) / 2
        count = onesCount * (onesCount - 1) / 2;

        return count;
    }
}
