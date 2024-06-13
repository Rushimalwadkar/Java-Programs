package com.JavaPrograms;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter Number of time");
		Scanner in = new Scanner(System.in);
		int num, a = 0, b = 0, c = 1;
		num = in.nextInt();
		System.out.println("Fibonacci Series of the number is:");
		for (int i = 0; i < num; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+",");
		}
	}
}