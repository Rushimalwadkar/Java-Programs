package com.JavaPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicates {
	public static void main(String[] args) {
		String in = "Pradeep";
		LinkedHashSet<Character> set = new LinkedHashSet();
		StringBuilder out = new StringBuilder();
		for (char c : in.toCharArray()) {
			set.add(c);
		}
		for (Character c : set) {
			out.append(c);
		}
		System.out.println(out.toString());
	}
}
