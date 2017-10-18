package Menu;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Background extends JPanel{
	public void paintComponent(Graphics g) {
		
		try {
			Image img = ImageIO.read(new File("fond.jpg"));
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			Image logo = ImageIO.read(new File("Risk_logo.png"));
			g.drawImage(logo, 155,10,385,170,this);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
