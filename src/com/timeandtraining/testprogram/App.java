package com.timeandtraining.testprogram;

import com.timeandtraining.humans.Human;
import com.timeandtraining.phone.Zmobile;

public class App {

	public static void main(String[] args) {
		
		
		Zmobile zmobile = new Zmobile();
		Human monica = new Human("Monica");
		zmobile.purchaseSmartPhone(monica, "Nokia 3310");
		monica.getPhone().takePhoto();
	
		
		

	}

}
