package DSA_1.Strings;

import java.util.Scanner;

public class PrintAllSubstrings {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        printAllSubstrings2(str);
        sc.close();
   }

   // efficeint one
    private static void printAllSubstrings2(String str) {
        if(str.length() <= 1){
            System.out.println(str);
        }
        int n = str.length();
        for(int len = 1;len<=n;len++){
            for(int i = 0;i<=n-len;i++){
                int j = i +len-1;
                System.out.println(str.substring(i, j+1));
            }
        }
    }
   // brute force 
    private static void printAllSubstrings1(String str) {
        if(str.length() <= 1){
            System.out.println(str);
        }
        int len = str.length();
        for(int i = 0;i<len;i++){
            for(int j = i+1;j<=len;j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}
