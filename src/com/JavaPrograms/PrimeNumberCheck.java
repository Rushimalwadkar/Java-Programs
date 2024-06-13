package com.JavaPrograms;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		System.out.println("Enter Number to check Prime");
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int num = sc.nextInt();
		int temp;
		if (num == 2) {
			System.out.println(num + " is Prime");
		}
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				flag = true;
				break;
			}
		}
		if (flag=false) {
			System.out.println(num + " is Prime");
		}
		else {
			System.out.println(num + " is not Prime");
		}
	}
}
