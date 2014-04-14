/**  
 * @Title: LargestRectangleInHistogram.java
 * @Package never.leetcode
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 11, 2014 9:55:50 PM
 * @Description: TODO
 */
package never.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {

	private static int[] height = {2,1,5,6,2,3};
	
	public static void main(String[] args) {
		System.out.println(largestRectangleArea(height));
		System.out.println(Integer.MAX_VALUE);
	}
	
	

	public static int largestRectangleArea(int[] height) {
		Stack<Integer> stack = new Stack<Integer>();
		int i = 0;
		int maxArea = 0;
		int[] h = new int[height.length + 1];
		h = Arrays.copyOf(height, height.length + 1);
		while (i < h.length) {
			if (stack.isEmpty() || h[stack.peek()] <= h[i]) {
				stack.push(i++);
			} else {
				int t = stack.pop();
				int tempArea = h[t] * (stack.isEmpty()? i : (i - stack.peek() - 1));
				maxArea = Math.max(maxArea, tempArea);
			}
		}
		return maxArea;
	}

}
