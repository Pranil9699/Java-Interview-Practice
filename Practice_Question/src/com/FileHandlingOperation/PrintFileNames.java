package com.FileHandlingOperation;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

public class PrintFileNames {
	public static String FOLDER_PATH = "\\Users\\prani\\Core_Java\\Practice_Question\\src\\com";

	public static void main(String[] args) {

		File file = new File(FOLDER_PATH);

		if (file.exists()) {
			if (file.isDirectory()) {
				String[] strings = file.list();
				Arrays.sort(strings);
				for (String string : strings) {
					File afile = new File(FOLDER_PATH + file.separator + string);
					if (afile.isDirectory()) {
						String[] list = afile.list();
						Arrays.sort(list);
						for (String string2 : list) {
							System.out.print(string2 + " : ");
						}
						System.out.println();
					} else {
						System.out.println(string);
					}
				}
			} else {
				System.out.println(file.getName());
			}

		}

	}
}
