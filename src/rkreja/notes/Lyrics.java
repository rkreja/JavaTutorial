package rkreja.notes;

import java.util.concurrent.ThreadLocalRandom;

public class Lyrics {

	public static void main(String[] args) throws InterruptedException {
		String song="Main agar\nsitaaron se.. chura ke laaun..\nroshni..\nHawaaon se chura ke laaun.. \nraagini\nNa poori ho sakegi.. \nunse magar \nteri kami..\n\nMain agar.. \nnazaron se chura ke laaun \nrangatein\nMazaaron se chura ke laaun \nbarqatein\nNa poori ho sakegi unse magar.. \nteri kami\n\nYeh duniya paraayi hai\nBas ek apna hai tu..\nJo sach ho mera woh\nSavere ka sapna hai tu.......\n\nDekhunga tera raasta............\nHo kuch tujhe bas Khuda na.. \nkhasta\n..\n.....\n....\n.....\n......\n........\n.........Tere bina umrr ke safar mein\nBada hi tanha hoon main\nRaftaar jo waqt ki pakad na sake\nWoh lamha hoon main\n\nFaagun ke mahine \ntere bina hain pheeke\nJo tu nahi toh saare \nsaawan mere sookhe\n\nMain agar \nkitaabon se chura ke laaun \nqaayde\nHisaabon se chura ke laaun \nfaayde\nNa poori ho sakegi unse magar teri kami\n\nMain agar \nsitaaron se chura ke laaun \nroshni\nHawaaon se chura ke laaun \nraagini\nNa poori ho sakegi unse magar \nteri kami\n\nYeh duniya paraayi hai\nBas ek apna hai tu\nJo sach ho mera woh\nSavere ka sapna hai tu\n\nDekhunga tera raasta\nHo kuch tujhe bas \nKhuda naaa\nkhasta\nKhuda na khasta...\nKhuda na khastaaa....";
		String[]lines=song.split("[\n]");
		Thread.sleep(16000);
		for(String s:lines) {
			
			for(char c:s.toCharArray()) {
				System.out.print(c);
				if(c=='.') {
					Thread.sleep(ThreadLocalRandom.current().nextLong(800));
				}else {
				Thread.sleep(ThreadLocalRandom.current().nextLong(135));
				}
			}
			Thread.sleep(300);
			System.out.println("");
		}
		
		
		
	}
	
	

}
