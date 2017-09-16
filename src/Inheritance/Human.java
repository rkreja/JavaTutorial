package Inheritance;

import oop.Phone;

public class Human {
	
	private String name;
	private Phone phone=null;
	
	
	public void setPhone(Phone phone) {
		this.phone=phone;
	}
	
	public Phone getPhone() {
			
		return this.phone;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public Human(String name) {
		this.name=name;
	}
	
	public void walk() {
		System.out.println("walk method called from super class");
	}
	
	public void eat() {
		System.out.println(this.name+ " is eating.");
	}

	public void sleep() {
		System.out.println(this.name+ " is sleeping.");
	}

	public void swim() {
		System.out.println(this.name+ " is swimming.");
	}
	
}
