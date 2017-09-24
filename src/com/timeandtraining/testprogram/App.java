package com.timeandtraining.testprogram;

import com.timeandtraining.humans.Doctor;
import com.timeandtraining.humans.Human;
import com.timeandtraining.humans.Singer;
import com.timeandtraining.humans.Teacher;
import com.timeandtraining.phone.SmartPhone;
import com.timeandtraining.phone.Zmobile;

public class App {

	public static void main(String[] args) {
		
		
		Zmobile zmobile = new Zmobile();
		
		
		Human shariar = new Human("Shariar");
		Human azad = new Human("Azad");
		Human topu = new Human("Topu");
		
		SmartPhone sp;
		sp=zmobile.purchaseSmartPhone(shariar,"galaxy s8");
		sp=zmobile.purchaseSmartPhone(topu,"iphone 7");
		sp=zmobile.purchaseSmartPhone(azad,"galaxy s5");
		
		
		shariar.getPhone().call(9898);
		
		topu.getPhone().takePhoto();
		azad.getPhone().settings();
	
		
		

	}

}
