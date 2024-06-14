package com.JavaPrograms;

public class PyramidStar {
	public static void main(String[] args) {

		for (int row = 0; row < 5; row++) {

			for (int space = 5; space >= row; space--) {
				System.out.print(" ");
			}
			for (int star = 0; star <= row; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
