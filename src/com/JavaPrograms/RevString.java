package com.JavaPrograms;

public class RevString {
	public static void WithInbuildFinction() {
		String s = "RUSHI";
		StringBuilder rev = new StringBuilder();
		rev.append(s);
		rev = rev.reverse();
		System.out.println(rev);

	}

	public static void WithoutInbuildFinction() {
		String s = "Hello";
		char str []= s.toCharArray();
		for (int i = str.length-1; i >= 0; i--) {
			System.out.print(str[i]);
		}
	}

	public static void main(String[] args) {
		RevString.WithInbuildFinction();
		RevString.WithoutInbuildFinction();
	}
}
