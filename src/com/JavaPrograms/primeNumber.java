package com.JavaPrograms;

import java.util.Scanner;

public class primeNumber {
	public static Boolean isPrime(int a) {
		if (a == 0 || a == 1) {
			return false;
		}
		if (a == 2) {
			return true;
		}
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(isPrime(a));
	}
} 

