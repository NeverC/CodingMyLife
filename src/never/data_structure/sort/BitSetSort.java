/**  
 * @Title: BitSetSort.java
 * @Package never.data_structure.sort
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 6, 2014 9:36:51 PM
 * @Description: TODO
 */
package never.data_structure.sort;

import java.util.BitSet;
import java.util.HashSet;

public class BitSetSort {

	
	private static HashSet<Integer> hashSet = new HashSet<Integer>();
	private static int minIndex = 1;
	private static int maxIndex = 1000;
	private static int sourceSize = 200;
	private static BitSet bitSet = new BitSet(1001);

	public static void main(String[] args) {

		GenrateSource(minIndex, maxIndex, sourceSize, hashSet);
		System.out.println("Before sort:");
		for (int num : hashSet) {  
		      System.out.print(num + " ");  
		}
		sort(hashSet);
		System.out.println("\nAfter sort:");
		for (int i = 0; i < bitSet.length(); i++) {
			if(bitSet.get(i)){
				System.out.print(i + " ");  
			}
		}
	}

	public static void sort(HashSet<Integer> hashSet) {

		for (int num : hashSet) {  
			bitSet.set(num, true); 
		}
	}

	public static void GenrateSource(int min, int max, int n, HashSet<Integer> hashSet) {
		if (n > (max - min + 1) || max < min) {
			return;
		}
		for (int i = 0; i < n; i++) {
			// 调用Math.random()方法
			int num = (int) (Math.random() * (max - min)) + min;
			hashSet.add(num);// 将不同的数存入HashSet中
		}
		int setSize = hashSet.size();
		// 如果存入的数小于指定生成的个数，则调用递归再生成剩余个数的随机数，如此循环，直到达到指定大小
		if (setSize < n) {
			GenrateSource(min, max, n - setSize, hashSet);// 递归
		}
	}

}
