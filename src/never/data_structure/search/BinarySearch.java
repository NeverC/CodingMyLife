/**BinarySearch.java
 * never.data_structure.search
 * April 1, 2014 5:04:19 PM 
 * xzllc2010@gmail.com
 */
package never.data_structure.search;

public class BinarySearch {

	private static int source[] = { 1};
	private static int target = 2;

	public static void main(String[] args) {

		int index = search(source, target);

		if (index == -1) {
			System.out.println("Not found!");
		} else {
			System.out.println("Found, the index returned is " + index + "!");
		}
	}

	public static int search(int[] source, int target) {

		int start = 0;
		int end = source.length - 1;

		//如果source为空，直接返回-1
		if (end == 0) {
			return -1;
		}
		while (end >= start) {
			// 防止end与start相加之后超过int的最大值
			int middle = start + (end - start) / 2;
			int temp = source[middle];
			if (temp > target) {
				end = middle - 1;
			} else if (temp < target) {
				start = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

}
