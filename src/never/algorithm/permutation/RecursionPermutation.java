/**  
 * @Title: RecursionPermutation.java
 * @Package never.algorithm.permutation
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 5, 2014 9:15:04 PM
 * @Description: TODO
 */
package never.algorithm.permutation;

public class RecursionPermutation {

	private static int[] source = { 1, 2, 3, 4};
	private static int n = 0;

	public static void main(String[] args) {
		permutation(source, 0, 3);
		System.out.println("Total: " + n);
	}

	public static void permutation(int[] source, int low, int high) {

		if (low > high) {
			for (int i = 0; i <= high; i++) {
				System.out.print(source[i] + " ");
			}
			System.out.println();
			n++;

		} else {
			for (int i = low; i <= high; i++) {
				swap(source, low, i);
				permutation(source, low + 1, high);
				swap(source, i, low);
			}
			
		}
	}

	public static void swap(int[] source, int i, int j) {
		int temp = source[i];
		source[i] = source[j];
		source[j] = temp;
	}

}
