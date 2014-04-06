/**  
 * @Title: BitSetDemo.java
 * @Package never.uncatogory
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 6, 2014 8:55:51 PM
 * @Description: TODO
 */
package never.uncatogory;

import java.util.BitSet;

public class BitSetDemo {

	private static BitSet bitSet = new BitSet(100);
	
	public static void main(String[] args) {
		bitSet.set(9);
		int len = bitSet.length();
		int size = bitSet.size();
		for (int i = 0; i < bitSet.length(); i++) {
			System.out.println(bitSet.get(i));
		}
	}

}
