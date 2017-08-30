package oop;

import java.util.ArrayList;

public class Phone {
	private String model;	
	private boolean isGpsEnabled=false;
	private boolean isBluetoothEnabled=false;
	private boolean isFaceDetectionEnabled=false;
	private boolean isPaymentCapable = false;
	
	
	private ArrayList<String> contacts = new ArrayList<>();
	//below are my methods
	
	public Phone(String modelName, boolean isGpsEnabled, boolean isBluetoothEnabled, boolean isFaceDetectionEnabled, boolean isPaymentCapable) {
		this.model=modelName;
		this.isGpsEnabled=isGpsEnabled;
		this.isBluetoothEnabled=isBluetoothEnabled;
		this.isFaceDetectionEnabled=isFaceDetectionEnabled;
		this.isPaymentCapable=isPaymentCapable;
//		System.out.println("I am going to create an object with "+ modelName);
		
		
	}
	

	public void settings() {
		System.out.println("- Display");
		System.out.println("- Privacy");
		System.out.println("- Message");
		
		if(isGpsEnabled==true) {
			System.out.println("- GPS");
		}
		if(isBluetoothEnabled==true) {
			System.out.println("- Bluetooth");
		}
		
		System.out.println("- Photos");
		System.out.println("- Call");
		System.out.println("- Sounds");
		
		if(isFaceDetectionEnabled==true) {
			System.out.println("- Face Detection");
		}
		
		if(isPaymentCapable==true) {
			System.out.println("- Payment");
		}
		
		
		
	}

	
	
	public void addContact(String name) {
		contacts.add(name);
	}
	
	public void deleteContact(String name) {
		contacts.remove(name);
	}
	
	public void showContacts() {
		
		
		for(int i=0;i<contacts.size();i++){
			System.out.println(i + ". "+ contacts.get(i));
		}
	
	
	}
	
	private void call(){
		
		System.out.println("calling...unknown");
	}
	
	private void call(int number){
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
