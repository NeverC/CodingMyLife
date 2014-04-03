/**  
* @Title: StaticVariableTest.java
* @Package never.uncatogory
* @author "Never" xzllc2010#gmail.com  
* @date Apr 3, 2014 8:30:44 PM
* @Description: TODO
*/ 
package never.uncatogory;

public class StaticVariableTest {

	private static int x;

	public static void main(String[] args) {
		
		IncreaseVariable(x);
		System.out.println(x);
		DivisionZero();
	}

	public static void IncreaseVariable(int x){
		x++;
	}
	
	public static void DivisionZero(){
		double y = 3.2;
		int z = 1;
		System.out.println(y / z);
	}
	
}
