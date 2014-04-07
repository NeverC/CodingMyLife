/**  
 * @Title: BruteForce.java
 * @Package never.algorithm.string_matching
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 1, 2014 9:11:13 PM
 * @Description: TODO
 */
package never.algorithm.string_matching;

public class BruteForce {

	private static String source = "abcdeababcabdabfabg";
	private static String pattern = "ababcab";

	public static void main(String[] args) {
		System.out.println(bruteForce(source, pattern));
	}

	public static int bruteForce(String source, String pattern) {

		int sLen = source.length();
		int pLen = pattern.length();

		for (int i = 0; i <= sLen - pLen; i++) {
			int j = 0;
			while (j < pLen && source.charAt(i + j) == pattern.charAt(j)) {
				j++;
			}
			if (j == pLen) {
				return i;
			}
		}
		return -1;
	}

}
