/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class AESFileEncryption {
	public static void encrypt(String f_name) throws Exception {
          //  public static void main(String args[]) throws Exception {
                  //String s[]=new String[10];
                  /*int i=2;
                  s[0]="plaintext";
                  s[1]="higherlevel";
                  s[2]="lowerlevel";
                  s[3]="midlevel";*/
                 // for(i=0;i<4;i++){
		// file to be encrypted
		FileInputStream inFile= new FileInputStream("C:\\Users\\HP\\Desktop\\AC"+f_name+".txt");
                File file=new File("C:\\Users\\HP\\Desktop\\AC"+f_name+".txt");
              
              //   FileInputStream inFile = new FileInputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
                // File file=new File("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
		// encrypted file
		FileOutputStream outFile = new FileOutputStream("C:\\Users\\HP\\Desktop\\AC"+f_name+".xyz");
                //FileOutputStream outFile = new FileOutputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");

		// password to encrypt the file
		String password = "javapapers";

		// password, iv and salt should be transferred to the other end
		// in a secure manner

		// salt is used for encoding
		// writing it to a file
		// salt should be transferred to the recipient securely
		// for decryption
		byte[] salt= new byte[8];
		SecureRandom secureRandom = new SecureRandom();
		secureRandom.nextBytes(salt);
		FileOutputStream saltOutFile= new FileOutputStream("salt.enc");
		saltOutFile.write(salt);
		saltOutFile.close();

		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536,
				256);
		SecretKey secretKey= factory.generateSecret(keySpec);
		SecretKey secret = new SecretKeySpec(secretKey.getEncoded(), "AES");

		//
		//Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
               Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
              // Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, secret);
		AlgorithmParameters params = cipher.getParameters();

		// iv adds randomness to the text and just makes the mechanism more
		// secure
		// used while initializing the cipher
		// file to store the iv
		/*FileOutputStream ivOutFile = new FileOutputStream("iv.enc");
		byte[] iv = params.getParameterSpec(IvParameterSpec.class).getIV();
		ivOutFile.write(iv);
		ivOutFile.close();*/

		//file encryption
		byte[] input = new byte[64];
		int bytesRead;

		while ((bytesRead = inFile.read(input)) != -1) {
			byte[] output= cipher.update(input, 0, bytesRead);
			if (output != null)
				outFile.write(output);
		}
                int i=cipher.getBlockSize();
                System.out.println(" block size is "+i);
		//byte[] output = cipher.doFinal();
              
		//if (output != null)
			//outFile.write(output);
                 
		inFile.close();
		outFile.flush();
		outFile.close();

		System.out.println("File Encrypted.");
		file.delete();
	}
        public static void encrypt1(String f_name) throws Exception {
          //  public static void main(String args[]) throws Exception {
                  //String s[]=new String[10];
                  /*int i=2;
                  s[0]="plaintext";
                  s[1]="higherlevel";
                  s[2]="lowerlevel";
                  s[3]="midlevel";*/
                 // for(i=0;i<4;i++){
		// file to be encrypted
		FileInputStream inFile= new FileInputStream("C:\\Users\\HP\\Desktop\\AC"+f_name+".txt");
                File file=new File("C:\\Users\\HP\\Desktop\\AC"+f_name+".txt");
              
              //   FileInputStream inFile = new FileInputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
                // File file=new File("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
		// encrypted file
		FileOutputStream outFile = new FileOutputStream("C:\\Users\\HP\\Desktop\\AC"+f_name+".xyz");
                //FileOutputStream outFile = new FileOutputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");

		// password to encrypt the file
		String password = "javapapers";

		// password, iv and salt should be transferred to the other end
		// in a secure manner

		// salt is used for encoding
		// writing it to a file
		// salt should be transferred to the recipient securely
		// for decryption
		byte[] salt= new byte[8];
		SecureRandom secureRandom = new SecureRandom();
		secureRandom.nextBytes(salt);
		FileOutputStream saltOutFile= new FileOutputStream("salt1.enc");
		saltOutFile.write(salt);
		saltOutFile.close();

		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536,
				256);
		SecretKey secretKey= factory.generateSecret(keySpec);
		SecretKey secret = new SecretKeySpec(secretKey.getEncoded(), "AES");

		//
		//Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
               Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
              // Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, secret);
		AlgorithmParameters params = cipher.getParameters();

		// iv adds randomness to the text and just makes the mechanism more
		// secure
		// used while initializing the cipher
		// file to store the iv
		/*FileOutputStream ivOutFile = new FileOutputStream("iv.enc");
		byte[] iv = params.getParameterSpec(IvParameterSpec.class).getIV();
		ivOutFile.write(iv);
		ivOutFile.close();*/

		//file encryption
		byte[] input = new byte[64];
		int bytesRead;

		while ((bytesRead = inFile.read(input)) != -1) {
			byte[] output= cipher.update(input, 0, bytesRead);
			if (output != null)
				outFile.write(output);
		}
                int i=cipher.getBlockSize();
                System.out.println(" block size is "+i);
		//byte[] output = cipher.doFinal();
              
		//if (output != null)
			//outFile.write(output);
                 
		inFile.close();
		outFile.flush();
		outFile.close();

		System.out.println("File Encrypted.");
		file.delete();

}
         public static void encrypt2(String f_name) throws Exception {
          //  public static void main(String args[]) throws Exception {
                  //String s[]=new String[10];
                  /*int i=2;
                  s[0]="plaintext";
                  s[1]="higherlevel";
                  s[2]="lowerlevel";
                  s[3]="midlevel";*/
                 // for(i=0;i<4;i++){
		// file to be encrypted
		FileInputStream inFile= new FileInputStream("C:\\Users\\HP\\Desktop\\AC"+f_name+".txt");
                File file=new File("C:\\Users\\HP\\Desktop\\AC"+f_name+".txt");
              
              //   FileInputStream inFile = new FileInputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
                // File file=new File("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
		// encrypted file
		FileOutputStream outFile = new FileOutputStream("C:\\Users\\HP\\Desktop\\AC"+f_name+".xyz");
                //FileOutputStream outFile = new FileOutputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");

		// password to encrypt the file
		String password = "javapapers";

		// password, iv and salt should be transferred to the other end
		// in a secure manner

		// salt is used for encoding
		// writing it to a file
		// salt should be transferred to the recipient securely
		// for decryption
		byte[] salt= new byte[8];
		SecureRandom secureRandom = new SecureRandom();
		secureRandom.nextBytes(salt);
		FileOutputStream saltOutFile= new FileOutputStream("salt2.enc");
		saltOutFile.write(salt);
		saltOutFile.close();

		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536,
				256);
		SecretKey secretKey= factory.generateSecret(keySpec);
		SecretKey secret = new SecretKeySpec(secretKey.getEncoded(), "AES");

		//
		//Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
               Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
              // Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, secret);
		AlgorithmParameters params = cipher.getParameters();

		// iv adds randomness to the text and just makes the mechanism more
		// secure
		// used while initializing the cipher
		// file to store the iv
		/*FileOutputStream ivOutFile = new FileOutputStream("iv.enc");
		byte[] iv = params.getParameterSpec(IvParameterSpec.class).getIV();
		ivOutFile.write(iv);
		ivOutFile.close();*/

		//file encryption
		byte[] input = new byte[64];
		int bytesRead;

		while ((bytesRead = inFile.read(input)) != -1) {
			byte[] output= cipher.update(input, 0, bytesRead);
			if (output != null)
				outFile.write(output);
		}
                int i=cipher.getBlockSize();
                System.out.println(" block size is "+i);
		//byte[] output = cipher.doFinal();
              
		//if (output != null)
			//outFile.write(output);
                 
		inFile.close();
		outFile.flush();
		outFile.close();

		System.out.println("File Encrypted.");
		file.delete();

}
          public static void encrypt3(String f_name) throws Exception {
          //  public static void main(String args[]) throws Exception {
                  //String s[]=new String[10];
                  /*int i=2;
                  s[0]="plaintext";
                  s[1]="higherlevel";
                  s[2]="lowerlevel";
                  s[3]="midlevel";*/
                 // for(i=0;i<4;i++){
		// file to be encrypted
		FileInputStream inFile= new FileInputStream("C:\\Users\\HP\\Desktop\\AC"+f_name+".txt");
                File file=new File("C:\\Users\\HP\\Desktop\\AC"+f_name+".txt");
              
              //   FileInputStream inFile = new FileInputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
                // File file=new File("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.txt");
		// encrypted file
		FileOutputStream outFile = new FileOutputStream("C:\\Users\\HP\\Desktop\\AC"+f_name+".xyz");
                //FileOutputStream outFile = new FileOutputStream("C:\\Users\\JAY MEHTA\\Desktop\\DUMMY FOLDER\\ACL\\plaintext.xyz");

		// password to encrypt the file
		String password = "javapapers";

		// password, iv and salt should be transferred to the other end
		// in a secure manner

		// salt is used for encoding
		// writing it to a file
		// salt should be transferred to the recipient securely
		// for decryption
		byte[] salt= new byte[8];
		SecureRandom secureRandom = new SecureRandom();
		secureRandom.nextBytes(salt);
		FileOutputStream saltOutFile= new FileOutputStream("salt3.enc");
		saltOutFile.write(salt);
		saltOutFile.close();

		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536,
				256);
		SecretKey secretKey= factory.generateSecret(keySpec);
		SecretKey secret = new SecretKeySpec(secretKey.getEncoded(), "AES");

		//
		//Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
               Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
              // Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, secret);
		AlgorithmParameters params = cipher.getParameters();

		// iv adds randomness to the text and just makes the mechanism more
		// secure
		// used while initializing the cipher
		// file to store the iv
		/*FileOutputStream ivOutFile = new FileOutputStream("iv.enc");
		byte[] iv = params.getParameterSpec(IvParameterSpec.class).getIV();
		ivOutFile.write(iv);
		ivOutFile.close();*/

		//file encryption
		byte[] input = new byte[64];
		int bytesRead;

		while ((bytesRead = inFile.read(input)) != -1) {
			byte[] output= cipher.update(input, 0, bytesRead);
			if (output != null)
				outFile.write(output);
		}
                int i=cipher.getBlockSize();
                System.out.println(" block size is "+i);
		//byte[] output = cipher.doFinal();
              
		//if (output != null)
			//outFile.write(output);
                 
		inFile.close();
		outFile.flush();
		outFile.close();

		System.out.println("File Encrypted.");
		file.delete();

}
}

//}