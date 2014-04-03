/**  
* @Title: ModuloTest.java
* @Package never.uncatogory
* @author "Never" xzllc2010#gmail.com  
* @date Apr 3, 2014 8:30:00 PM
* @Description: TODO
*/ 
package never.uncatogory;

public class ModuloTest {

	public static void main(String[] args) {
		int a = 25;
		int b = 6;
		
		double c = 25.5;
		double d = 6.0;
		
		System.out.println(a % b);
		System.out.println(-a % b);
		System.out.println(a % -b);
		System.out.println(-a % -b);
		
		System.out.println(c % d);
		System.out.println(-c % d);
		System.out.println(c % -d);
		System.out.println(-c % -d);
		
		System.out.println(a % d);
		System.out.println(-a % d);
		System.out.println(a % -d);
		System.out.println(-a % -d);
		
		System.out.println(c % b);
		System.out.println(-c % b);
		System.out.println(c % -b);
		System.out.println(-c % -b);
		

	}

}
