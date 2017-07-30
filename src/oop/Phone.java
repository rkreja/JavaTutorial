package oop;

public class Phone {
	
	private String model="iphone7";
	

	
	
	//below are my methods
	
	
	private void call(){
		
		System.out.println("calling...unknown");
	}
	
	private void call(int number){
		System.out.println("calling..."+number);
	}
	
	public void text() {
		System.out.println("texting...unknown");
	}
	
	
	public void showModel() {
		System.out.println("Model for this phone is: "+ model);
	}
	

}
