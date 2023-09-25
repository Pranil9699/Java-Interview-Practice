package com.FileHandlingOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	/*
	 * Copy A File (pdf) and create a Different File in the same location
	 */
	public final static String PRIVIOUS_PATH_OF_FILE = "\\Users\\prani\\Core_Java\\Practice_Question\\src\\com\\FileHandlingOperation\\Assigment3-copy.pdf";

	public final static String NEW_PATH_OF_FILE = "\\Users\\prani\\Core_Java\\Practice_Question\\src\\com\\FileHandlingOperation\\Assigment3-newcopy.pdf";

	public static void main(String[] args) {

		File pfile = new File(PRIVIOUS_PATH_OF_FILE);
		File nfile = new File(NEW_PATH_OF_FILE);

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			fileInputStream = new FileInputStream(pfile);
			fileOutputStream = new FileOutputStream(nfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(fileInputStream.available());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = 0;
		try {
			while ((i = fileInputStream.read()) != -1)
				fileOutputStream.write(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream == null)
					fileInputStream.close();
				if (fileOutputStream == null)
					fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File Handling Done");
		}

	}

}
