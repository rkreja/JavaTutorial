package net.timeandtraining.humans;

import net.timeandtraining.phone.SmartPhone;

public class Human {
	
	private String name;
	private SmartPhone phone;
	
	
	public Human(String name) {
		this.name=name;
	}



	
	
		
	
	public SmartPhone getPhone() {
		
		
		if(this.phone==null) {
			System.out.println("Ooops "+this.name+" doesn't own any phone");
			System.exit(1);
		}

		return this.phone;
	}

	public void setPhone(SmartPhone phone) {
	
		this.phone = phone;
		
		
	}

	public String getName() {
		return name;
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
