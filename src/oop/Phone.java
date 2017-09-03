package oop;

import java.util.ArrayList;

public class Phone {
	String model="iphone7";	
	private ArrayList<String> contacts = new ArrayList<>();



	//below are my methods
	
	
	
	public  Phone(String model) {
		this.model=model;

	}
	
	
 	public void settings() {
 		System.out.println("Settings for: "+ this.model);
		System.out.println("- Display");
		System.out.println("- Privacy");
		System.out.println("- Message");
		System.out.println("- Call");
		System.out.println("- Sounds");	
		
	}
	
	
	public void addContact(String name) {
		contacts.add(name);
	}
	
	public void deleteContact(String name) {
		contacts.remove(name);
	}
	
	public void showContacts() {
		
		if(contacts.size()>=1) {
			System.out.println("You have following contact in your phonebook");
			for(int i=0;i<contacts.size();i++){
				System.out.println(i + ". "+ contacts.get(i));
			}
		}else {
			System.out.println("Phonebook is empty");
		}
		
	
	
	}
	

	
	public void call(int number){
		System.out.println("calling..."+number);
	}
	
	public void groupSms(int[] numbers, String msg) {
		
		for(int i=0;i<numbers.length;i++){
			System.out.println("Sending message: "+ msg + " . to: "+ numbers[i]);
		}
	}
	
	public void showModel() {
		System.out.println("Model for this phone is: "+ model);
	}
	
	
	


}
