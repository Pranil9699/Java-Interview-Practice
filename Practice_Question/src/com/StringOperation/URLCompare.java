package com.StringOperation;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class URLCompare {

	public static void main(String[] args) {
		/*
		 * What Will Be The Output When You Compare Site URL with its IP Address?
		 * 
		 */
		try {
			System.out.println(new URI("https://github.com/").equals(new URL("https://140.82.121.4")));
		} catch (MalformedURLException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
