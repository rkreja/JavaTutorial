package rkreja.notes;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.spi.AudioFileReader;

public class Audio {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedAudioFileException, IOException {


		File file = new File("C:\\Users\\Reja's PC\\Music\\iTunes\\iTunes Media\\Music\\Unknown Artist\\Unknown Album\\020_TAHA.mp3");
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream(file)));
		
	System.out.println(audioInputStream.getFormat().getFrameRate());
		
		
		
		
	}

}
