import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class CalendrierFenetre extends JFrame{
	private JButton boutonG=new JButton("< Précedant");
    private JButton boutonD=new JButton("Suivant >");
    private JButton boutonAjoutPers=new JButton("+Personne");
    private JButton boutonAjoutEven=new JButton("+Evenement");
	
	public CalendrierFenetre(){
		    super();
		    build();
	}

	private void build(){
		setTitle("MIMO Calendrier");
		setSize(1200, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setContentPane(buildContentPane());
	}
	private JPanel buildContentPane(){
		
	//div contient les autres panel
		JPanel div = new JPanel();
		div.setPreferredSize(new Dimension(1200, 860));
	    div.setBackground(Color.WHITE);
	    div.setLayout(new BorderLayout());
	    
	    
	    //I.panel  pour l'entetement 
		JPanel head = new JPanel();
		head.setLayout(new FlowLayout());
		head.setBackground(Color.white);
		
		JLabel label = new JLabel("Année 2016");
		head.add(label);
  
		//II.div pour la semaine
		JPanel semaine = new JPanel();
		semaine.setPreferredSize(new Dimension(1100, 640));
	    semaine.setBackground(Color.blue);
	    semaine.setLayout(new GridLayout());
	    GridLayout gl = new GridLayout();
	    gl.setColumns(7);
	    gl.setRows(0);
	    gl.setVgap(2);
	     
	    
	    //II.1 panel pour lundi
	    JPanel lundi = new JPanel();
		lundi.setPreferredSize(new Dimension(100, 640));
	    lundi.setBackground(Color.yellow);
	    lundi.setLayout(new GridBagLayout());
	    //II.1 panel pour mardi
	    JPanel mardi = new JPanel();
		mardi.setPreferredSize(new Dimension(100, 640));
	    mardi.setBackground(Color.white);
	    mardi.setLayout(new GridBagLayout());
	    JPanel mercredi = new JPanel();
		mercredi.setPreferredSize(new Dimension(100, 640));
	    mercredi.setBackground(Color.yellow);
	    mercredi.setLayout(new GridBagLayout());
	    JPanel jeudi = new JPanel();
		jeudi.setPreferredSize(new Dimension(100, 640));
	    jeudi.setBackground(Color.white);
	    jeudi.setLayout(new GridBagLayout());
	    JPanel vendredi = new JPanel();
		vendredi.setPreferredSize(new Dimension(100, 640));
	    vendredi.setBackground(Color.yellow);
	    vendredi.setLayout(new GridBagLayout());
	    JPanel samedi = new JPanel();
		samedi.setPreferredSize(new Dimension(100, 640));
	    samedi.setBackground(Color.white);
	    samedi.setLayout(new GridBagLayout());
	    JPanel dimanche = new JPanel();
		dimanche.setPreferredSize(new Dimension(100, 640));
	    dimanche.setBackground(Color.yellow);
	    dimanche.setLayout(new GridBagLayout());
	    
	    semaine.add(lundi);
	    semaine.add(mardi);
	    semaine.add(mercredi);
	    semaine.add(jeudi);
	    semaine.add(vendredi);
	    semaine.add(samedi);
	    semaine.add(dimanche);
	    
	    //III.panel gauche
	  	JPanel panelG = new JPanel();
	  	panelG.setPreferredSize(new Dimension(100, 640));
	  	panelG.setBackground(Color.red);
	  	panelG.setLayout(new FlowLayout());
	  	
	    //IV.div pour la semaine
	  	JPanel boutons = new JPanel();
	  	boutons.setPreferredSize(new Dimension(1100, 100));
	  	boutons.setBackground(Color.red);
	  	boutons.setLayout(new FlowLayout());
	  	boutons.add(boutonG);
	  	boutons.add(boutonD);
	  	boutons.add(boutonAjoutEven);
	  	boutons.add(boutonAjoutPers);
	    
	    
		
		
		div.add(head,BorderLayout.NORTH);
		div.add(semaine,BorderLayout.CENTER);
		div.add(panelG, BorderLayout.WEST);
		div.add(boutons, BorderLayout.SOUTH);
 
		return div;
	}
}
