package com.JavaPrograms;

public class AlternateString {
	public static void main(String[] args) {
		String a = "abc";
		String b = "pqrxt";
		int n1 = a.length();
		int n2 = b.length();
		StringBuilder s = new StringBuilder();
		if (n1>=n2) {
			for (int j = 0; j < n1; j++) {
				s.append(a.charAt(j));
				s.append(b.charAt(j));

			}	
		}
		else {
			for (int j = 0; j < n2; j++) {
				s.append(b.charAt(j));
				if (j<n1) {
					s.append(a.charAt(j));
				}
			}
		}

		System.out.println("output is " + s);
	}
}
