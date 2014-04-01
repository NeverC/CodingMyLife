/**InsertSort.java
 * never.data_structure.sort
 * Apr 1, 2014 5:46:05 PM 
 * xzllc2010@gmail.com
 */
package never.data_structure.sort;

public class InsertSort {

	private static int[] source = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

	public static void main(String[] args) {

		System.out.println("Before sort:");
		for (int i : source) {
			System.out.print(i + " ");
		}
		sort(source);
		System.out.println("\nAfter sort:");
		for (int i : source) {
			System.out.print(i + " ");
		}
	}

	public static void sort(int[] source) {

		int len = source.length;

		if (len == 0) {
			System.out.println("Empty!");
			return;
		} else if (len == 1) {
			return;
		}

		for (int i = 1; i < source.length; i++) {
			for (int j = i; j > 0; j--) {
				if (source[j] < source[j - 1]) {
					int temp = source[j];
					source[j] = source[j - 1];
					source[j - 1] = temp;
				}
			}

		}
	}

}
