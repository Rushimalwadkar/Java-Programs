package com.JavaPrograms;

public class AddNumbFromString {
	public static void main(String[] args) {
		String s = "H3110";
		int add = 0;
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= '0' && c[i] <= '9') {
				int temp = Character.getNumericValue(c[i]);
				add = add + temp;
			}
		}
		System.out.println(add);
	}
}
