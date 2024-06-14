package com.JavaPrograms;

public class ConjugativeNumber {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int temp=0;
		int finalNumber = 20;
		for (int i = 0; i < finalNumber; i++) {
			temp=a+b;
			a=b;
			b=temp;
			System.out.println(temp+ " ");
		}
	}
}
