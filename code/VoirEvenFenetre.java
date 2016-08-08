import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

//import FEvenVoir.BoutonListener;

/*
 * Fenêtre qui montre les évènements en détail.
 * Elle est appellée par double clic sur un élément d'évènement dans l'affichage principal du calendrier.
 * On peut la fermer par "OK" ou bien passer à la modification de l'évènement affiché.
 */

public class VoirEvenFenetre extends JFrame{
	public String nomEven = "Seminaire";
	public String lieu = "Sorbonne";
	public String invite = "PITROLO";
	public String dateEven = "26/08/2016";
	public String heureDeb = "10:30";
	public String heureFin = "15:30";
	

	private JButton b1 =new JButton("OK");
	        
	public VoirEvenFenetre(Evenement even) {
		this.setTitle("Affichage Evenement");
	    this.setSize(300, 300);
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	  	    
	    this.setResizable(false);
	    this.setLayout(new BorderLayout());
	    Font police = new Font("Arial", Font.BOLD, 14);
	   
	    JPanel div=new JPanel();
	    JPanel boutton=new JPanel();
	    div.setLayout(new GridLayout(7,1));
	    
		// permet de fermer la fen�tre lorsque l'on clic sur le bouton "ENREGISTRER"
	    b1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				if(e.getSource()==b1){
					setVisible(false);	
					dispose();
				}
			}
		});
	    
		JPanel buttonPane = new JPanel();
		buttonPane.add(b1);
		
		String nom=Bdmanager.extraPers(even.idEven);
		ArrayList<String> pers=Bdmanager.selectPers(even.idEven);
		
	    div.add(new JLabel("Titre evenement : " + even.nomEven));
	    div.add(new JLabel("Lieu : " + even.textEven));
	    if (nom!=null){div.add(new JLabel("Invite : " + nom));
	    div.add(new JLabel("mail : " + pers.get(2)));
	    }
	    div.add(new JLabel("Heure de debut : " + even.debutEven));
	    div.add(new JLabel("Heure de fin   : " + even.finEven));
        div.setBackground(Color.WHITE);
	    div.setBorder(new EmptyBorder(10, 10, 10, 10));
	    this.getContentPane().add(div,BorderLayout.CENTER);
	    this.getContentPane().add(buttonPane,BorderLayout.SOUTH );
	    	    
	    this.setVisible(true);
	}    
}