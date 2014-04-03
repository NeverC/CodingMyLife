/**  
 * @Title: RSA.java
 * @Package never.algorithm.security
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 3, 2014 8:20:18 PM
 * @Description: TODO
 */
package never.algorithm.security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;

import javax.crypto.Cipher;

public class RSA {

	public static final String KEY_ALGORITHM = "RSA";
	public static final String CIPHER_ALGORITHM_ECB1 = "RSA/ECB/PKCS1Padding";

	static PublicKey publicKey;
	static PrivateKey privateKey;
	static Cipher cipher;
	static KeyPair keyPair;

	public static void main(String[] args) throws Exception {
		method1("我爱你*(Sfsad7f()*^%%$");
		method2("我爱你*(Sfsad7f()*^%%$");
		method3("我爱你*(Sfsad7f()*^%%$");

	}

	/**
	 * 公钥加密，私钥解密
	 * 
	 * @param str
	 * @throws Exception
	 */
	static void method1(String str) throws Exception {
		KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
		KeyPair keyPair = keyGenerator.generateKeyPair();
		publicKey = keyPair.getPublic();
		privateKey = keyPair.getPrivate();
		cipher = Cipher.getInstance(KEY_ALGORITHM);
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] encrypt = cipher.doFinal(str.getBytes());
		System.out.println("Method 1 encrypt:" + Arrays.toString(encrypt));

		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] decrypt = cipher.doFinal(encrypt);
		System.out.println("Method 1 decrypt:" + new String(decrypt));
	}

	/**
	 * 私钥加密，公钥解密
	 * 
	 * @param str
	 * @throws Exception
	 */
	static void method2(String str) throws Exception {
		KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
		KeyPair keyPair = keyGenerator.generateKeyPair();
		publicKey = keyPair.getPublic();
		privateKey = keyPair.getPrivate();
		cipher = Cipher.getInstance(KEY_ALGORITHM);
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);
		byte[] encrypt = cipher.doFinal(str.getBytes());
		System.out.println("Method 2 encrypt:" + Arrays.toString(encrypt));

		cipher.init(Cipher.DECRYPT_MODE, publicKey);
		byte[] decrypt = cipher.doFinal(encrypt);
		System.out.println("Method 2 decrypt:" + new String(decrypt));
	}

	/**
	 * 私钥加密，公钥解密 CIPHER_ALGORITHM_ECB1 = RSA/ECB/PKCS1Padding
	 * 
	 * @param str
	 * @throws Exception
	 */
	static void method3(String str) throws Exception {
		KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
		KeyPair keyPair = keyGenerator.generateKeyPair();
		publicKey = keyPair.getPublic();
		privateKey = keyPair.getPrivate();
		cipher = Cipher.getInstance(CIPHER_ALGORITHM_ECB1);
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);
		byte[] encrypt = cipher.doFinal(str.getBytes());
		System.out.println("Method 3 encrypt:" + Arrays.toString(encrypt));

		cipher.init(Cipher.DECRYPT_MODE, publicKey);
		byte[] decrypt = cipher.doFinal(encrypt);
		System.out.println("Method 3 decrypt:" + new String(decrypt));
	}

}
