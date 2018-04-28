
package javaapplication1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.spec.KeySpec;
import javax.crypto.BadPaddingException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class AESFileDecryption {
	public static void decrypt(String f_name) throws Exception {
       //public static void main(String args[]) throws Exception{
		String password = "javapapers";
               int i=0;
		// reading the salt
		// user should have secure mechanism to transfer the
		// salt, iv and password to the recipient
		FileInputStream saltFis = new FileInputStream("salt.enc");
		byte[] salt = new byte[8];
		saltFis.read(salt); //int s=salt.length;
                //System.out.println(" Length: "+s);
		saltFis.close();

		// reading the iv
		/*FileInputStream ivFis = new FileInputStream("iv.enc");
		byte[] iv = new byte[16];
		ivFis.read(iv);
               
		ivFis.close();*/

		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536,256);
		SecretKey tmp = factory.generateSecret(keySpec);
		SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

		// file decryption
		//Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
              // Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE,secret);
               
             //cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(iv));
		//FileInputStream fis = new FileInputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");
		//File file=new File("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");
              // FileOutputStream fos = new FileOutputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
		FileInputStream fis = new FileInputStream(f_name+".xyz");
		File file=new File(f_name+".xyz");
                FileOutputStream fos = new FileOutputStream(f_name+".txt");
		
                byte[] in = new byte[64];
		int read;
		while ((read = fis.read(in)) != -1) {
                    		byte[] output = cipher.update(in, 0, read);
			 output = cipher.update(in, 0, read);
			if (output != null)
				fos.write(output);
		}
               
		//byte[] output1 = cipher.doFinal();
            // byte[] output1= cipher.update(output);
              //byte[] output1= cipher.doFinal(output);
           byte[] output = cipher.doFinal();
                cipher.update(output);
               
		if (output!= null)
		fos.write(output);
               
		fis.close();
		fos.flush();
		fos.close();
		System.out.println("File Decrypted.");
                i++;
                file.delete();
        }
        public static void decrypt1(String f_name) throws Exception {
       //public static void main(String args[]) throws Exception{
		String password = "javapapers";
               int i=0;
		// reading the salt
		// user should have secure mechanism to transfer the
		// salt, iv and password to the recipient
		FileInputStream saltFis = new FileInputStream("salt1.enc");
		byte[] salt = new byte[8];
		saltFis.read(salt); //int s=salt.length;
                //System.out.println(" Length: "+s);
		saltFis.close();

		// reading the iv
		/*FileInputStream ivFis = new FileInputStream("iv.enc");
		byte[] iv = new byte[16];
		ivFis.read(iv);
               
		ivFis.close();*/

		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536,256);
		SecretKey tmp = factory.generateSecret(keySpec);
		SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

		// file decryption
		//Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
              // Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE,secret);
               
             //cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(iv));
		//FileInputStream fis = new FileInputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");
		//File file=new File("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");
              // FileOutputStream fos = new FileOutputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
		FileInputStream fis = new FileInputStream(f_name+".xyz");
		File file=new File(f_name+".xyz");
                FileOutputStream fos = new FileOutputStream(f_name+".txt");
		
                byte[] in = new byte[64];
		int read;
		while ((read = fis.read(in)) != -1) {
                    		byte[] output = cipher.update(in, 0, read);
			 output = cipher.update(in, 0, read);
			if (output != null)
				fos.write(output);
		}
               
		//byte[] output1 = cipher.doFinal();
            // byte[] output1= cipher.update(output);
              //byte[] output1= cipher.doFinal(output);
           byte[] output = cipher.doFinal();
                cipher.update(output);
               
		if (output!= null)
		fos.write(output);
               
		fis.close();
		fos.flush();
		fos.close();
		System.out.println("File Decrypted.");
                i++;
                file.delete();


        }
         public static void decrypt2(String f_name) throws Exception {
       //public static void main(String args[]) throws Exception{
		String password = "javapapers";
               int i=0;
		// reading the salt
		// user should have secure mechanism to transfer the
		// salt, iv and password to the recipient
		FileInputStream saltFis = new FileInputStream("salt2.enc");
		byte[] salt = new byte[8];
		saltFis.read(salt); //int s=salt.length;
                //System.out.println(" Length: "+s);
		saltFis.close();

		// reading the iv
		/*FileInputStream ivFis = new FileInputStream("iv.enc");
		byte[] iv = new byte[16];
		ivFis.read(iv);
               
		ivFis.close();*/

		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536,256);
		SecretKey tmp = factory.generateSecret(keySpec);
		SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

		// file decryption
		//Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
              // Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE,secret);
               
             //cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(iv));
		//FileInputStream fis = new FileInputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");
		//File file=new File("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");
              // FileOutputStream fos = new FileOutputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
		FileInputStream fis = new FileInputStream(f_name+".xyz");
		File file=new File(f_name+".xyz");
                FileOutputStream fos = new FileOutputStream(f_name+".txt");
		
                byte[] in = new byte[64];
		int read;
		while ((read = fis.read(in)) != -1) {
                    		byte[] output = cipher.update(in, 0, read);
			 output = cipher.update(in, 0, read);
			if (output != null)
				fos.write(output);
		}
               
		//byte[] output1 = cipher.doFinal();
            // byte[] output1= cipher.update(output);
              //byte[] output1= cipher.doFinal(output);
           byte[] output = cipher.doFinal();
                cipher.update(output);
               
		if (output!= null)
		fos.write(output);
               
		fis.close();
		fos.flush();
		fos.close();
		System.out.println("File Decrypted.");
                i++;
                file.delete();


        }
          public static void decrypt3(String f_name) throws Exception {
       //public static void main(String args[]) throws Exception{
		String password = "javapapers";
               int i=0;
		// reading the salt
		// user should have secure mechanism to transfer the
		// salt, iv and password to the recipient
		FileInputStream saltFis = new FileInputStream("salt3.enc");
		byte[] salt = new byte[8];
		saltFis.read(salt); //int s=salt.length;
                //System.out.println(" Length: "+s);
		saltFis.close();

		// reading the iv
		/*FileInputStream ivFis = new FileInputStream("iv.enc");
		byte[] iv = new byte[16];
		ivFis.read(iv);
               
		ivFis.close();*/

		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536,256);
		SecretKey tmp = factory.generateSecret(keySpec);
		SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

		// file decryption
		//Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
              // Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE,secret);
               
             //cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(iv));
		//FileInputStream fis = new FileInputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");
		//File file=new File("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");
              // FileOutputStream fos = new FileOutputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
		FileInputStream fis = new FileInputStream(f_name+".xyz");
		File file=new File(f_name+".xyz");
                FileOutputStream fos = new FileOutputStream(f_name+".txt");
		
                byte[] in = new byte[64];
		int read;
		while ((read = fis.read(in)) != -1) {
                    		byte[] output = cipher.update(in, 0, read);
			 output = cipher.update(in, 0, read);
			if (output != null)
				fos.write(output);
		}
               
		//byte[] output1 = cipher.doFinal();
            // byte[] output1= cipher.update(output);
              //byte[] output1= cipher.doFinal(output);
           byte[] output = cipher.doFinal();
                cipher.update(output);
               
		if (output!= null)
		fos.write(output);
               
		fis.close();
		fos.flush();
		fos.close();
		System.out.println("File Decrypted.");
                i++;
                file.delete();


        }
}
        
        
       