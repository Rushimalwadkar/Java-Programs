package com.JavaPrograms;

public class WhileSpaceReplace {
	public static void main(String[] args) {
		String str1 = "Saket Saurav        is a QualityAna    list";  
        String str2 = str1.replaceAll(" ", "\\$");
        System.out.println(str2);	
	}
}
