package com.NumberOperation;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {
public static void main(String[] args) {
	IntStream.range(1, 101).forEach(e->System.out.println(e+" "));
}
}
