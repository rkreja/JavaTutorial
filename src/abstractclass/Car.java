package abstractclass;

public class Car extends Vechicle{

	public Car(String name) {
		super(name);
	}

	@Override
	public void drive() {
		System.out.println("Car is moving..");
		
	}

	

}
