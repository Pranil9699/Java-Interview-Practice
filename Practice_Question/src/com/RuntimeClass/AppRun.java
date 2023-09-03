package com.RuntimeClass;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppRun {
	public static void main(String[] args) throws IOException, InterruptedException {

		Runtime runtime = Runtime.getRuntime();
//		Process exec = runtime.exec(
//				"notepad.exe C:\\Users\\prani\\Core_Java\\Practice_Question\\src\\com\\RuntimeClass\\AppRun.java");
//		Thread.sleep(4000);
//		Thread currentThread = Thread.currentThread();
//		currentThread.stop();
//		exec.destroy();

		// opening videoLAN and start music

		String[] musicPlayer = new String[] { "C:\\Program Files\\Windows Media Player\\wmplayer.exe",
				"C:\\Users\\prani\\Downloads\\Baadal Barse_320(PagalWorld.com.se) - downloaded from my phone.mp3" };

		runtime.exec(musicPlayer);
//		BufferedWriter outputWriter = exec.outputWriter();
//		outputWriter.write(new Scanner(System.in).nextLine());
//		outputWriter.close();

//		runtime.exec(new String[] {"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe","https://www.google.com/"});
	}
}
