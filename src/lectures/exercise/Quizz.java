package lectures.exercise;

import java.util.Scanner;

public class Quizz {

	public static void main(String[] args) {
		
		int result=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("****Welcome to QUIZ contest****");
		System.out.println("---------------------------------------------------");
		System.out.println("Please enter true or false for following questions");
		System.out.println("---------------------------------------------------");
		
		System.out.println("Sylhet is capital of Bangladesh?");
		if(scanner.nextLine().equals("false")) {
			result++;
		}
		System.out.println("Bangladesh national anthem written by Nazrul islam.");
		if(scanner.nextLine().equals("false")) {
			result++;
		}
		
		System.out.println("Mortaza is the last name of a BD cricketer 'Mashrafe'.");
		if(scanner.nextLine().equals("true")) {
			result++;
		}
		System.out.println("Dhaka also known as 'City of Mosque'");
		if(scanner.nextLine().equals("true")) {
			result++;
		}
		
		System.out.println("JAVA is simple :)");
		if(scanner.nextLine().equals("true")) {
			result++;
		}
		
		System.out.println("***********************************************");
		System.out.println("Your Score is: "+ result);
		System.out.println("Incorrect answer: "+ (5-result));
		System.out.println("***********************************************");
		
		

	}

}
