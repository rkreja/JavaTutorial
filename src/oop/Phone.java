package oop;

public class Phone {
	
	private String model="iphone7";
	private String[] contacts;
	

	
	//below are my methods
	
	public void addContact(String[] names) {
		contacts = names;
	}
	public String[] getContacts() {
		return contacts;
	}
	
	private void call(){
		
		System.out.println("calling...unknown");
	}
	
	private void call(int number){
		System.out.println("calling..."+number);
	}
	
	public void groupSms(int[] numbers, String msg) {
			System.out.println("Sending message: "+ msg + " . to: "+ numbers[0]);
	}
	

	
	
	public void showModel() {
		System.out.println("Model for this phone is: "+ model);
	}
	

}
