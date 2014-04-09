/**  
 * @Title: SingleNumberII.java
 * @Package never.leetcode
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 9, 2014 9:18:12 PM
 * @Description: TODO
 */
package never.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SingleNumberII {

	private static int[] A = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 1, 2, 3, 4 };

	public static void main(String[] args) {
		SingleNumberII sn = new SingleNumberII();
		System.out.println(sn.singleNumber(A));
	}

	public int singleNumber(int[] A) {
		int result = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				int temp = map.get(A[i]);
				map.put(A[i], temp + 1);
			} else {
				map.put(A[i], 1);
			}
		}

		for (int key : map.keySet()) {
			if (map.get(key) != 3) {
				result = key;
			}
		}
		return result;
	}
}
