package abstractclass;

public abstract class Vechicle {
	
	private String name;
	
	
	public Vechicle(String name) {
		this.name=name;
	}
	
	public abstract void drive();
	
	public String getName() {
		return this.name;
	}
	
	

	

}
