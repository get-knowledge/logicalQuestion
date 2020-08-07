package com.gobeyond.question.gc;

//Java program to illustrate 
//Automatic Resource Management 
//in Java without finally block 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWIthResource {
	public static void main(String args[]) {
		String str = "";
		BufferedReader br = null;

		System.out.println("Enter the file path");
		br = new BufferedReader(new InputStreamReader(System.in));

		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try with Resource
		// note the syntax difference
		try (BufferedReader b = new BufferedReader(new FileReader(str))) {
			String s;
			while ((s = b.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
