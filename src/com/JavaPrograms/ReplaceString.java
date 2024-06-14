package com.JavaPrograms;

public class ReplaceString {
	public static void main(String[] args) {
		String s = "H13LL0";
		String out = s.replaceAll("[0-9]", "*");
		System.out.println(out);
	}
}