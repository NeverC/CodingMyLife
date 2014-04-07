/**  
 * @Title: KMP.java
 * @Package never.algorithm.string_matching
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 1, 2014 9:11:13 PM
 * @Description: TODO
 */
package never.algorithm.string_matching;

import java.util.HashSet;
import java.util.Iterator;

public class KMP {

	private static String source = "BBC ABCDAB ABCDABCDABDE";
	private static String pattern = "ABCDABD";

	private static int[] partialMatchTable = new int[pattern.length()];

	private static HashSet<String> prefixSet = new HashSet<String>();
	private static HashSet<String> suffixSet = new HashSet<String>();

	public static void main(String[] args) {
		//System.out.println(search(source, pattern));
		createPMT(pattern);
		for (int i = 0; i < partialMatchTable.length; i++) {
			System.out.println(partialMatchTable[i]);
		}
	}

	// create partial match table
	public static void createPMT(String pattern) {
		for (int i = 1; i < pattern.length(); i++) {
			prefixSet.clear();
			suffixSet.clear();
			prefixAndSuffix(pattern.substring(0, i + 1));
			prefixSet.retainAll(suffixSet);
			Iterator<String> it = prefixSet.iterator();
			while (it.hasNext()) {
				int len = it.next().length();
				if(len > partialMatchTable[i]){
					partialMatchTable[i] = len;
				}
			}
		}
	}

	public static void prefixAndSuffix(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			prefixSet.add(str.substring(0, i + 1));
		}
		
		for (int i = 1; i < str.length(); i++) {
			suffixSet.add(str.substring(i, str.length()));
		}
	}

	// search the first match index
	public static int search(String source, String pattern) {
		int index = -1;

		return index;
	}

}
