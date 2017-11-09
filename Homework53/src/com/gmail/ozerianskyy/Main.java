package com.gmail.ozerianskyy;

import java.util.Scanner;

public class Main {

	static void numberOut(int a, String[] b) {
		
		int n1 = a / 100;
		
		if (n1 > 0) {
			System.out.print(b[n1] + " hundreds ");
		}
		
		int n2n3 = a % 100;
		
		if (n2n3 > 19) {
			int n2 = n2n3 / 10 + 18;
			int n3 = n2n3 % 10;
			System.out.print(b[n2] + " " + b[n3] + " ");

		} else {
			System.out.print(b[n2n3] + " ");
		}
	}

	public static void main(String[] args) {
		String[] numerator = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of money");

		double fullNumber = sc.nextDouble();
		fullNumber=fullNumber*100;
		int number=(int)fullNumber/100;
		int millions;
		int thousands;
		int units;
		int cents;

		cents = (int) (fullNumber%100);
		millions = number / 1000000;
		thousands = (number - millions * 1000000) / 1000;
		units = (number - millions * 1000000 - thousands * 1000);

		if (millions > 0) {
			numberOut(millions, numerator);
			System.out.print("millions ");
		}
		if (thousands > 0) {
			numberOut(thousands, numerator);
			System.out.print("thousands ");
		}
		if (units > 0) {
			numberOut(units, numerator);
			System.out.print("dollars ");
		}
		if (cents > 0) {
			numberOut(cents, numerator);
			System.out.print("cents");
		}

	}

}
