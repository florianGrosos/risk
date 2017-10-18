package Menu;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class GameMode1 extends JFrame{
	
	public GameMode1() {
		//Fenetre
		this.setTitle("Risk");
		this.setSize(1000,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//

		this.setVisible(true);
	}
	
	public static void main(String[] args){
		GameMode1 jeu = new GameMode1();
	}
}