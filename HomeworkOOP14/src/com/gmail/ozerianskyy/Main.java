package com.gmail.ozerianskyy;

public class Main {

	public static void main(String[] args) {
		Network network1= new Network();
		
		Phone phone1 = new Phone("0673240303");
		network1.setPhoneInNetwork(phone1.getNumber());
		
		Phone phone2 = new Phone("0651232130");
		network1.setPhoneInNetwork(phone2.getNumber());
				
		phone1.call(phone2.getNumber(), network1.getPhoneNumbers());
	}

}
