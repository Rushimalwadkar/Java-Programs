package com.JavaPrograms;

public class SecondHighNumInArray {
	public static void main(String[] args) {
		int arr[] = { 10,100, 14, 46, 47, 94, 94, 52, 86, 136, 94, 89 };
		int max = arr[0];
		int secondmax = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<max&&arr[i]>secondmax) {
				secondmax = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secondmax);

	}
}
