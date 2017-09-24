package com.timeandtraining.phone;

public class SmartPhone extends Phone{
	


	private boolean isFaceDetectionEnabled=false;
	private boolean isPaymentCapable = false;
	
	
	
	 SmartPhone(String model, boolean isFaceDetectionEnabled, boolean isPaymentCapable) {
		super(model);
		this.isFaceDetectionEnabled=isFaceDetectionEnabled;
		this.isPaymentCapable=isPaymentCapable;
		
		
	}

	public void takePhoto() {
		System.out.println(getModel()+ " Taking picture using camera.");
	}
	

	@Override
	public void settings() {
		super.settings();
		System.out.println("- Photos");
		System.out.println("- GPS");
		System.out.println("- Bluetooth");
		System.out.println("- Camera");
		

		if(isFaceDetectionEnabled==true) {
			System.out.println("- Face Detection");
		}
		
		if(isPaymentCapable==true) {
			System.out.println("- Payment");
		}
	}
	
	
	
	
	
	
}
