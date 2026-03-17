package com.file.handling;

import java.io.File;
import java.io.IOException;

public class FileRunner {

	public static void main(String[] args) {
		
		// check if file is present is not
		
		File myfile = new File("C:\\Users\\tanagash\\Desktop\\QA_Automation\\JAVA MODULE\\Demo.txt");
		
		File newfile = new File("C:\\Users\\tanagash\\Desktop\\QA_Automation\\JAVA MODULE\\test1.txt");
		
		try {
			if(newfile.createNewFile()) {
			System.out.println("new file" +newfile.getName()+ "created successfully");	
			}
			else {
				System.out.println("cannot create the file!! file already exist");
			}
		} catch (IOException e1) {
			System.err.println("cannot create the file "+ newfile.getName()+" something went wrong!!");
			
			e1.printStackTrace();
		}
		
		if(myfile.exists()) {
			System.out.println(myfile.getName()+" file is present");
			System.out.println("path :" + myfile.getAbsolutePath());
		}
		else {
			System.out.println(myfile.getName()+" file is not present");
		}
	}

}
