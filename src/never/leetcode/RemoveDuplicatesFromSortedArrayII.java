/**  
 * @Title: RemoveDuplicatesFromSortedArrayII.java
 * @Package never.leetcode
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 12, 2014 11:06:45 AM
 * @Description: TODO
 */
package never.leetcode;

public class RemoveDuplicatesFromSortedArrayII {

	private static int[] A = { 1, 1, 1, 1, 2, 2, 3 };

	// private static int[] A = {1,1};

	public static void main(String[] args) {
		System.out.println(removeDuplicates(A));
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i] + " ");
		}
	}

	public static int removeDuplicates(int[] A) {
		if (A.length >= 2) {
			int i = 0;
			int j = 1;
			int dump = 1;
			while (j < A.length) {
				if (A[j] == A[i]) {
					j++;
					dump++;
				} else {
					if (dump >= 2) {
						A[++i] = A[j - 1];
						A[++i] = A[j++];
						dump = 1;
					} else {
						i = i + dump;
						A[i] = A[j++];
						dump = 1;
					}

				}
			}
			if (dump == 1) {
				return i + 1;
			} else {
				A[++i] = A[--j];
				return i + 1;
			}
			// if (dump < 3) {
			//
			// if (dump == 1) {
			// int temp = i;
			// A[++i] = A[temp];
			// } else {
			// int temp = i;
			// A[++i] = A[temp];
			// A[++i] = A[temp];
			// }
			// return i;
			// } else {
			// int temp = i;
			// A[++i] = A[temp];
			// A[++i] = A[temp];
			// return i;
			// }

		} else {
			return A.length;
		}

	}
}
