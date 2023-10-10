package com.iooperations;

import java.io.File;
import java.util.Scanner;

public class File5 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fname = sc.next();
		File  fileObj = new File("D:\\test\\" + fname);
		
		if(fileObj.exists()==true)
		{
			System.out.println("File Already Exist");
		}
		else
		{
			fileObj.createNewFile();
			System.out.println("File Created....");
		}
	}
}
