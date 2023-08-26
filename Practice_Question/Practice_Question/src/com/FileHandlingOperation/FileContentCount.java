package com.FileHandlingOperation;

import java.io.*;
import java.util.*;

public class FileContentCount {

	public static final String path = "C:\\Users\\prani\\Core_Java\\Practice_Question\\src\\com\\FileHandlingOperation\\FileContentCount.txt";

	public static void main(String[] args) {
		int lineCount = 0, wordCount = 0, charCount = 0;
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(path));

			String readLine = reader.readLine();

			while (readLine != null) {

				lineCount++;
				String[] split = readLine.split(" ");
				wordCount += split.length;
				for (String string : split) {
					charCount += string.length();
				}
				readLine = reader.readLine();
			}
			out("LineCount : " + lineCount + "\nWordCount : " + wordCount + "\nCharCount : " + charCount);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void out(String string) {
		System.out.println(string);
	}

}
