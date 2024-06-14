package com.JavaPrograms;

public class MaxNumber {
	public static void main(String[] args) {
		int[] x = { 1, 34, 56, 72, 2, 4 };
		int max = x[0];
		int secMax = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		System.out.print(max + " is max Number and ");
		for (int i = 0; i < x.length; i++) {
			if (x[i] > secMax && x[i] < max) {
				secMax = x[i];
			}
		}
		System.out.print(secMax+" Is Second Max Number");
	}
} 
