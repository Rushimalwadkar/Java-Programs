package com.JavaPrograms;

public class CheckVowels {
	public static void main(String[] args) {
		String s = "Hello";
		if (s.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println("true");
		}
	}
	
}
 