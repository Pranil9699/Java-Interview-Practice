package com.StringOperation;

import java.sql.Time;

public class PrintNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Pranil";
		String s="i";
		s = s.replaceAll("i","iiiiiiiiii"); //1*10 = 10
		s = s.replaceAll("i","iiiiiiiiii"); //10*10 = 100
		s = s.replaceAll("i","iiiiiiiiii"); //100*10 = 1000
		System.out.println(s.replaceAll("i",name+"\n"));
	
		print(1000,"Pranil");
	}

	private static void print(int i, String string) {
		
		if(i==0) {
			return;
		}
		System.out.println(string+" "+i);
		print(i-1,string);
		
	}

}
