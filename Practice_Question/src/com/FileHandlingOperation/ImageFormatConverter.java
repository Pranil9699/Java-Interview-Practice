package com.FileHandlingOperation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageFormatConverter {

	public static void main(String[] args) {
		/*
		 * How you Convert jpg format to jpg,png,gif,bmp images
		 * 
		 */
			
		try {
			// this for Online file
//			URL url = new URL("https://www.india.gov.in/sites/upload_files/npi/files/g-20-logo.jpg");
//			BufferedImage read = ImageIO.read(new File(url));
			
			
			//this for local image file
			BufferedImage read = ImageIO.read(new File("\\Users\\prani\\OneDrive\\Documents\\Pictures\\Default.jpg"));
			ImageIO.write(read, "jpg", new File(".\\src\\com\\FileHandlingOperation\\Me.jpg"));
			ImageIO.write(read, "png", new File(".\\src\\com\\FileHandlingOperation\\Me.png"));
			ImageIO.write(read, "bmp", new File(".\\src\\com\\FileHandlingOperation\\Me.bmp"));
			ImageIO.write(read, "gif", new File(".\\src\\com\\FileHandlingOperation\\Me.gif"));
			System.out.println("Done..");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
