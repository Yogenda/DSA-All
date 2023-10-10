package com.iooperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("D:\\test\\test.txt");
		//FileInputStream fis = new FileInputStream("C:\\FSDWeekEndBatch\\FilesInfo\\Session22ndJavaWeekend.txt");
		
		int ch = fis.read();
		
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch = fis.read();
		}
		fis.close();
		
	}

}
