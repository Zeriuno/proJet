import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FSaisieEven extends JFrame{
	private JPanel container = new JPanel();
    private JButton b1 =new JButton("ENREGISTRER"); // bouton plac� en private et pas 
    
    // Champs de saisie
    
    private JTextField nomEven = new JTextField("RDV"); // Valeur par d�faut
    private JLabel labelnomEven = new JLabel("Titre �v�nement:"); // texte avant le champ
    private JTextField lieu = new JTextField("Lieu"); // Valeur par d�faut
    private JLabel labellieu = new JLabel("Lieu:"); // texte avant le champ
    private JTextField invite = new JTextField("moi@domai.ne"); // Valeur par d�faut
    private JLabel labelinvite = new JLabel("Invit�:"); // texte avant le champ
    private JTextField dateEven = new JTextField("JJ/MM/AAAA"); // Valeur par d�faut
    private JLabel labeldateEven = new JLabel("Date:"); // texte avant le champ
    private JTextField heureDeb = new JTextField("HH:MM"); // Valeur par d�faut
    private JLabel labelheureDeb = new JLabel("Heure de d�but:"); // texte avant le champ
    private JTextField heureFin = new JTextField("HH:MM"); // Valeur par d�faut
    private JLabel labelheureFin = new JLabel("Heure de fin:"); // texte avant le champ
    
	public FSaisieEven() {
		this.setTitle("Evenement");
	    this.setSize(600, 150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	  	    
	    b1.addActionListener(new BoutonListener()); //on indique au bouton qu'il est �cout�

	    
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    JPanel top = new JPanel();
	    Font police = new Font("Arial", Font.BOLD, 14);
	    nomEven.setPreferredSize(new Dimension(220, 30));
	    top.add(labelnomEven);
	    top.add(nomEven);
	    lieu.setPreferredSize(new Dimension(200, 30));
	    top.add(labellieu);
	    top.add(lieu);
	    invite.setPreferredSize(new Dimension(120, 30));
	    top.add(labelinvite);
	    top.add(invite);
	    dateEven.setPreferredSize(new Dimension(90, 30));
	    top.add(labeldateEven);
	    top.add(dateEven);
	    top.add(labelheureDeb);
	    top.add(heureDeb);
	    heureDeb.setPreferredSize(new Dimension(50, 30));
	    top.add(labelheureFin);
	    top.add(heureFin);
	    heureFin.setPreferredSize(new Dimension(50, 30));
	    top.add(b1);
	    	    
	    this.setContentPane(top);
	    this.setVisible(true);
	}
	
	// on �coute le bouton pour r�cup�rer les donn�es saisies dans les champs de la fen�tre
	class BoutonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("TEXT : nomEven " + nomEven.getText());
			System.out.println("TEXT : lieu " + lieu.getText());
			System.out.println("TEXT : invite " + invite.getText());
			System.out.println("TEXT : dateEven " + dateEven.getText());
			System.out.println("TEXT : heureDeb " + heureDeb.getText());
			System.out.println("TEXT : heureFin " + heureFin.getText());
		}
	}
    
}
