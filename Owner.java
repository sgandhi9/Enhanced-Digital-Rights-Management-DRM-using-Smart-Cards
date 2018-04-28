/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Owner {
       //public static void main(String args[])throws IOException, Exception{
            public static void getaccess() throws IOException, Exception{
           File file = new File ("C:\\Users\\HP\\Desktop\\AC");
           File file1=new File("C:\\Users\\HP\\Desktop\\AC\\midlevel.txt");
           File file2=new File("C:\\Users\\HP\\Desktop\\AC\\lowerlevel.txt");
           File file3=new File("C:\\Users\\HP\\Desktop\\AC\\higherlevel.txt");
           File file4 = new File ("C:\\Users\\HP\\Desktop\\AC\\plaintext.txt");
           String f1="C:\\Users\\HP\\Desktop\\AC\\midlevel";
           String f2="C:\\Users\\HP\\Desktop\\AC\\lowerlevel";
           String f3="C:\\Users\\HP\\Desktop\\AC\\higherlevel";
           String f4="C:\\Users\\HP\\Desktop\\AC\\plaintext";
            if(file1.exists()){	    	  
	      file1.setExecutable(true);
	      file1.setReadable(true);
	      file1.setWritable(true);
              // AESFileDecryption.decrypt(f1);
            }
            else{
                System.out.println("File: "+file1+"does not exist");
            }
            if(file2.exists()){	    	  
	      file2.setExecutable(true);
	      file2.setReadable(true);
	      file2.setWritable(true);
               
            }
            else{
                System.out.println("File: "+file2+"does not exist");
            }
            if(file3.exists()){	    	  
	      file3.setExecutable(true);
	      file3.setReadable(true);
	      file3.setWritable(true);
            //   AESFileDecryption.decrypt(f3);
            }else{
                System.out.println("File: "+file3+"does not exist");
            }
            if(file4.exists()){	    	  
	      file4.setExecutable(true);
	      file4.setReadable(true);
	      file4.setWritable(true);
              
            }else{
                System.out.println("File: "+file4+"does not exist");
            }
             //AESFileEncryption.encrypt("plaintext");
             AESFileDecryption.decrypt(f4);
          // DeEncrypter.decrypt(f4);
             
             
            //AESFileEncryption.encrypt("higherlevel");
          AESFileDecryption.decrypt1(f3);
            // DeEncrypter.decrypt(f3);
            
            //AESFileEncryption.encrypt("lowerlevel");
            AESFileDecryption.decrypt3(f2);
           
           

            
            
            //AESFileEncryption.encrypt("midlevel");
           AESFileDecryption.decrypt2(f1);
           
           
             
          Desktop desktop = Desktop.getDesktop();
      desktop.open(file);
       }    
}
