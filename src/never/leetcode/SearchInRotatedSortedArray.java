/**  
 * @Title: SearchInRotatedSortedArray.java
 * @Package never.leetcode
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 12, 2014 9:12:22 PM
 * @Description: TODO
 */
package never.leetcode;

public class SearchInRotatedSortedArray {

	private static int[] A = {5, 6, 7, 8, 9, 10, 0, 1, 2, 3};
	
	public static void main(String[] args) {
		System.out.println(search(A, 3));
	}

	public static int search(int[] A, int target) {
		
		int index = -1;
		
		int left = 0;
		int right = A.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if(A[mid] == target){
				return mid;
			}
			if (A[left] <= A[mid]) {
				
				if (target >= A[left] && target <= A[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
				
			}else if (A[left] > A[mid]) {
				if (target <= A[right] && target >= A[mid]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return index;
	}

}
