package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // creating a scanner object
		System.out.println("Enter a number :");
		int num = sc.nextInt(); 

		while(num%2==0)
		{
			num=num/2;
		}
		if(num==1)
		{
			System.out.println("The number is power of two");
		}
		else
		{
			System.out.println("The number is not equal to power of two");
		}
	}

}
