package com.xworkz.exceptions.compiletimeexception;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class CompileTimeExceptionDemo {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C://Users/snjku/Desktop/sanjayprevious/Hello.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
		
	     } catch ( IOException e) {
			 e.printStackTrace();
		}
	}

}
