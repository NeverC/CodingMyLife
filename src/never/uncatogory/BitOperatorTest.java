/**  
 * @Title: BitOperatorTest.java
 * @Package never.uncatogory
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 3, 2014 8:27:26 PM
 * @Description: TODO
 */
package never.uncatogory;

public class BitOperatorTest {

	public static void main(String[] args) {

		int aNum = 144;
		int bNum = 26;
		int cNum = 2;

		System.out.println("The binary format of aNum is " + Integer.toBinaryString(aNum));
		System.out.println("The binary format of bNum is " + Integer.toBinaryString(bNum));
		System.out.println("The binary format of cNum is " + Integer.toBinaryString(cNum));

		System.out.println("The result of aNum & bNum is " + (aNum & bNum));
		System.out.println("The result of aNum | bNum is " + (aNum | bNum));
		System.out.println("The result of aNum ^ bNum is " + (aNum ^ bNum));
		System.out.println("The result of ~cNum is " + (~cNum));
		System.out.println("The result of bNum << dNum is " + (bNum << cNum));

		String str = null;

		if ((str != null) & (str.length() < 5)) {
			System.out.println("Is ok");
		}
	}
}
