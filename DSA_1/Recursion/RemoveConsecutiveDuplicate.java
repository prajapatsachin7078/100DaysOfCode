package DSA_1.Recursion;

import java.util.Scanner;

public class RemoveConsecutiveDuplicate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string : ");
            String s = new String(sc.next());
            System.out.println("Before: " + s +"After: " + removeConsecutiveDuplicates(s));
        }
    }

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length() <= 1){
			return s;
		}

		if(s.charAt(0) == s.charAt(1)){
			return removeConsecutiveDuplicates(s.substring(1));
		}else{
			return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
		}
	}

}
