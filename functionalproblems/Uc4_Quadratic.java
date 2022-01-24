package com.bridgelabz.functionalproblems;

import java.util.Scanner;

public class Uc4_Quadratic {
	public static void main(String[] args) {
		int a,b,c;
		double root1,root2;
		double delta;

		Scanner sc = new Scanner(System.in);  

		System.out.println("Enter the value of A :");
		a=sc.nextInt();

		System.out.println("Enter the value of B :");
		b=sc.nextInt();

		System.out.println("Enter the value of C :");
		c=sc.nextInt();

		delta = b*b - 4*a*c;

		if(delta > 0) {
			System.out.println(delta);
			double sqrt=Math.sqrt(delta);
			System.out.println(sqrt);

			root1=(-b - sqrt) / (2 * a);
			root2=(-b - sqrt) / (2 * a);

			System.out.println(" The two roots are: " +root1+"and" +root2);
		}
		else
		{
			System.out.println("Roots are imaginary");
		}

	}

}
