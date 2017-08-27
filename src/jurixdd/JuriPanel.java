package jurixdd;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class JuriPanel extends JPanel {
	
	private BufferedImage image;
	
	public JuriPanel(BufferedImage img) {
		super();
		this.image = img;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, null);
	}

}
