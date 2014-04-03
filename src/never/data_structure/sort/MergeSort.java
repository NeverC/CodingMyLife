/**  
 * @Title: MergeSort.java
 * @Package never.data_structure.sort
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 3, 2014 8:21:55 PM
 * @Description: TODO
 */
package never.data_structure.sort;

public class MergeSort {

	private static int[] source = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

	public static void main(String[] args) {

		System.out.println("Before sort:");
		for (int i : source) {
			System.out.print(i + " ");
		}
		sort(source, 0, source.length - 1);
		System.out.println("\nAfter sort:");
		for (int i : source) {
			System.out.print(i + " ");
		}
	}

	public static void sort(int[] arr, int low, int high) {

		int mid = (low + high) / 2;
		if (low < high) {
			sort(arr, low, mid);
			sort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public static void merge(int A[], int low, int mid, int high) {
		// low to mid as the left array
		// mid+1 to high as the right array

		int llen = mid - low + 2;
		int rlen = high - mid + 1;
		int left[] = new int[llen];
		int right[] = new int[rlen];

		// copy the low to mid to the temp array left
		for (int i = 0; i < llen - 1; i++) {
			left[i] = A[low + i];
		}
		for (int i = 0; i < rlen - 1; i++) {
			right[i] = A[mid + 1 + i];
		}

		// set the sentinel
		left[llen - 1] = Integer.MAX_VALUE;
		right[rlen - 1] = Integer.MAX_VALUE;

		// merge the two array and copy to A[low,high];
		int j = 0;
		int k = 0;
		for (int i = low; i < high + 1; i++) {
			if (left[j] < right[k]) {
				A[i] = left[j];
				j++;
			} else {
				A[i] = right[k];
				k++;
			}
		}
	}

}
