/**  
 * @Title: MD5.java
 * @Package never.algorithm.security
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 3, 2014 8:19:24 PM
 * @Description: TODO
 */
package never.algorithm.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static void main(String[] args) {
		String testString = "药补不如食补药补不如食补，肾虚者宜吃下列食物慢慢进补肾虚者宜吃下列食物慢慢进补";
		String str = encryptMD5(testString);
		System.out.println(str);
		System.out.println(str.length());

	}

	public static String encryptMD5(String strInput) {
		StringBuffer buf = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(strInput.getBytes());
			byte b[] = md.digest();
			System.out.println(b.length);

			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();

			buf = new StringBuffer(b.length);
			for (int i = 0; i < b.length; i++) {
				if (((int) b[i] & 0xff) < 0x10) { // & 0xff转换无符号整型
					buf.append("0");
				}
				buf.append(Long.toString((int) b[i] & 0xff, 16));// 转换16进制,下方法同
				// buf.append(Long.toHexString((int) b[i] & 0xff));
			}
		} catch (NoSuchAlgorithmException ex) {
			ex.printStackTrace();
		}
		return buf.toString();
	}

}
