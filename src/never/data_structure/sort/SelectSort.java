/**  
 * @Title: SelectSort.java
 * @Package never.data_structure.sort
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 3, 2014 7:58:02 AM
 * @Description: 不稳定排序
 */
package never.data_structure.sort;

public class SelectSort {

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

		if (len == 0 || len == 1) {
			System.out.println("\nEmpty or only one element!");
			return;
		}

		for (int i = 0; i < source.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < source.length; j++) {
				if (source[j] < source[minIndex]) {
					minIndex = j;
				}
			}
			int temp = source[minIndex];
			source[minIndex] = source[i];
			source[i] = temp;
		}
	}

}
