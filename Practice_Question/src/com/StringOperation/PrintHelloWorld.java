package com.StringOperation;

public class PrintHelloWorld {

	/*
	 * Print Hello World Without Using SemiColon (;)
	 */
	public static void main(String[] args) {

		//1 
		if(System.out.printf("Hello World")==null){
			
		}
		//2 
		if(System.out.append("\nHello World")==null){
			
		}
		//3 
		if(System.out.append("\nHello World"+"\n").equals(null)){
			
		}
		//4 
		for (int i = 0; i < 1; System.out.println("Hello World"),i++) {
			
		}
		
	}

}
