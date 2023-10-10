package com.iooperations;

import java.io.File;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name to delete : ");
		String fname = sc.next();
		File  fileObj = new File("D:\\test\\" + fname);
		
		if(fileObj.exists()==true)
		{
			fileObj.delete();
			System.out.println("File deleted");
		}
		else
		{
			System.out.println("File Not Found....");
		}
		
		
	}
}
