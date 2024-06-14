package com.JavaPrograms;

public class StringCount {
	public static void main(String[] args) {
		String s = "Malayalam";
		char ch = 'a';
		String s2 = s.replaceAll(String.valueOf(ch), "");
		int count = s.length()-s2.length();
		System.out.println("Count for a is "+count);
	}
} 

