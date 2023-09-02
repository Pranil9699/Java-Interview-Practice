package com.StringOperation;

import java.lang.reflect.Field;

public class StringTranslator {

	static {
		try {
			Field value = String.class.getDeclaredField("value");
			value.setAccessible(true);

			value.set("Hello Chintu", value.get("Bonjour Chintu"));
			value.set("I Like One Girl , who is Shradha at One Side💙",
					value.get("I Like One Girl, qui est Shradha à One Side💙"));
			value.set("She's Smile Is Cute And The Sound OMG  💙💙💙.",
					value.get("Son sourire est mignon et le son OMG 💙💙💙."));

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		/*
		 * Create A String Language Translator Auto Bots
		 */

		System.out.println("Hello Chintu");
	}
}
