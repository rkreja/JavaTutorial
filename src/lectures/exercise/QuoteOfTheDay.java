package lectures.exercise;

import java.util.concurrent.ThreadLocalRandom;

public class QuoteOfTheDay {
	
	private static String[] quotes = new String[] {
			

"Strive not to be a success, but rather to be of value. –Albert Einstein",
"The mind is everything. What you think you become.  –Buddha",
"The best time to plant a tree was 20 years ago. The second best time is now. –Chinese Proverb",
"Your time is limited, so don’t waste it living someone else’s life. –Steve Jobs",
"The two most important days in your life are the day you are born and the day you find out why. –Mark Twain",
"Programs must be written for people to read, and only incidentally for machines to execute.― Harold Abelson",
"Truth can only be found in one place: the code. ― Robert C. Martin"
			
			
	};
	
	public static void main(String[] args) {

		
		System.out.println("\n\n\t\t\""+quotes[ThreadLocalRandom.current().nextInt(0, quotes.length)]+"\"");
		
		
		
	}

}
