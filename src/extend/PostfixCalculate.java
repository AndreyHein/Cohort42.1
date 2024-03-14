package extend;

import java.util.Stack;

/**
 * AIT-TR, Java Basic, consultation #7
 *
 * @author Sergey Iryupin
 * @version 08-Feb-24
 */

public class PostfixCalculate {
    public static void main(String[] args) {
        String[] postfix = {"10", "5", "+", "3", "*"};//{"10", "5", "+"};
        Stack<String> stack = new Stack<>();
        int a, b, c;

        for (String str : postfix) {
            switch (str) {
                case "+":
                    a = Integer.valueOf(stack.pop());
                    b = Integer.valueOf(stack.pop());
                    c = a + b;
                    stack.push(String.valueOf(c));
                    break;
                case "-":
                    a = Integer.valueOf(stack.pop());
                    b = Integer.valueOf(stack.pop());
                    c = a - b;
                    stack.push(String.valueOf(c));
                    break;
                case "*":
                    a = Integer.valueOf(stack.pop());
                    b = Integer.valueOf(stack.pop());
                    c = a * b;
                    stack.push(String.valueOf(c));
                    break;
                case "/":
                    a = Integer.valueOf(stack.pop());
                    b = Integer.valueOf(stack.pop());
                    c = a / b;
                    stack.push(String.valueOf(c));
                    break;
                default:
                    stack.push(str);
            }
        }
        System.out.println(stack.pop());
    }
}
