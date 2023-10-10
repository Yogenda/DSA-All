package com.iooperations;

import java.io.File;
import java.util.Scanner;

public class File8 {

	public static void main(String[] args) throws Exception {
		
		File  fileObj = new File("C:\\FSDWeekEndBatch\\FilesInfo");
		
		String finfo[] = fileObj.list();
		int fcount =0, dcount=0;
		for(String fname : finfo)
		{
			System.out.println(fname);
			
			File  f = new File("C:\\FSDWeekEndBatch\\FilesInfo\\" + fname);
			if(f.isFile()==true)
			{
				fcount++;
				String[] temp = fname.split("[.]");
				if(temp[1].equals("txt"))
				{
					//
				}
				if(temp[1].equals("pdf"))
				{
					//
				}
			}
			if(f.isDirectory()==true)
				dcount++;
		}
		
		System.out.println("No of Files : " + fcount);
		System.out.println("No of Folders : " + dcount);
	}
}
