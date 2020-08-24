package encrypt;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import com.aia.enc.AES256Util;
import com.aia.enc.Sha256;

public class EncTestMain {

	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException, GeneralSecurityException {
		
		String str = "Hello java";
		
		Sha256 sha256 = new Sha256();
		
		String encStr = sha256.encrypt(str);
		
		System.out.println("============SHA256 암호화============");
		
		System.out.println("평문: "+ str);
		System.out.println("SHA-256 암호화: "+encStr);
		
		// 동일한 key값의 결과는 같다
		System.out.println(sha256.encrypt("1"));
		System.out.println(sha256.encrypt("1"));
		
		System.out.println(sha256.encrypt("1234567890abcdef"));
		// 64자리 암호
		System.out.println(sha256.encrypt("1").length());
		
		
		// key = 16자리
		String key = "0000000000000001";
		String key2 = "0000000000000002";
		AES256Util aes256Util = new AES256Util(key);
		AES256Util aes256Util2 = new AES256Util(key2);
		
		System.out.println("============AES256 암호화============");
		
		String encStr1 = aes256Util.encrypt(str);
		String encStr2 = aes256Util2.encrypt(str);
		
		System.out.println("AES256 암호화: "+encStr1);
		System.out.println("AES256 암호화: "+encStr2+"\n");
		
		System.out.println("============AES256 복호화============");
		
		String plainStr1 = aes256Util.decrypt(encStr1);
		String plainStr2 = aes256Util2.decrypt(encStr2);
		
		System.out.println("AES256 복호화: "+plainStr1);
		System.out.println("AES256 복호화: "+plainStr2);
		
		
	}

}
