package jurixdd;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class JuriXDD {
	
	protected static int THE_MIGHTY_FUCK_UP_CONSTANT = 50; // SET BELOW 50 FOR COMPLETE RAPE
	
	protected static JFrame frame;
	protected static JuriPanel blyat;
	
	protected static Random rand;
	
	private static BufferedImage juri;
	
	protected static synchronized void playSound(final String url) {
		  new Thread(new Runnable() {
		  // The wrapper thread is unnecessary, unless it blocks on the
		  // Clip finishing; see comments.
		    public void run() {
		      try {
		        Clip clip = AudioSystem.getClip();
		        AudioInputStream inputStream = AudioSystem.getAudioInputStream(
		        		JuriXDD.class.getResourceAsStream(url)
		        );
		        clip.open(inputStream);
		        clip.start(); 
		      } catch (Exception e) {
		        System.err.println(e.getMessage());
		      }
		    }
		  }).start();
		}
	
	public static void main(String[] args) throws Exception {
		
		// init:
		
		frame = new JFrame("xDDDDDDDDDDDDDDDDDDDDD");
		rand = new Random();
		juri = ImageIO.read(new File(JuriXDD.class.getResource("juri.jpg").getFile()));
		blyat = new JuriPanel(juri);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		blyat.setPreferredSize(new Dimension(900, 900));
		
		frame.add(blyat);
		frame.pack();
		
		frame.setVisible(true);
		
				
		// :init
		
		//lel
		
		try {
			
			int a = 100;
			
			while ( true ) {
				
				frame.setLocation(rand.nextInt(1920)-500, rand.nextInt(1080)-500);
				playSound("wilhelm.wav");
				if (a > THE_MIGHTY_FUCK_UP_CONSTANT) {
					Thread.sleep(a);
					a-=2;
				}
				
			}
			
		} catch(Exception e) { // II wannnaa catch them allll
			e.printStackTrace();
			System.exit(-1);
		}
		
		
	}

}
