/**  
 * @Title: InsertSort.java
 * @Package never.data_structure.sort
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 1, 2014 5:46:05 PM 
 * @Description: TODO
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
			int j = i;
			int temp = source[j];
			while (j > 0 && temp < source[j - 1]) {
				source[j] = source[j - 1];
				j--;
			}
			source[j] = temp;
		}
	}

}
