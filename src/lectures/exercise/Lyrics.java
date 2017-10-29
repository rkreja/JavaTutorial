package lectures.exercise;

import java.util.concurrent.ThreadLocalRandom;

public class Lyrics {

	public static void main(String[] args) {
		String song= "Tumi Boruna hole hobo#"
				+ "Ami Shunil..#"
				+ "Tumi akash hole hobo#"
				+ "Shonkha cheel#"
				+ "Tumi nodi hole hobo#"
				+ "Ami jol#"
				+ "Tumi sraban hole hobo#"
				+ "Sraban dhol#"
				+ "Tumi pahar hole hobo#"
				+ "Ami shuboj#"
				+ "Tumi shashon korle hobo#"
				+ "Ami obujh#"
				+ "Tumi ornno hauw#"
				+ "hobo pakhi#"
				+ "Tumi osru hauw#"
				+ "hoye jabo akhi#"
				+ "";
		
		
		
		for(String s: song.split("#")) {
			char[] c=s.toCharArray();
			for(char l:c) {
				try {
					Thread.sleep(ThreadLocalRandom.current().nextLong(70, 120));
				} catch (InterruptedException e) {
				}
				System.out.print(l);
			}
			System.out.println("\n");
		}
	}

}
