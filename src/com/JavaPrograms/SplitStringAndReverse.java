package com.JavaPrograms;

public class SplitStringAndReverse {
	public static void main(String[] args) {
		String input = " I love India. I work in IT MNC. ";
		String[] output;
		String temp = "\\.";
		output = input.split(temp);
		StringBuilder s = new StringBuilder();
		for (int i = output.length - 1; i >= 0; i--) {
			s.append(output[i]);
		}
		System.out.println(s);
	}
}
