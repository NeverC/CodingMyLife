/**  
* @Title: BruteForce.java
* @Package never.data_structure.search
* @author "Never" xzllc2010#gmail.com  
* @date 2014年4月3日 下午4:16:55
* @Description: TODO
*/ 
package never.data_structure.search;

public class BruteForce {

	private static String source = "abcdeababcabdabfabg";
	private static String pattern = "abcde";
	
	public static void main(String[] args) {
		System.out.println(search(source, pattern));

	}
	
	public static int search(String source, String pattern){
		
		int sLen = source.length();
		int pLen = pattern.length();
		
		for(int i = 0; i < sLen - pLen + 1; i++){
			int k = i;
			int j = 0;
			while(j < pLen){

				if(source.charAt(k) != pattern.charAt(j)){
					break;
				}
				j++;
				k++;
			}
			if(j == pLen){
				return i;
			}
		}
		return -1;
	}

}
