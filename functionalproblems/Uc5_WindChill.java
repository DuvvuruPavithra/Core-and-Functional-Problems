package com.bridgelabz.functionalproblems;

import java.util.Scanner;

public class Uc5_WindChill {

	public static void main(String[] args) {
		double t, v, windchill;
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the Temperature value (Fahrenheit) : ");
		t = sc.nextDouble();

		if(t > 50) {
			System.out.println(" Enter a temperature value less than 50");
			return;
		}

		System.out.println(" Enter the value of wind speed (Miles per hour) : ");
		v = sc.nextDouble();

		if(v > 120 || v < 3) {
			System.out.println(" Enter a wind speed value between 120 and 3");
			return;
		}

		windchill = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
		System.out.println(" The Temperature is: " + t);
		System.out.println(" The wind speed is: " + v);
		System.out.println(" The wind Chill is: " + windchill);


	}

}
