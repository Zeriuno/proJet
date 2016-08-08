import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SaisiePersFenetre extends JFrame{
    private JButton b1 =new JButton("ENREGISTRER");
    
    //Champs de saisie

    private JTextField nomPers = new JTextField("Votre Nom"); // Valeur par d√©faut
    private JLabel labelnomPers = new JLabel("Nom:"); // texte avant le champ
    private JTextField preNomPers = new JTextField("Votre Prenom"); // Valeur par d√©faut
    private JLabel labelpreNomPers = new JLabel("Pr√©nom:"); // texte avant le champ
    private JTextField mailPers = new JTextField("address@mail"); // Valeur par d√©faut
    private JLabel labelmailPers = new JLabel("Mail:"); // texte avant le champ
    		
	public SaisiePersFenetre() {
		this.setTitle("Personne");
	    this.setSize(700, 150);
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	  
	    b1.addActionListener(new BoutonListener()); //on indique au bouton qu'il est ÈcoutÈ
	    
	 // permet de fermer la fenÍtre lorsque l'on clic sur le bouton "ENREGISTRER"
	    b1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				if(e.getSource()==b1){
					setVisible(false);	
					dispose();
				}
			}
		});
	    
	    // div boutons
	    JPanel top = new JPanel();
	    Font police = new Font("Arial", Font.BOLD, 14);
	    nomPers.setPreferredSize(new Dimension(150, 30));
	    nomPers.addMouseListener(new MouseListener(){
	        public void mouseReleased(MouseEvent e) {}         
	        public void mousePressed(MouseEvent e) {}          
	        public void mouseExited(MouseEvent e) {}           
	        public void mouseEntered(MouseEvent e) {}          
	    	public void mouseClicked(MouseEvent e){
	    		JTextField nomPers = ((JTextField)e.getSource());
	    		nomPers.setText("");
	    		nomPers.getFont().deriveFont(Font.PLAIN);
	    		nomPers.setForeground(Color.black);
	    		nomPers.removeMouseListener(this);
	    	}
	    });
	    top.add(labelnomPers);
	    top.add(nomPers);
	    preNomPers.setPreferredSize(new Dimension(150, 30));
	    preNomPers.addMouseListener(new MouseListener(){
	        public void mouseReleased(MouseEvent e) {}         
	        public void mousePressed(MouseEvent e) {}          
	        public void mouseExited(MouseEvent e) {}           
	        public void mouseEntered(MouseEvent e) {}          
	    	public void mouseClicked(MouseEvent e){
	    		JTextField preNomPers = ((JTextField)e.getSource());
	    		preNomPers.setText("");
	    		preNomPers.getFont().deriveFont(Font.PLAIN);
	    		preNomPers.setForeground(Color.black);
	    		preNomPers.removeMouseListener(this);
	    	}
	    });
	    top.add(labelpreNomPers);
	    top.add(preNomPers);
	    mailPers.setPreferredSize(new Dimension(150, 30));
	    mailPers.addMouseListener(new MouseListener(){
	        public void mouseReleased(MouseEvent e) {}         
	        public void mousePressed(MouseEvent e) {}          
	        public void mouseExited(MouseEvent e) {}           
	        public void mouseEntered(MouseEvent e) {}          
	    	public void mouseClicked(MouseEvent e){
	    		JTextField mailPers = ((JTextField)e.getSource());
	    		mailPers.setText("");
	    		mailPers.getFont().deriveFont(Font.PLAIN);
	    		mailPers.setForeground(Color.black);
	    		mailPers.removeMouseListener(this);
	    	}
	    });
	    top.add(labelmailPers);
	    top.add(mailPers);
	    top.add(b1);	    
	    
	    this.setContentPane(top);
	    
	    //this.setVisible(true);
	}
	
	class BoutonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("TEXT : nomPers " + nomPers.getText());
			System.out.println("TEXT : preNomPers " + preNomPers.getText());
			System.out.println("TEXT : mailPers " + mailPers.getText());
			Personne P=new Personne(nomPers.getText(),preNomPers.getText(),mailPers.getText());
		}
	}
}