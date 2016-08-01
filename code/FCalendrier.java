import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FCalendrier extends JFrame{
	private JPanel pan=new JPanel();
	private JPanel calendrier=new JPanel();
    private JButton boutonG=new JButton("< Précedant");
    private JButton boutonD=new JButton("Prochain >");
    private JButton boutonAjoutPers=new JButton("+Personne");
    private JButton boutonAjoutEven=new JButton("+Evenement");
	public FCalendrier() {
		this.setTitle("Bouton");
	    this.setSize(300, 100);
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
			
	    this.getContentPane().add(b4);
	    this.setVisible(true);
	    
	    
	    
	    
	    
	    
	    this.setVisible(true);
	}
    
}
