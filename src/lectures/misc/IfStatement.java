package lectures.misc;

public class IfStatement {

	public static void main(String[] args) {
		
		
		String product="SAMSUNG";
		
		System.out.println("Welcome to mobile market!");
		
		if(product.equalsIgnoreCase("iphone")) {
			
			System.out.println("Price for iphone is: $1000");
			
		}else if(product.equalsIgnoreCase("samsung")) {
			
			System.out.println("Price for samsung is: $950");
			
		}else {
			
			System.out.println("Sorry we dont have this product.");
		}
		
		

	}

}
