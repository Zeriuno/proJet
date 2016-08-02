import java.awt.BorderLayout;
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

public class FSaisieEven extends JFrame{
	private JPanel pan=new JPanel();
	private JPanel calendrier=new JPanel();
	private JPanel container = new JPanel();
    private JButton boutonG=new JButton("< Pr�cedant");
    private JButton boutonD=new JButton("Prochain >");
    private JButton boutonAjoutPers=new JButton("+Personne");
    private JButton boutonAjoutEven=new JButton("+Evenement");
    private JButton b1 =new JButton("ENREGISTRER"); // bouton plac� en private et pas 
    //dans la m�thode car sinon on n'arrive pas � dire au bouton qu'il est �cout�
    
    /*
     * Champs de saisie
     */
    
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
		this.setTitle("Bouton");
	    this.setSize(1200, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	  //On d�finit le layout � utiliser sur le content pane

	    //this.setLayout(new GridLayout());
	   
	    //BorderLayout
	    this.getContentPane().add(boutonG, BorderLayout.SOUTH);
	    //Grid  Layout
	    this.setLayout(new GridLayout(1, 2));
	    this.getContentPane().add(boutonG);
	    this.getContentPane().add(boutonD);
	    
	    //Boxlayout

	    //JPanel b1 = new JPanel();
	    //On d�finit le layout en lui indiquant qu'il travaillera en ligne
	    //b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
	    //b1.add(new JButton("Bouton 1"));
	    
	    b1.addActionListener(new BoutonListener()); //on indique au bouton qu'il est �cout�

	    JPanel b2 = new JPanel();
	    //Idem pour cette ligne
	    b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
	    b2.add(new JButton("Bouton 2"));
	    b2.add(new JButton("Bouton 3"));

	    JPanel b3 = new JPanel();
	    //Idem pour cette ligne
	    b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
	    b3.add(new JButton("Bouton 4"));
	    b3.add(new JButton("Bouton 5"));
	    b3.add(new JButton("Bouton 6"));

	    JPanel b4 = new JPanel();
	    //On positionne maintenant ces trois lignes en colonne
	    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
	    b4.add(b1);
	    b4.add(b2);
	    b4.add(b3);

	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    JPanel top = new JPanel();
	    Font police = new Font("Arial", Font.BOLD, 14);
	    //nomEven.setFont(police); // style
	    nomEven.setPreferredSize(new Dimension(150, 30));
	    //nomEven.setForeground(Color.BLUE); // style
	    top.add(labelnomEven);
	    top.add(nomEven);
	  //lieu.setFont(police); // style
	    lieu.setPreferredSize(new Dimension(150, 30));
	    //nomEven.setForeground(Color.BLUE); // style
	    top.add(labellieu);
	    top.add(lieu);
	    invite.setPreferredSize(new Dimension(150, 30));
	    //nomEven.setForeground(Color.BLUE); // style
	    top.add(labelinvite);
	    top.add(invite);
	    dateEven.setPreferredSize(new Dimension(90, 30));
	    top.add(labeldateEven);
	    top.add(dateEven);
	    top.add(labelheureDeb);
	    top.add(heureDeb);
	    heureDeb.setPreferredSize(new Dimension(60, 30));
	    top.add(labelheureFin);
	    top.add(heureFin);
	    //heureFin.setFont(police);
	    heureFin.setPreferredSize(new Dimension(60, 30));
	    //heureFin.setForeground(Color.BLUE);
	    	    
	    
	    container.add(top, BorderLayout.NORTH);
	    this.setContentPane(container);
	    
	    this.getContentPane().add(b4);
	    this.setVisible(true);
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
