package oop;

public class PhoneTest {

	public static void main(String[] args) {
		
		
		Phone myIPhone = new Phone("iPhone7", true, true, false, true);
		Phone mySamsungPhone = new Phone("galaxy s8", true, true, true, true);
		Phone myNokia3310 = new Phone("3310", false, false, false, false);
		
		myIPhone.settings();
		System.out.println("----");
		mySamsungPhone.settings();
		System.out.println("----");
		myNokia3310.settings();

	}

}
