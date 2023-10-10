package com.iooperations;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class File4 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("D://Test//demo.txt");
		BufferedReader br = new BufferedReader(fr);
		String str=br.readLine();
		while(str!=null) {
			System.out.println(str);
			str=br.readLine();
		}
		fr.close();
		br.close();
	}
}
