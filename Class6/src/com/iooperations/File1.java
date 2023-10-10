package com.iooperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\test\\test1.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text ");
		String str = sc.nextLine();
		// String str = "Java Online Session";
		byte b[] = str.getBytes(); // it will convert a string into bytes
		fos.write(b);
		fos.close();
		System.out.println("File Created Successfully...");
	}

}
