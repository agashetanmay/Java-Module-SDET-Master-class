package com.exception.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example6 {
	
	public static void main(String[]args) throws FileNotFoundException {
		
		File file = new File("Drmo.txt");
		FileReader fileReader;
		BufferedReader bufferedReader = null;
	    String data;
	
		try {
			 fileReader = new FileReader(file);
			 bufferedReader = new BufferedReader(fileReader); //this will help to read content inside the file
			 data = bufferedReader.readLine();
			
			System.out.println(data);
		}
		catch(IOException e ) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		finally {
			
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
