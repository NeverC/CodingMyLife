/**  
 * @Title: StringCompareDemo.java
 * @Package never.uncatogory
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 13, 2014 3:17:53 PM
 * @Description: TODO
 */
package never.uncatogory;

public class StringCompareDemo {
	
	private static int[][] matrix = { { 1 }, { 3 } };

	public static void main(String[] args) {

		System.out.println(searchMatrix(matrix, 2));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int rowCount = matrix.length;
		int columnCount = matrix[0].length;

		if (rowCount == 0 || target < matrix[0][0] || target > matrix[rowCount - 1][columnCount - 1]) {
			return false;
		}

		int targetRow = 0;

		for (int i = 0; i < rowCount - 1; i++) {
			int j = i + 1;
			if (target > matrix[i][0]) {
				if (target > matrix[j][0]) {
					targetRow = j;
					continue;
				} else if (target == matrix[j][0]) {
					targetRow = j;
					break;
				}

			} else if (target == matrix[i][0]) {
				targetRow = i;
				break;
			}
		}

		int start = 0;
		int end = columnCount - 1;

		while (end >= start) {
			int middle = start + (end - start) / 2;
			int temp = matrix[targetRow][middle];
			if (temp > target) {
				end = middle - 1;
			} else if (temp < target) {
				start = middle + 1;
			} else {
				return true;
			}
		}
		return false;
	}
}
