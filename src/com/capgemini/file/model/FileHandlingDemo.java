package com.capgemini.file.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;

public class FileHandlingDemo {
	public static void main(String[] args) throws IOException {

		/*
		 * File file = new
		 * File("C:\\My_Workspaces\\Day3Assignments\\src\\tests\\GreeterTest.java");
		 * System.out.println(file.exists());
		 * 
		 * File folder = new File("C:\\My_Workspaces\\Day3Assignments");
		 * System.out.println(folder.exists());
		 */

		/*
		 * File file = new File("test.txt"); if (!file.exists()) { file.createNewFile();
		 * System.out.println("File is created successfully"); }
		 * 
		 * 
		 * FileWriter writer = new FileWriter(file,true); PrintWriter writer = new
		 * PrintWriter(new FileWriter(file, true)); writer.println("Hello");
		 * writer.println("How are you");
		 * 
		 * writer.close();
		 * System.out.println("The content has been written successfully");
		 * 
		 * 
		 * FileReader reader = new FileReader(
		 * "C:\\My_Workspaces\\COREJAVA\\sample-project\\src\\com\\capgemini\\sample\\model\\BankAccount.java"
		 * ); BufferedReader bReader = new BufferedReader(reader);
		 * 
		 * PrintWriter writer =new PrintWriter("BankAccountNew.java"); String content;
		 * while((content=bReader.readLine())!=null) { //System.out.println(content);
		 * writer.println(content); }
		 * 
		 * System.out.println("success");
		 * 
		 * writer.close(); bReader.close(); reader.close();
		 */
		
		/*
		 * File windowsDirectory = new File("c:\\windows");
		 * System.out.println(windowsDirectory.isDirectory()); String content[]=
		 * windowsDirectory.list();
		 * 
		 * for(String s : content) { System.out.println(s); }
		 */
		
		File newDir = new File("myDir");
		if(! newDir.exists()) {
			newDir.mkdir();
			System.out.println("Folder is created successfully");
		}
		
		File file =new File(newDir, "myFile.txt");
		if(!file.exists())
			file.createNewFile();
		
		System.out.println("File is created successfully");
	}

}
