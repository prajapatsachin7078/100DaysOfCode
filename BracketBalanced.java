// package practiceJava;
import java.util.*;
public class BracketBalanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        boolean isBalanced  = checkExpression(expression);
        System.out.println(isBalanced);
    }

    private static boolean checkExpression(String expression) {
        Stack<Character>stack = new Stack<Character>();
        for(int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) =='(' || expression.charAt(i) == '{'
            || expression.charAt(i) == '['){
                stack.push(expression.charAt(i));
            }
            else if(stack.isEmpty()){
                return false;
            }
            else if(expression.charAt(i) ==')'   && stack.peek() == '('){
                stack.pop();
            }
            else if( expression.charAt(i) == '}' && stack.peek() == '{'){
                stack.pop();
            }
            else if( expression.charAt(i) == ']' && stack.peek() == '['){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
}
