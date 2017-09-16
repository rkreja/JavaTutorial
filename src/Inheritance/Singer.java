package Inheritance;

import oop.NonSmartPhone;

public class Singer extends Human{
	
	private NonSmartPhone phone = new NonSmartPhone("Nokia 3310");
	
	
	public NonSmartPhone getPhone() {
		return this.phone;
	}
	public Singer(String name) {
		super(name);

	}
	
	

	@Override
	public void swim() {
		System.out.println("Sorry I dont know how to swim.");
	}
	
	public void walk() {
		super.walk();
		System.out.println("walk method called from singer class");
	}


	public void singAsong() {
		System.out.println("Ek paye nupur tomar onno pa khali...");
	}



}
