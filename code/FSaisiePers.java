import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FSaisiePers extends JFrame{
	private JPanel pan=new JPanel();
	private JPanel calendrier=new JPanel();
	private JPanel container = new JPanel();
    private JButton boutonG=new JButton("< Précedant");
    private JButton boutonD=new JButton("Prochain >");
    private JButton boutonAjoutPers=new JButton("+Personne");
    private JButton boutonAjoutEven=new JButton("+Evenement");
    
    /*
     * Champs de saisie
     */

    private JTextField preNomPers = new JTextField("Victor"); // Valeur par défaut
    private JLabel labelpreNomPers = new JLabel("Prénom:"); // texte avant le champ
    private JTextField nomPers = new JTextField("Hugo"); // Valeur par défaut
    private JLabel labelnomPers = new JLabel("Nom:"); // texte avant le champ
    private JTextField mailPers = new JTextField("vic@hu.go"); // Valeur par défaut
    private JLabel labelmailPers = new JLabel("Mél:"); // texte avant le champ
    		
	public FSaisiePers() {
		this.setTitle("Bouton");
	    this.setSize(800, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	  //On définit le layout à utiliser sur le content pane

	    //this.setLayout(new GridLayout());
	   
	    //BorderLayout
	    this.getContentPane().add(boutonG, BorderLayout.SOUTH);
	    //Grid  Layout
	    this.setLayout(new GridLayout(1, 2));
	    this.getContentPane().add(boutonG);
	    this.getContentPane().add(boutonD);
	    
	    //Boxlayout


	    JPanel b4 = new JPanel();
	    //On positionne maintenant ces trois lignes en colonne
	    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));

	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    JPanel top = new JPanel();
	    Font police = new Font("Arial", Font.BOLD, 14);
	    //nomEven.setFont(police); // style
	  //nomEven.setForeground(Color.BLUE); // style
	    preNomPers.setPreferredSize(new Dimension(150, 30));
	    top.add(labelpreNomPers);
	    top.add(preNomPers);
	    
	    nomPers.setPreferredSize(new Dimension(150, 30));
	    top.add(labelnomPers);
	    top.add(nomPers);
	    mailPers.setPreferredSize(new Dimension(150, 30));
	    //nomEven.setForeground(Color.BLUE); // style
	    top.add(labelmailPers);
	    top.add(mailPers);
	    
	    
	    container.add(top, BorderLayout.NORTH);
	    this.setContentPane(container);
	    
	    this.getContentPane().add(b4);
	    this.setVisible(true);
	    this.setVisible(true);
	}
    
}