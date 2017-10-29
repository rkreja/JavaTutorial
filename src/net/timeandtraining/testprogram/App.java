package net.timeandtraining.testprogram;

import net.timeandtraining.humans.Human;
import net.timeandtraining.phone.BanglaLink;
import net.timeandtraining.phone.GrameenPhone;
import net.timeandtraining.phone.Robi;

public class App {

	public static void main(String[] args) {
		
		GrameenPhone gp = new GrameenPhone();
		BanglaLink bl = new BanglaLink();
		Robi rb = new Robi();
		
		
		Human mamun = new Human("mamun");
		Human sonali = new Human("sonali");
		Human sakib = new Human("sakib");
		
		gp.purchaseSmartPhone(mamun, "iphone 8");
		bl.purchaseSmartPhone(sonali, "samsung galaxy s6");
		rb.purchaseSmartPhone(sakib, "iphone 10");
		
		String mamun_phone_number=mamun.getPhone().getPhoneNumber();
		String sonali_phone_number=sonali.getPhone().getPhoneNumber();
		String sakib_phone_number= sakib.getPhone().getPhoneNumber();
		
		System.out.println("Mamun's phone number is: "+ mamun_phone_number);
		System.out.println("Sonali's phone number is: "+ sonali_phone_number);
		System.out.println("Sakib's phone number is: "+ sakib_phone_number);

	}

}
