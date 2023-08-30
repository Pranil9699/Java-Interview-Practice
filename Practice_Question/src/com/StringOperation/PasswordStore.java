package com.StringOperation;

import java.util.Arrays;

public class PasswordStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Why Password should be Stored In Char array char[] insead of String?
		 * 
		 */
		String pwd ="Pranil@9699";
		System.out.println("Pwd is :"+pwd);
		char[]ch=new char[] {'P','r','a','n','i','l','@','9','6','9','9'};
		System.out.println(ch);
		Arrays.fill(ch, '*');
		System.out.println(ch);
		
	}

}
