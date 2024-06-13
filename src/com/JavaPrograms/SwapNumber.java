package com.JavaPrograms;

public class SwapNumber {
	public static void UsingThirdVariable() {
		int a = 20;
		int b = 10;
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a + "," + b);
	}

	public static void WithoutUsingThirdVariable() {
		int a = 20;
		int b = 15;
		a=a+b;//a=30
		b=a-b;//b=20
		a=a-b;//10;
		System.out.println(a + "," + b);
	}

	public static void main(String[] args) {
		//SwapNumber.UsingThirdVariable();
		SwapNumber.WithoutUsingThirdVariable();
	}
}
