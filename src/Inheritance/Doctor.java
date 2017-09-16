package Inheritance;

import oop.SmartPhone;

public class Doctor extends Human{
	
	
	private SmartPhone phone=new SmartPhone("iphone 7", false, true);
	
	
	public SmartPhone getPhone() {
		return this.phone;
	}
	
	public Doctor(String name) {
		super(name);
	}

	public void howToLoseFat() {
		System.out.println("Well..make sure you exercise.");
	}



}
