package Menu;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class Fenetre extends JFrame implements ActionListener,WindowListener{
	private JPanel pan = new JPanel();
	private JButton mode_1 = new JButton("Classique");
	private JButton mode_2 = new JButton("Conquete");
	private JButton quit = new JButton("Quitter");
	
	public Fenetre() {
		//Fenetre
		this.setTitle("Risk");
		this.setSize(700,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setContentPane(new Background());
		//
		//positionnement boutons
		//this.setLayout(new GridLayout(3,1,50,50));
		this.setLayout(null);
		this.getContentPane().add(mode_1);
		this.getContentPane().add(mode_2);
		this.getContentPane().add(quit);
		mode_1.setBounds(200,200,300,45);
		mode_2.setBounds(200,260,300,45);
		quit.setBounds(200,320,300,45);
		//mode_2
		//
		//Actions boutons
		mode_1.addActionListener(this);
		mode_2.addActionListener(this);
		quit.addActionListener(this);
		this.setVisible(true);
		//
	}
	
	public static void main(String[] args){
		Fenetre fen = new Fenetre();
	}
	
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mode_1) {
        	this.dispose();
        	new GameMode1();
        }
        if(e.getSource() == mode_2) {
        	this.dispose();
        	new GameMode2();
        }
        if(e.getSource() == quit)
        	System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
