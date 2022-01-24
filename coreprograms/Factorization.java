package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class Factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to Find Factors: ");
		int Number = sc.nextInt();

		for(int i = 1; i <= Number; i++) {
			if(Number%i == 0) {
				System.out.println(i);			}

		}

	}
}
