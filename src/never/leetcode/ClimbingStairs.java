/**  
 * @Title: ClimbingStairs.java
 * @Package never.leetcode
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 9, 2014 9:44:50 PM
 * @Description: TODO
 */
package never.leetcode;

public class ClimbingStairs {

	public static void main(String[] args) {
		ClimbingStairs cs = new ClimbingStairs();
		System.out.println(cs.climbStairs(10));
	}

	/* not recursion */
	public int climbStairs(int n) {
		int result = 0;
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			int num1 = 1;
			int num2 = 2;
			for (int i = 3; i <= n; i++) {
				result = num2 + num1;
				num2 = result;
				num1 = result - num1;
			}
		}
		return result;
	}

	/* recursion */
	// public int climbStairs(int n) {
	// if (n == 1) {
	// return 1;
	// } else if (n == 2) {
	// return 2;
	// } else {
	// return climbStairs(n - 1) + climbStairs(n - 2);
	// }
	// }

}
