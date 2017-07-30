
public class Car {
	
	private String model="BMW X5";
	private String color="Black";
	
	private int price=75000;
	private int door=2;
	
	private boolean awd=true;
	private boolean automatic=true;
	
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public void setAwd(boolean awd) {
		this.awd = awd;
	}
	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}
	public int getDoor() {
		return door;
	}
	public boolean isAwd() {
		return awd;
	}
	public boolean isAutomatic() {
		return automatic;
	}
	
	
	


}
