package com.sunday.assignments;

public class StringMethods {

	public static void main(String[] args) {

		String str = "My Name is Mayur";
		String str1 = "I stays in Chennai";

		StringBuilder str2 = new StringBuilder();
		str2.append(str1);
		str2.reverse();

		System.out.println("Equals Method : " + str.equals(str1));
		System.out.println("Upper to Lower case : " + str.toLowerCase());
		System.out.println("Lower to Upper case : " + str.toUpperCase());
		System.out.println("Reverse String : " + str2);
	}
}
