package never.uncatogory;
/**
 * @Title: HashCodeTest.java
 * @Package
 * @author "Never" xzllc2010#gmail.com
 * @date Apr 3, 2014 8:28:13 PM
 * @Description: TODO
 */

public class HashCodeTest {

	public static void main(String[] args) {

		String strA = new String("cdcndcdncdccdcclcdppddcdc");
		String strB = new String("我是中国人我深爱着自己的祖国");

		System.out.println(strA.hashCode());
		System.out.println(strB.hashCode());

		System.out.println(strA.hashCode() & 0x7FFFFFFF);
		System.out.println(strB.hashCode() & 0x7FFFFFFF);
	}
}
