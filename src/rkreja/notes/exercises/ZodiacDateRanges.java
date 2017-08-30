package rkreja.notes.exercises;

import java.util.Scanner;

public class ZodiacDateRanges {

	public static void main(String[] args) {
		System.out.println("****ZODIAC date range identifier****");
		System.out.println("---------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the sign name:");
		String s=scanner.nextLine();
		
		if(s.equalsIgnoreCase("aries")) {
			System.out.println("Date Range for ARIES is: March 21 - April 19");
		}else if(s.equalsIgnoreCase("taurus")) {
			System.out.println("Date Range for TAURUS is: April 20 - May 20");
		}else if(s.equalsIgnoreCase("gemini")) {
			System.out.println("Date Range for GEMINI is: May 21 - June 20");
		}else if(s.equalsIgnoreCase("cancer")) {
			System.out.println("Date Range for CANCER is: June 21 - July 22");
		}else if(s.equalsIgnoreCase("leo")) {
			System.out.println("Date Range for LEO is: July 23 - August 22");
		}else if(s.equalsIgnoreCase("virgo")) {
			System.out.println("Date Range for VIRGO is: August 23 - September 22");
		}else if(s.equalsIgnoreCase("libra")) {
			System.out.println("Date Range for LIBRA is: September 23 - October 22");
		}else if(s.equalsIgnoreCase("scorpio")) {
			System.out.println("Date Range for SCORPIO is: October 23 - November 21");
		}else if(s.equalsIgnoreCase("sagittarius")) {
			System.out.println("Date Range for SAGITTARIUS is: November 22 - December 21");
		}else if(s.equalsIgnoreCase("Capricorn")) {
			System.out.println("Date Range for CAPRICORN is: December 22 - January 19");
		}else if(s.equalsIgnoreCase("aquarius")) {
			System.out.println("Date Range for AQUARIUS is: January 20 - February 18");
		}else if(s.equalsIgnoreCase("pisces")) {
			System.out.println("Date Range for PISCES is: February 19 - March 20");
		}else {
			System.out.println("You have entered invalid sign.");
		}
		
		

	}

}
