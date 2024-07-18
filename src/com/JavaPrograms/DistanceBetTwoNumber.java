package com.JavaPrograms;

public class DistanceBetTwoNumber {
	public static void main(String[] args) {
		int a[] = { -10, -5, 0, 5, 10 };
		int distance = Math.abs(a[1] - a[0]);// its absulte function
		for (int i = 1; i < a.length - 1; i++) {
			int currentdistance = Math.abs(a[i + 1] - a[i]);
			if (currentdistance != distance) {
				System.out.println("Not Equivalant");
				return;
			}
		}
		System.out.println("Equivalant");

	}
}
