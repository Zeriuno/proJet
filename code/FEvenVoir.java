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
	
<<<<<<< HEAD
    
    
    
    
    private JTextField nomEven = new JTextField("RDV"); // Valeur par défaut
    private JLabel labelnomEven = new JLabel("Titre événement:"); // texte avant le champ
    private JTextField invite = new JTextField("moi@domai.ne"); // Valeur par défaut
    private JLabel labelinvite = new JLabel("Invité:"); // texte avant le champ
    private JTextField dateEven = new JTextField("JJ/MM/AAAA"); // Valeur par défaut
    private JLabel labeldateEven = new JLabel("Date:"); // texte avant le champ
    private JTextField heureDeb = new JTextField("HH:MM"); // Valeur par défaut
    private JLabel labelheureDeb = new JLabel("Heure de début:"); // texte avant le champ
    private JTextField heureFin = new JTextField("HH:MM"); // Valeur par défaut
    private JLabel labelheureFin = new JLabel("Heure de fin:"); // texte avant le champ
     
    
	public FEvenVoir(FEvenVoirPetit petit)
	/*
	 * Constructeur de la fenêtre.
	 * Il reçoit en paramètre un affichage de la fenêtre en petit, grâce auquel il récupère les informations nécessaires.
	 * 
	 */
	{
		this.nomEven = petit.nomEven ;
		this.setTitle(this.nomEven)  ;
		/*
		 * lieuEven
		 * heureDebut
		 * heureFin
		 * invitePrenom
		 * inviteNom
		 * inviteMel
		 * 
		 */
		
	    this.setSize(1400, 300);
=======
	//private JPanel pan=new JPanel();
	//private JPanel container = new JPanel();
	private JButton b1 =new JButton("OK");
	        
	public FEvenVoir() {
		this.setTitle("Affichage Evenement");
	    this.setSize(300, 300);
>>>>>>> f6250d558f88f2dc1992f5837105ef83af9534f4
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	  	    
	    this.setBackground(Color.white);
	    this.setLayout(new GridLayout(7, 1));
	    Font police = new Font("Arial", Font.BOLD, 14);
	    this.getContentPane().add(new JLabel("Titre �v�nement : " + nomEven));
	    this.getContentPane().add(new JLabel("Lieu : " + lieu));
	    this.getContentPane().add(new JLabel("Invit� : " + invite));
	    this.getContentPane().add(new JLabel("Date : " + dateEven));
	    this.getContentPane().add(new JLabel("Heure de d�but : " + heureDeb));
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
