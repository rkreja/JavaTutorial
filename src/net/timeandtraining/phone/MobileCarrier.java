package net.timeandtraining.phone;

import java.util.concurrent.ThreadLocalRandom;

import net.timeandtraining.humans.Human;

public abstract class MobileCarrier {
	
	public abstract String getCarrierCode();
	public abstract String getCarrierName();
	
	
	protected String generateNewPhoneNumber() {
		int i=ThreadLocalRandom.current().nextInt(111111, 999999);
		return getCarrierCode() + i;
	}
	
	
	public SmartPhone purchaseSmartPhone(Human human, String model) {
		System.out.println("Thank you "+ human.getName()+", for shopping with " +getCarrierName()+ ".\nEnjoy your "+ model);
		
		SmartPhone sp=new SmartPhone(model, true, true);
		
		sp.setPhoneNumber(generateNewPhoneNumber());
		
		human.setPhone(sp);
		return sp;
		
	}
	

}
