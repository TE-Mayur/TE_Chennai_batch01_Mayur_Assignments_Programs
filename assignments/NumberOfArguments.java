package com.sunday.assignments;

public class NumberOfArguments {
	public static void main(String[] args) {
		System.out.println("Argumnets passed at Runtime ");

		for (int i = 0; i < args.length; i++) {

			System.out.println("arguments" + i + "=" + args[i]);

		}
	}

}