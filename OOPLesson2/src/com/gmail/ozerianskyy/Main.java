package com.gmail.ozerianskyy;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat(3, 6, true, "Meat", "Vaska", "Fluffy");

		Animals[] zooArray = new Animals[10];
		zooArray[0] = catOne;
		for (Animals animals : zooArray) {
			System.out.println(animals);

		}
		Cat catTwo=(Cat) zooArray[0];
		
		System.out.println(catTwo.getName());
	}
}
