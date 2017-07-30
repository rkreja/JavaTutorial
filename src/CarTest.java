
public class CarTest {

	public static void main(String[] args) {
	Car mycar = new Car();
	
	System.out.println(mycar.getColor());
	System.out.println(mycar.getDoor());
	System.out.println(mycar.getModel());
	System.out.println(mycar.getPrice());
	System.out.println(mycar.isAutomatic());
	System.out.println(mycar.isAwd());
	
	System.out.println("*****************");
	mycar.setColor("RED");
	mycar.setDoor(4);
	mycar.setModel("AUDIO Q7");
	mycar.setPrice(42000);
	mycar.setAutomatic(false);
	mycar.setAwd(false);
	
	System.out.println("*****************");
	System.out.println(mycar.getColor());
	System.out.println(mycar.getDoor());
	System.out.println(mycar.getModel());
	System.out.println(mycar.getPrice());
	System.out.println(mycar.isAutomatic());
	System.out.println(mycar.isAwd());
	

	}

}
