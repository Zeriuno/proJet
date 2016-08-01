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

/*
 * Fenêtre qui montre les évènements en détail.
 * Elle est appellée par double clic sur un élément d'évènement dans l'affichage principal du calendrier.
 * On peut la fermer par "OK" ou bien passer à la modification de l'évènement affiché.
 */

public class FEvenVoir extends JFrame{
	public String nomEven ;
	private JPanel pan=new JPanel();
	private JPanel calendrier=new JPanel();
	private JPanel container = new JPanel();
	
    /*
     * Champs de saisie
    
    
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
     */
    
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

	    JPanel b1 = new JPanel();
	    //On définit le layout en lui indiquant qu'il travaillera en ligne
	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
	    b1.add(new JButton("Bouton 1"));

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
	    invite.setPreferredSize(new Dimension(150, 30));
	    //nomEven.setForeground(Color.BLUE); // style
	    top.add(labelinvite);
	    top.add(invite);
	    dateEven.setPreferredSize(new Dimension(150, 30));
	    top.add(labeldateEven);
	    top.add(dateEven);
	    top.add(labelheureDeb);
	    top.add(heureDeb);
	    heureDeb.setPreferredSize(new Dimension(150, 30));
	    top.add(labelheureFin);
	    top.add(heureFin);
	    //heureFin.setFont(police);
	    heureFin.setPreferredSize(new Dimension(150, 30));
	    //heureFin.setForeground(Color.BLUE);
	    
	    
	    container.add(top, BorderLayout.NORTH);
	    this.setContentPane(container);
	    
	    this.getContentPane().add(b4);
	    this.setVisible(true);
	    this.setVisible(true);
	}
    
}