import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


// to be improved : exception- date format  
// control begin time < end time
// can make initial input visible but insaisible
// une fenetre d'erreur + afficher ajouter personne line 111


public class SaisieEvenFenetre extends JFrame{
    private JButton b1 =new JButton("ENREGISTRER"); // bouton enregistrement 
    
    // Champs de saisie
    
    private JTextField nomEven = new JTextField("RDV"); // Valeur par défaut
    private JLabel labelnomEven = new JLabel("Titre événement:"); // texte avant le champ
    private JTextField lieu = new JTextField("Lieu"); // Valeur par défaut
    private JLabel labellieu = new JLabel("Lieu:"); // texte avant le champ
    private JTextField invite = new JTextField("moi@domai.ne"); // Valeur par défaut
    private JLabel labelinvite = new JLabel("Invité:"); // texte avant le champ
    private JTextField dateEven = new JTextField("JJ/MM/AAAA"); // Valeur par défaut
    private JLabel labeldateEven = new JLabel("Date:"); // texte avant le champ
    private JTextField heureDeb = new JTextField("HH:MM"); // Valeur par défaut
    private JLabel labelheureDeb = new JLabel("Heure de début:"); // texte avant le champ
    private JTextField heureFin = new JTextField("HH:MM"); // Valeur par défaut
    private JLabel labelheureFin = new JLabel("Heure de fin:"); // texte avant le champ
    
	public SaisieEvenFenetre() {
		this.setTitle("Evenement");
	    this.setSize(600, 150);
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    
	    
	    //Remarque :
	    //boutonlistener permet d'indiquer le bouton d'action 
	    //actionlistener permet de utiliser la fonction actionPerformed 
	    //actionPerformed permet aux bouton d'appeller l'action    
	    b1.addActionListener(new BoutonListener()); 
	    //on indique au bouton qu'il est écouté

	    //II Div pour les boutons et les panels
	    JPanel top = new JPanel();
	    Font police = new Font("Arial", Font.BOLD, 14);
	    nomEven.setPreferredSize(new Dimension(220, 30));
	    // permet de vider le champ de saisie lorsqu'un clic à lieu afin de pouvoir saisir les données souhaitées
	    nomEven.addMouseListener(new MouseListener(){
	        public void mouseReleased(MouseEvent e) {}         
	        public void mousePressed(MouseEvent e) {}          
	        public void mouseExited(MouseEvent e) {}           
	        public void mouseEntered(MouseEvent e) {}          
	    	public void mouseClicked(MouseEvent e){
	    		JTextField nomEven = ((JTextField)e.getSource());
	    		nomEven.setText("");
	    		nomEven.getFont().deriveFont(Font.PLAIN);
	    		nomEven.setForeground(Color.black);
	    		nomEven.removeMouseListener(this);
	    	}
	    });
	    top.add(labelnomEven);
	    top.add(nomEven);
	    lieu.setPreferredSize(new Dimension(200, 30));
	    lieu.addMouseListener(new MouseListener(){
	        public void mouseReleased(MouseEvent e) {}         
	        public void mousePressed(MouseEvent e) {}          
	        public void mouseExited(MouseEvent e) {}           
	        public void mouseEntered(MouseEvent e) {}          
	    	public void mouseClicked(MouseEvent e){
	    		JTextField lieu = ((JTextField)e.getSource());
	    		lieu.setText("");
	    		lieu.getFont().deriveFont(Font.PLAIN);
	    		lieu.setForeground(Color.black);
	    		lieu.removeMouseListener(this);
	    	}
	    });
	    top.add(labellieu);
	    top.add(lieu);
	    invite.setPreferredSize(new Dimension(120, 30));
	    invite.addMouseListener(new MouseListener(){
	        public void mouseReleased(MouseEvent e) {}         
	        public void mousePressed(MouseEvent e) {}          
	        public void mouseExited(MouseEvent e) {}           
	        public void mouseEntered(MouseEvent e) {}          
	    	public void mouseClicked(MouseEvent e){
	    		JTextField invite = ((JTextField)e.getSource());
	    		invite.setText("");
	    		invite.getFont().deriveFont(Font.PLAIN);
	    		invite.setForeground(Color.black);
	    		invite.removeMouseListener(this);
	    	}
	    });
	    top.add(labelinvite);
	    top.add(invite);
	    dateEven.setPreferredSize(new Dimension(90, 30));
	    dateEven.addMouseListener(new MouseListener(){
	        public void mouseReleased(MouseEvent e) {}         
	        public void mousePressed(MouseEvent e) {}          
	        public void mouseExited(MouseEvent e) {}           
	        public void mouseEntered(MouseEvent e) {}          
	    	public void mouseClicked(MouseEvent e){
	    		JTextField dateEven = ((JTextField)e.getSource());
	    		dateEven.setText("");
	    		dateEven.getFont().deriveFont(Font.PLAIN);
	    		dateEven.setForeground(Color.black);
	    		dateEven.removeMouseListener(this);
	    	}
	    });
	    top.add(labeldateEven);
	    top.add(dateEven);
	    top.add(labelheureDeb);
	    top.add(heureDeb);
	    heureDeb.setPreferredSize(new Dimension(50, 30));
	    heureDeb.addMouseListener(new MouseListener(){
	        public void mouseReleased(MouseEvent e) {}         
	        public void mousePressed(MouseEvent e) {}          
	        public void mouseExited(MouseEvent e) {}           
	        public void mouseEntered(MouseEvent e) {}          
	    	public void mouseClicked(MouseEvent e){
	    		JTextField heureDeb = ((JTextField)e.getSource());
	    		heureDeb.setText("");
	    		heureDeb.getFont().deriveFont(Font.PLAIN);
	    		heureDeb.setForeground(Color.black);
	    		heureDeb.removeMouseListener(this);
	    	}
	    });
	    top.add(labelheureFin);
	    top.add(heureFin);
	    heureFin.setPreferredSize(new Dimension(50, 30));
	    heureFin.addMouseListener(new MouseListener(){
	        public void mouseReleased(MouseEvent e) {}         
	        public void mousePressed(MouseEvent e) {}          
	        public void mouseExited(MouseEvent e) {}           
	        public void mouseEntered(MouseEvent e) {}          
	    	public void mouseClicked(MouseEvent e){
	    		JTextField heureFin = ((JTextField)e.getSource());
	    		heureFin.setText("");
	    		heureFin.getFont().deriveFont(Font.PLAIN);
	    		heureFin.setForeground(Color.black);
	    		heureFin.removeMouseListener(this);
	    	}
	    });
	    top.add(b1);
	    	    
	    this.setContentPane(top);
	   // this.setVisible(true);
	}
	
	
// actionPerformed permet de bouton appelle les méthodes actions !
	class BoutonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("TEXT : nomEven " + nomEven.getText());
			
			System.out.println("TEXT : lieu " + lieu.getText());
			System.out.println("TEXT : invite " + invite.getText());
			String email=invite.getText();
			System.out.println("TEXT : dateEven " + dateEven.getText());
			
			
			
			System.out.println("TEXT : heureDeb " + heureDeb.getText());
			System.out.println("TEXT : heureFin " + heureFin.getText());
			String debut = dateEven.getText()+" "+heureDeb.getText();
			String fin = dateEven.getText()+" "+heureFin.getText();
			
			
			
			try {
				Evenement event =new Evenement(nomEven.getText(),lieu.getText(),debut,fin);
				if(event.selectPers(email).isEmpty()){
				// une fenetre d'erreur + afficher ajouter personne
				System.out.println("fenetre ajout pers");
				}
				else {
				System.out.println("email  ajouté");
				event.ajoutIvitation(email);
				}
			
			
			
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
			
			//fermer la fenetre
			System.exit(0);
		}
	}
    
}
