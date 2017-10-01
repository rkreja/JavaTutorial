package com.timeandtraining.phone;

import com.timeandtraining.humans.Human;

public class Zmobile {
	
	
	
	public SmartPhone purchaseSmartPhone(Human human, String model) {
		System.out.println("Thank you "+ human.getName()+", for shopping with ZMobile.\nEnjoy your "+ model);
		
		SmartPhone sp=new SmartPhone(model, true, true);
		human.setPhone(sp);
		return sp;
		
	}
	public SmartPhone purchaseNonSmartPhone(Human human, String model) {
		System.out.println("Thank you "+ human.getName()+", for shopping with ZMobile.\nEnjoy your "+ model);
		
		SmartPhone sp=new SmartPhone(model, true, true);
		human.setPhone(sp);
		return sp;
		
	}
	
	

}
