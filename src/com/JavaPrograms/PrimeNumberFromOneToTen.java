package com.JavaPrograms;

public class PrimeNumberFromOneToTen {
	public static void main(String[] args) {
		System.out.print("Prime Number from 0 to 10 are: ");
		for (int i = 2; i <= 10; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count > 0) {
				System.out.print(i + ",");
			}
		}
	}
}
