/**  
 * @Title: SearchInsertPosition.java
 * @Package never.leetcode
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 10, 2014 8:42:09 AM
 * @Description: TODO
 */
package never.leetcode;

public class SearchInsertPosition {

	private static int source[] = { 1, 3, 5, 6 };
	private static int target = 0;

	public static void main(String[] args) {
		System.out.println(searchInsert(source, target));
	}

	public static int searchInsert(int[] source, int target) {

		int start = 0;
		int end = source.length;
		int guard = end;
		int index = 0;

		if (end == 0) {
			return index;
		}
		while (end >= start) {
			// 防止end与start相加之后超过int的最大值
			int middle = start + (end - start) / 2;
			if (middle < guard) {
				int temp = source[middle];
				if (temp > target) {
					end = middle - 1;
				} else if (temp < target) {
					start = middle + 1;
				} else {
					return middle;
				}
			} else {
				return middle;
			}

		}
		if (end < start) {
			index = end + 1;
		}
		return index;

	}

}
