package com.ArrayOperation;

import java.util.*;

public class FindLeaderElements {
	public static void main(String[] args) {

		int[] array = {1,1,1,1,1,1};
	
		out(findLeaders(array));
	
	
	}

	private static <T>void out(T findLeaders) {

		System.out.println(findLeaders);
	}

	private static String findLeaders(int[] array) {

//		if(array.length==null)
//			return "Empty";
		String string="";
		
		int max = array[array.length-1];
		string+=max+"";
		for (int i = array.length-2; i >=0 ; i--){
			if(array[i]>max) {
				string+=" ,"+array[i];
				max=array[i];
			}
		}
		
		return string;
	}
}
