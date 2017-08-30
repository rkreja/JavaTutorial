package rkreja.notes.exercises;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		String op;
		int number1;
		int number2;
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("************   CALCULATOR  ************");
		System.out.println("Please enter first number below:");
		number1=scanner.nextInt();
		
		System.out.println("Please enter second number below:");
		number2=scanner.nextInt();
		
		System.out.println("Please enter operator below, example ('+' , '-' , '*', or '/'):");
		scanner = new Scanner(System.in);
		op=scanner.nextLine();
		
		
		if(op.equals("+")) {
			result=number1+number2;
		}else if(op.equals("-")) {
			result=number1-number2;
		}else if(op.equals("/")) {
			result=number1/number2;
		}else if(op.equals("*")) {
			result=number1*number2;
		}else {
			System.out.println("You probably entered invalid operator. This calculator only supports +,-,* or /");
		}
		
		System.out.println("Calculated result: "+ result);

	}

}
