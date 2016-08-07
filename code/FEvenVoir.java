import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import FEvenVoir.BoutonListener;

/*
 * Fenêtre qui montre les évènements en détail.
 * Elle est appellée par double clic sur un élément d'évènement dans l'affichage principal du calendrier.
 * On peut la fermer par "OK" ou bien passer à la modification de l'évènement affiché.
 */

public class FEvenVoir extends JFrame{
	public String nomEven = "Seminaire";
	public String lieu = "Sorbonne";
	public String invite = "PITROLO";
	public String dateEven = "26/08/2016";
	public String heureDeb = "10:30";
	public String heureFin = "15:30";
	
	//private JPanel pan=new JPanel();
	//private JPanel container = new JPanel();
	private JButton b1 =new JButton("OK");
	        
	public FEvenVoir() {
		this.setTitle("Affichage Evenement");
	    this.setSize(300, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	  	    
	    this.setBackground(Color.white);
	    this.setLayout(new GridLayout(7, 1));
	    Font police = new Font("Arial", Font.BOLD, 14);
	    this.getContentPane().add(new JLabel("Titre evenement : " + nomEven));
	    this.getContentPane().add(new JLabel("Lieu : " + lieu));
	    this.getContentPane().add(new JLabel("Invite : " + invite));
	    this.getContentPane().add(new JLabel("Date : " + dateEven));
	    this.getContentPane().add(new JLabel("Heure de debut : " + heureDeb));
	    this.getContentPane().add(new JLabel("Heure de fin : " + heureFin));
	    this.getContentPane().add(b1);
	    	    
	    this.setVisible(true);
	}
	
	// on �coute le bouton pour r�cup�rer les donn�es saisies dans les champs de la fen�tre
	/*class BoutonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("TEXT : nomEven " + nomEven.getText());
			System.out.println("TEXT : lieu " + lieu.getText());
			System.out.println("TEXT : invite " + invite.getText());
			System.out.println("TEXT : dateEven " + dateEven.getText());
			System.out.println("TEXT : heureDeb " + heureDeb.getText());
			System.out.println("TEXT : heureFin " + heureFin.getText());
		}
	}*/
    
}