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

public class FSaisiePers extends JFrame{
	private JPanel container = new JPanel();
    private JButton b1 =new JButton("ENREGISTRER");
    
    //Champs de saisie

    private JTextField nomPers = new JTextField("Hugo"); // Valeur par défaut
    private JLabel labelnomPers = new JLabel("Nom:"); // texte avant le champ
    private JTextField preNomPers = new JTextField("Victor"); // Valeur par défaut
    private JLabel labelpreNomPers = new JLabel("Prénom:"); // texte avant le champ
    private JTextField mailPers = new JTextField("vic@hu.go"); // Valeur par défaut
    private JLabel labelmailPers = new JLabel("Mél:"); // texte avant le champ
    		
	public FSaisiePers() {
		this.setTitle("Personne");
	    this.setSize(700, 150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	  
	    b1.addActionListener(new BoutonListener());
	    
	    
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    JPanel top = new JPanel();
	    Font police = new Font("Arial", Font.BOLD, 14);
	    nomPers.setPreferredSize(new Dimension(150, 30));
	    top.add(labelnomPers);
	    top.add(nomPers);
	    preNomPers.setPreferredSize(new Dimension(150, 30));
	    top.add(labelpreNomPers);
	    top.add(preNomPers);
	    mailPers.setPreferredSize(new Dimension(150, 30));
	    top.add(labelmailPers);
	    top.add(mailPers);
	    top.add(b1);	    
	    
	    this.setContentPane(top);
	    
	    this.setVisible(true);
	}
	
	class BoutonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("TEXT : nomPers " + nomPers.getText());
			System.out.println("TEXT : preNomPers " + preNomPers.getText());
			System.out.println("TEXT : mailPers " + mailPers.getText());
		}
	}
}