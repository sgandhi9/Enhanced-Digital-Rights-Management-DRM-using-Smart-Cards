/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Readfile {
public static String filedata;

    public static void readfdata() throws FileNotFoundException/*main(String[] args)*/ {
//while(true)

        File currentDir = new File("C:\\Users\\JAY MEHTA\\Desktop\\New folder\\Projects and practs\\BE PROJ\\Codes\\sketch_170326a"); // current directory
        //while(true){
        File[] fileList = displayDirectoryContents(currentDir);
        readAndDeleteFiles(fileList);
        //Readfile rf=new Readfile();
        
    }
    
    public static File[] displayDirectoryContents(File dir) {
        File[] files = null;
       // while(true)
        try {
            files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                   // System.out.println("Directory:" + file.getCanonicalPath());
                    //recursive call to fetch file list in all levels of sub-directories
                    displayDirectoryContents(file); 
                } else {
                    System.out.println("File:" + file.getCanonicalPath());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return files;
    }
    public static void readAndDeleteFiles(File[] fileList) throws FileNotFoundException{
        BufferedReader br = null;
        //while(true)
        for(File file : fileList){
            if (!file.isDirectory()){
                try {

                    String sCurrentLine;

                    br = new BufferedReader(new FileReader("C:\\Users\\JAY MEHTA\\Desktop\\New folder\\Projects and practs\\BE PROJ\\Codes\\sketch_170326a\\123.txt"));
                    if (br != null){
                        //System.out.println("Reading file : " + file.getCanonicalPath());

                             
                        String u_data=br.readLine();
                        filedata=u_data;
                           // System.out.println(br.readLine());
                        //  System.out.println(" "+u_data);
                        

                        br.close();
                       // System.out.println("Finished reading file : " + file.getCanonicalPath());
                    }
                    File f3=new File("C:\\Users\\JAY MEHTA\\Desktop\\New folder\\Projects and practs\\BE PROJ\\Codes\\sketch_170326a\\123.txt");
                    f3.delete();
                    //deleting file
                  /*  if(file.delete()){
                        System.out.println(file.getCanonicalPath() + " is deleted!");
                    }
                    else{
                        System.out.println(file.getCanonicalPath() + " could not be deleted!"); 
                    }*/

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            else{
                //recursive call to fetch file list in all levels of sub-directories and then read & delete each of them
                readAndDeleteFiles(file.listFiles());
            }
        }
}
}
