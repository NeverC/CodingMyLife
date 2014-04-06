/**  
 * @Title: DictionaryOrderedPermutation.java
 * @Package never.algorithm.permutation
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 5, 2014 9:44:07 PM
 * @Description: TODO
 */
package never.algorithm.permutation;

public class DictionaryOrderedPermutation {

	private static int[] source = { 1, 2, 3, 4 };
	private static int n;

	public static void main(String[] args) {

		for (int i = 0; i < Factorial(source.length); i++) {
			for (int j = 0; j < source.length; j++) {
				System.out.print(source[j] + " ");
			}
			System.out.println();

			permutation(source, 0, 3);
		}
		// permutation(source, 0, 3);
		// System.out.println("Total: " + n);
	}

	public static void permutation(int[] source, int low, int high) {

	}

	public static int FindIndexJ(int[] source) {
		int indexJ = -1;
		for (int i = source.length - 2; i >= 0; i--) {
			if(source[i] < source[i + 1]){
				indexJ =  i;
			}
		}
		return indexJ;
	}

	public static int FindIndexK(int[] source, int indexJ) {

		int indexK = -1;
		for (int i = source.length - 1; i >= 0; i--) {
			if(source[i] < source[indexJ]){
				indexK =  i;
			}
		}
		return indexK;	
	}

	public static void swap(int[] source, int i, int j) {
		int temp = source[i];
		source[i] = source[j];
		source[j] = temp;
	}

	public static int Factorial(int number) {
		if (number == 1) {
			return number;
		} else {
			return number * Factorial(number - 1);
		}
	}
	
	public static void reversal(int[] source, int indexJ) {
		
	}

}
