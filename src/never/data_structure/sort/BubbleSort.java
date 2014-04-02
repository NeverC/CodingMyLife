/**  
 * @Title: BubbleSort.java
 * @Package never.data_structure.sort
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 2, 2014 10:08:58 PM
 * @Description: TODO
 */
package never.data_structure.sort;

public class BubbleSort {

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

		for (int i = 0; i < source.length - 1; i++) {
			boolean exchange = false;
			for (int j = source.length - 1; j > i; j--) {
				if (source[j] < source[j - 1]) {
					int temp = source[j];
					source[j] = source[j - 1];
					source[j - 1] = temp;
					exchange = true;
				}
			}
			if (!exchange) {
				System.out.println(i);
				break;
			}
		}
	}
}
