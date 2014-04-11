/**  
 * @Title: EvaluateReversePolishNotation.java
 * @Package never.leetcode
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 10, 2014 9:06:47 PM
 * @Description: TODO
 */
package never.leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	// private static String[] tokens = { "2", "1", "+", "3", "*" };

	private static String[] tokens = { "4", "13", "5", "/", "+" };

	public static void main(String[] args) {
		System.out.println(evalRPN(tokens));

	}

	public static int evalRPN(String[] tokens) {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < tokens.length; i++) {
			int num1 = 0;
			int num2 = 0;
			if (tokens[i].equals("+")) {
				num1 = Integer.parseInt(stack.pop());
				num2 = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(num2 + num1));
			} else if (tokens[i].equals("-")) {
				num1 = Integer.parseInt(stack.pop());
				num2 = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(num2 - num1));
			} else if (tokens[i].equals("*")) {
				num1 = Integer.parseInt(stack.pop());
				num2 = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(num2 * num1));
			} else if (tokens[i].equals("/")) {
				num1 = Integer.parseInt(stack.pop());
				num2 = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(num2 / num1));
			} else {
				stack.push(tokens[i]);
			}
		}

		return Integer.parseInt(stack.pop());
	}

}
