package com.JavaPrograms;

public class PallindromeString {

	public static void main(String[] args) {
		String s = "121";
		String out = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			out = out + s.charAt(i);
		}
		System.out.println("Reverse String is "+out);
		if (s.equals(out)) {
			System.out.println(s + " is Palindrom");
		} else {
			System.out.println(s + " is not Palindrom");
		}
	}
}
 
