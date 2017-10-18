package Menu;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class GameMode2 extends JFrame{
	
	public GameMode2() {
		//Fenetre
		this.setTitle("Risk");
		this.setSize(1000,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//

		this.setVisible(true);
	}
	
	public static void main(String[] args){
		GameMode2 jeu = new GameMode2();
	}
}
