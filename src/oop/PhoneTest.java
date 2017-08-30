package oop;

public class PhoneTest {

	public static void main(String[] args) {

		Phone myIPhone = new Phone("iphone 7", true, true, false, true);
		Phone mySamsungPhone = new Phone("galaxy s8", true, true, true, true);
		Phone myNokiaPhone = new Phone("nokia 3310", false, false, false, false);
		
		
		myIPhone.settings();
		System.out.println("------");
		mySamsungPhone.settings();
		System.out.println("------");
		myNokiaPhone.settings();


		
	}

}
