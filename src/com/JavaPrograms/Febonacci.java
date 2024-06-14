 package com.JavaPrograms;

public class Febonacci {
	public static void PrintFebonacci(int count) {
		int a = 0;
		int b = 1;
		for (int i = 0; i < count; i++) {
			System.out.print(a+" ");
			int c = a + b;
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		PrintFebonacci(20);
	}
}
