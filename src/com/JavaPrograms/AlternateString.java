package com.JavaPrograms;

import java.util.Scanner;

public class AlternateString {
	public static void main(String[] args) {
		System.out.println("enter a string containing Number to add number");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int aLength = a.length();
		int bLength = b.length();
		StringBuilder s = new StringBuilder();
		if (aLength > bLength) {
			for (int i = 0; i < a.length(); i++) {
				s.append(a.charAt(i));
				if (i < bLength) {
					s.append(b.charAt(i));
				}

			}
		} else {
			for (int i = 0; i < b.length(); i++) {
				s.append(b.charAt(i));
				if (i < aLength) {
					s.append(a.charAt(i));
				}
			}
		}

		System.out.println("output is " + s);
		sc.close();
	}
}
