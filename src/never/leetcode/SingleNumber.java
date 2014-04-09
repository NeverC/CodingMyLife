/**  
 * @Title: SingleNumber.java
 * @Package never.leetcode
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 9, 2014 8:56:11 PM
 * @Description: TODO
 */
package never.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumber {

	private static int[] A = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };

	public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		System.out.println(sn.singleNumber(A));
	}

	public int singleNumber(int[] A) {
		int result = 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (!set.add(A[i])) {
				set.remove(A[i]);
			}
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			result = it.next();
		}
		return result;
	}

}
