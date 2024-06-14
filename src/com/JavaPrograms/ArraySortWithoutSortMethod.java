package com.JavaPrograms;

public class ArraySortWithoutSortMethod {
	public static void main(String[] args) {
		int[] a = { 1, 5, 2, 3, 6 };
		for (int i = 0; i < a.length; i++) {
			int temp=0;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ,");
		}
	}
}
