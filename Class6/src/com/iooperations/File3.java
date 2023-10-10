package com.iooperations;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File3 {

	public static void main(String[] args) throws Exception {
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\test\\demo.txt", true);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter some text ");
			String str = sc.nextLine();
			str = str + "\n";
			fw.write(str);
			System.out.println("File Created Successfully...");
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			// try
			// {
			fw.close();
			// }
			// catch(Exception ex)
			// {

			// }
		}
	}
}
