package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // creating a scanner object
		System.out.println("Enter a year to check :");
		int year = sc.nextInt();   //read user input from coand line
		
		if (year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else if (year % 100 == 0) {
			System.out.println(year + " is not a leap year");
		} else if (year % 4 == 0) {
			System.out.println(year + " is a leap year");
		}else  {
			System.out.println(year + " is not a leap year");
		}
	}

}
