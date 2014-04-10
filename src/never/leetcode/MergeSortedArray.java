/**  
 * @Title: MergeSortedArray.java
 * @Package never.leetcode
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 10, 2014 8:15:24 PM
 * @Description: TODO
 */
package never.leetcode;

public class MergeSortedArray {

	private static int sourceA[] = { 1, 3, 5, 6, 0, 0, 0, 0 };
	private static int sourceB[] = { 2, 3, 4, 5 };

	public static void main(String[] args) {
		merge(sourceA, 4, sourceB, sourceB.length);
		for (int i = 0; i < sourceA.length; i++) {
			System.out.print(sourceA[i] + " ");
		}
	}

	public static void merge(int A[], int m, int B[], int n) {
		int indexA = m - 1;
		int indexB = n - 1;
		int indexMerge = m + n - 1;

		while (indexA >= 0 && indexB >= 0) {
			if (A[indexA] >= B[indexB]) {
				A[indexMerge] = A[indexA];
				indexA--;
				indexMerge--;
			} else {
				A[indexMerge] = B[indexB];
				indexB--;
				indexMerge--;
			}
		}
		if (indexA < 0) {
			for (int i = 0; i <= indexB; i++) {
				A[i] = B[i];
			}
		}
	}

}
