/**  
 * @Title: FirstMissingPositive.java
 * @Package never.leetcode
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 12, 2014 11:06:45 AM
 * @Description: TODO
 */
package never.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {

	//private static int[] A = {};
	//private static int[] A = {0};
	//private static int[] A = {1};
	// private static int[] A = {2};
	//private static int[] A = {0, 1, 2, 3, 4};
	private static int[] A = {1000,-1};
	

	public static void main(String[] args) {
		System.out.println(firstMissingPositive(A));
	}

	public static int firstMissingPositive(int[] A) {

		int missPositive = 1;
		int minValue = Integer.MAX_VALUE;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		if (A.length == 0) {
			return missPositive;
		}
		
		if (A.length == 1 && A[0] == 0) {
			return missPositive;
		}

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				if(A[i] < minValue){
					minValue = A[i];
				}
				map.put(A[i], i);
			}
		}
		
		if(minValue == 1){
			for (int i = 1; i <= A.length + minValue; i++) {
				if(!map.containsKey(i)){
					return i;
				}
			}
		}else{
			return missPositive;
		}
		
		

		return missPositive;

	}
}
