package Inheritance;

public class Singer extends Male{
	
	
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
