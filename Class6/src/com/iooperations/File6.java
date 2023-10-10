package com.iooperations;

import java.io.File;
import java.util.Scanner;

public class File6 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Folder Name : ");
		String fname = sc.next();
		File  fileObj = new File("D:\\test\\" + fname);
		
		if(fileObj.exists()==true)
		{
			System.out.println("Folder Already Exist");
		}
		else
		{
			fileObj.mkdir();
			System.out.println("Folder Created....");
		}
		
		
	}
}
