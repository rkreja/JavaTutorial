package rkreja.notes;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class MusicPlayer implements Runnable{
	private boolean playing=false;
	private boolean powerOn=false;
	private Cd cd = new Cd();
	Thread thread;
	
	
	public MusicPlayer() {
		powerOn=true;
		thread = new Thread(this);
		thread.start();
	}
	
	private void play(int trackNumber, String title) {
		System.out.println("Now Playing Track: "+ trackNumber);
		System.out.println("Title: "+ title);

	}
	
	
	

	
	
	
	
	
	
	class Cd{
		String[] tracks= {"Didha", "Bindu tumi", "Ami Kaan Peter Roi"};
	}










	@Override
	public void run() {
		while(powerOn) {
			System.out.println("Enter command below:");
			Scanner scanner = new Scanner(System.in);
			String s=scanner.nextLine();
			if(s.equalsIgnoreCase("play")) {
				String[] tracks=this.cd.tracks;
				for (int i = 0; i < tracks.length; i++) {
					int x=i+1;
					this.play(x, tracks[i]);
				}
			}else if(s.equalsIgnoreCase("stop")) {
				this.powerOn=false;
				System.exit(0);
			}
			
			
		}
		
		
	}



















}
