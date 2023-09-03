package com.FileHandlingOperation;

import java.io.File;

public class ChangeFilePersmission {

	public static void main(String[] args) {
		File file = new File(".\\src\\com\\FileHandlingOperation\\FileCopy.java");
		
//		boolean check = file.setExecutable(false) && file.setWritable(false);
//		System.out.println(file.setReadOnly());
		System.out.println(file.canExecute());
//		System.out.println(check);
	
	}

}
