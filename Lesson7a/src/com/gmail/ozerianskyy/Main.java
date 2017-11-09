package com.gmail.ozerianskyy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Date date = new Date();
		
		SimpleDateFormat stf = new SimpleDateFormat("'Today is' : d MMMM y");
		
		System.out.println("Input date");
		
		String text = sc.nextLine();
		
		SimpleDateFormat sdfTwo= new SimpleDateFormat("dd MM yyyy");
		
		try {
			date = sdfTwo.parse(text);
		} catch (ParseException e) {
			System.out.println("Wrong input");
		}
				
		String res = stf.format(date);
		
		System.out.println(res);
		System.out.println(date.getTime());
	}

}
