package com.FileHandlingOperation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenFileUsingDesktop {
	public static final String FILE_PATH = "\\Users\\prani\\Core_Java\\Practice_Question\\src\\com\\FileHandlingOperation\\FileContentCount.txt";

	public static void main(String[] args) {

		File file = new File(FILE_PATH);
		if(!Desktop.isDesktopSupported()) {
			System.out.println("desktop not supported...");
			return;
		}
		Desktop desktop= Desktop.getDesktop();
		
		if(file.exists()) {
			try {
				desktop.browse(new URI("https://github.com/Pranil9699/Java-Interview-Practice"));
				System.out.println("Done");
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Done");
			
		}
		
	}
}
