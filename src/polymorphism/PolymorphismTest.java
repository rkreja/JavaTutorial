package polymorphism;

public class PolymorphismTest {
	


	public static void main(String[] args) {
		
		
		Human monica = new Human("monica");
		Transport t = new Train("parabat");
		
		monica.travel(t, "Dhaka");
		

		
		
			
		
	}

}



class Human{
	String name;
	
	
	public Human(String name) {
		this.name=name;
	}
	
	
	
	
	public void travel(Transport transport, String destination) {
		System.out.println(this.name + " traveling to "+ destination + " by "+ transport.name);
	}
	

	
}


class Bus extends Transport{

	public Bus(String name) {
		super(name);
	}

}

class Train extends Transport{

	public Train(String name) {
		super(name);
	}

}

class Car extends Transport{

	public Car(String name) {
		super(name);
	}
	
	
}

class Transport{
	String name;
	
	
	public Transport(String name) {
		this.name=name;
	}
}


