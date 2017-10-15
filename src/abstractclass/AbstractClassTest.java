package abstractclass;

public class AbstractClassTest {
	
	// Abstract class can only be extended but cannot be instantiated
	// Abstract class may or may not have abstract method
	// At least one method in a class is abstract, this class must have to be abstract
	
	// All subclass must implements abstract method coming from abstract class, 
		//if not, they also have to be abstract class

	public static void main(String[] args) {
		
		Vechicle v = new Car("mycar");
		v.drive();
		
	}
	
}

