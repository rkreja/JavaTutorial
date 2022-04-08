package lectures.exercise;

import java.util.concurrent.ThreadLocalRandom;

/***
 * 
 * @author rkreja
 * This class is to demonstrate how to split texts and display one letter at a time in console.
 * 
 * To develop more skills for career: visit us at: https://www.timeandtraining.net
 *
 */
public class Lyrics2 {

	public static void main(String[] args) throws InterruptedException {
		
		//declare a variable and store song texts
		String song = ""
				+ "Aadho raatein jadi ghum venge jaay\n"
				+ "mone more more prio\n"
				+ "chaad hoye robo akasher gaay\n"
				+ "batayan khule dio\n"
				+ "Aadho raatein jadi ghum venge jaay...\n"

				+ "Sheta juchonar alor konika\n"
				+ "jano se tomar premero monika\n"
				+ "kolonk sakhein joray royeche\n"
				+ "premer kolonko sakhein joraye royeche\n"
				+ "akhi vore nio prio\n"
				+ "chad hoye robo akasher gaay\n"
				+ "batayan khule dio.\n"
				+ "Aadho raatein jadi ghum venge jaay...\n"
				
				+ "Bhuli nai prio bhuli nai\n"
				+ "khuli nai ranga rakhi\n"
				+ "Munchi nai premo chandano likha\n"
				+ "diyecho ja lolatein anki\n"
				+ "bhuli nai prio\n"
				+ "bhuli nai\n"
				+ "chaitro diner olosho belay\n"
				+ "gaan khani more\n"
				+ "mone pore haay\n"
				+ "chaitro diner olosho belay\n"
				+ "jodi gaan khani more\n"
				+ "mone pore haay\n"
				
				+ "jharano patar mormo gaane\n"
				+ "sei shuraviti sunio\n"
				+ "Aadho raatein jadi ghum venge jaay...\n";
		
		
		//display each line of song in console by a loop
		
//		String[] lines = song.split("\n");
		
//		for(String line: lines ) {
			
			//here single line of song  will display
			//split the current line by characters to display each word by one letter at a time
			char[] characters = song.toCharArray();
			for(char character: characters) {
				
				if(Character.isSpace(character)) {
					Thread.sleep(130);
				}else {
					Thread.sleep(ThreadLocalRandom.current().nextInt(60, 100));
				}
					
				
				if(Character.getType(character) == Character.LINE_SEPARATOR)
					System.out.println("\\n");
				
				System.err.print(character);
			}
			
			
//		}
		

	}

}
