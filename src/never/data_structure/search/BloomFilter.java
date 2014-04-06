/**  
 * @Title: BloomFilter.java
 * @Package never.data_structure.search
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 6, 2014 4:07:35 PM
 * @Description: TODO
 */
package never.data_structure.search;

import java.util.BitSet;

public class BloomFilter {

	private static final int DEFAULT_SIZE = 1 << 10;
	private static final int[] seeds = new int[] { 5, 7, 11, 13, 31, 37, 61 };
	private BitSet bitSet = new BitSet(DEFAULT_SIZE);
	private SimpleHash[] func = new SimpleHash[seeds.length];

	public BloomFilter() {
		for (int i = 0; i < seeds.length; i++) {
			func[i] = new SimpleHash(DEFAULT_SIZE, seeds[i]);
		}
	}

	public void add(String value) {
		for (SimpleHash f : func) {
			bitSet.set(f.hash(value), true);
		}
	}

	public boolean contains(String value) {
		if (value == null) {
			return false;
		}
		boolean ret = true;
		for (SimpleHash f : func) {
			ret = ret && bitSet.get(f.hash(value));
		}
		return ret;
	}

	public static class SimpleHash {
		private int cap;
		private int seed;

		public SimpleHash(int cap, int seed) {
			this.cap = cap;
			this.seed = seed;
		}

		// weight sum hash
		public int hash(String value) {
			int result = 0;
			int len = value.length();
			for (int i = 0; i < len; i++) {
				result = seed * result + value.charAt(i);
			}
			return (cap - 1) & result;
		}

	}

	public static void main(String[] args) {
		BloomFilter bloomFilter = new BloomFilter();
		bloomFilter.add("abc");
		bloomFilter.add("bcd");
		bloomFilter.add("cde");
		bloomFilter.add("def");
		System.out.println(bloomFilter.contains("abc"));
		System.out.println(bloomFilter.contains("bcd"));
		System.out.println(bloomFilter.contains("acd"));
	}
}
