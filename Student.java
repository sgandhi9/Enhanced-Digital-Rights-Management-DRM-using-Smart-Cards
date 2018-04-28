
package javaapplication1;
import java.security.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Student {
    public static void getaccess() throws IOException, Exception{
          File file = new File ("C:\\Users\\HP\\Desktop\\AC");
           File file1=new File("C:\\Users\\HP\\Desktop\\AC\\midlevel.xyz");
           File file2=new File("C:\\Users\\HP\\Desktop\\AC\\lowerlevel.txt");
           File file3=new File("C:\\Users\\HP\\Desktop\\AC\\higherlevel.xyz");
           File file4 = new File ("C:\\Users\\HP\\Desktop\\AC\\plaintext.xyz");
            String f2="C:\\Users\\HP\\Desktop\\AC\\lowerlevel";
            
             AESFileDecryption.decrypt3(f2);
           if(file1.exists()){	    	  
	      file1.setExecutable(false);
	      file1.setReadable(false);
	      file1.setWritable(false);
            }
            else{
                System.out.println("File: "+file1+"does not exist");
            }
            if(file2.exists()){	    	  
	      file2.setExecutable(true);
	      file2.setReadable(true);
	      file2.setWritable(false);
            }
            else{
                System.out.println("File: "+file2+"does not exist");
            }
            if(file3.exists()){	    	  
	      file3.setExecutable(false);
	      file3.setReadable(false);
	      file3.setWritable(false);
            }else{
                System.out.println("File: "+file3+"does not exist");
            }
            if(file4.exists()){	    	  
	      file4.setExecutable(false);
	      file4.setReadable(false);
	      file4.setWritable(false);
            }else{
                System.out.println("File: "+file4+"does not exist");
            }
           
      Desktop desktop = Desktop.getDesktop();
      desktop.open(file);
      
}}
