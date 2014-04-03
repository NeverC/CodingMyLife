/**  
* @Title: SetTest.java
* @Package never.uncatogory
* @author "Never" xzllc2010#gmail.com  
* @date Apr 3, 2014 8:31:35 PM
* @Description: TODO
*/ 
package never.uncatogory;

import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set <String> s = new TreeSet<String>();
		String [] tempString = new String[] {"abc", "def", "efg", "wer", "A", "V", "A", "abc"};
		
		for (String a : tempString)
            if (!s.add(a))
                System.out.println("Duplicate detected: " + a);

        System.out.println(s.size() + " distinct words: " + s);
		
	}
	
}
