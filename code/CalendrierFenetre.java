import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
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
		setSize(1200, 1160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setContentPane(buildContentPane());
	}
	private JPanel buildContentPane(){
	
		Border border = LineBorder.createGrayLineBorder();
		
	//div contient les autres panel
		JPanel div = new JPanel();
		div.setPreferredSize(new Dimension(1200,1020));
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
		semaine.setPreferredSize(new Dimension(1100, 900));
	    semaine.setBackground(Color.blue);
	    semaine.setLayout(new GridLayout());
	    GridLayout gl = new GridLayout();
	    gl.setColumns(7);
	    gl.setRows(0);
	    gl.setVgap(2);
	     
	    
	    //II.1 panel pour lundi
	    
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    JPanel lundi = new JPanel();
		lundi.setPreferredSize(new Dimension(100, 900));
	    lundi.setBackground(Color.yellow);
	    lundi.setLayout(new GridBagLayout());
	    
	    JLabel lLundi = new JLabel("Lundi");
	    
	    gbc.weighty=900;
	    gbc.weightx=0;
	    gbc.gridx=0;
	    gbc.gridy=0;
	    gbc.gridwidth = GridBagConstraints.REMAINDER;
		lLundi.setBorder(border);
	    lLundi.setPreferredSize(new Dimension(150,60));
	    lundi.add(lLundi,gbc);
	    
	    
	    JLabel lDate = new JLabel("Date");
	    gbc.gridx=0;
	    gbc.gridy=1;
	    lDate.setBorder(border);
	    lDate.setPreferredSize(new Dimension(150,60));
	    lundi.add(lDate,gbc);
	    
	    //II.2 panel pour mardi
	    JPanel mardi = new JPanel();
		mardi.setPreferredSize(new Dimension(100, 900));
	    mardi.setBackground(Color.white);
	    mardi.setLayout(new GridBagLayout());
	    
	    JPanel mercredi = new JPanel();
		mercredi.setPreferredSize(new Dimension(100, 900));
	    mercredi.setBackground(Color.yellow);
	    mercredi.setLayout(new GridBagLayout());
	    
	    JPanel jeudi = new JPanel();
		jeudi.setPreferredSize(new Dimension(100, 900));
	    jeudi.setBackground(Color.white);
	    jeudi.setLayout(new GridBagLayout());
	    
	    JPanel vendredi = new JPanel(); 
		vendredi.setPreferredSize(new Dimension(100, 900));
	    vendredi.setBackground(Color.yellow);
	    vendredi.setLayout(new GridBagLayout());
	    
	    JPanel samedi = new JPanel();
		samedi.setPreferredSize(new Dimension(100, 900));
	    samedi.setBackground(Color.white);
	    samedi.setLayout(new GridBagLayout());
	    JPanel dimanche = new JPanel();
	    
		dimanche.setPreferredSize(new Dimension(100, 900));
	    dimanche.setBackground(Color.yellow);
	    dimanche.setLayout(new GridBagLayout());
	    
	    semaine.add(lundi);
	    semaine.add(mardi);
	    semaine.add(mercredi);
	    semaine.add(jeudi);
	    semaine.add(vendredi);
	    semaine.add(samedi);
	    semaine.add(dimanche);
	    //ajouter evenements
	    
	    //position
	    
	   
	    
	    JButton even1=new JButton("<html>Put string here<br/>Put heure here<html>");
	    even1.setPreferredSize(new Dimension(150,250)); 	    
	    //position
	    
	    gbc.gridx=0;
	    gbc.weighty=8;
	    gbc.gridy=1;
	    gbc.gridwidth = GridBagConstraints.REMAINDER;
	   
	    jeudi.add(even1,gbc);
	    
	    JButton even=new JButton("<html>Put string here<br/>Put heure here<html>");
	    even.setPreferredSize(new Dimension(150,50)); 
	    gbc.weighty=8;
	    gbc.gridx=0;
	    gbc.gridy=7;
	    jeudi.add(even,gbc);
	    
	    
	    
	    //III.panel gauche
	  	JPanel panelG = new JPanel();
	  	panelG.setPreferredSize(new Dimension(100, 900));
	  	panelG.setBackground(Color.white);
	  	panelG.setLayout(new GridLayout());
	  	GridLayout gg = new GridLayout();
	    gg.setRows(17);
	  	//III.1 horaire
	  	String cur[]={"","horaire","07h00","08h00","09h00","10h00","11h00","12h00","13h00","14h00","15h00","16h00","17h00","18h00","19h00","20h00","21h00"};
	  	JLabel[] labels=new JLabel[cur.length];
	  	for(int i=0;i<cur.length;i++)
	  	{
	  	  labels[i]=new JLabel(cur[i],SwingConstants.CENTER);
	  	  labels[i].setBorder(border);
	  	  panelG.setLayout(gg);
	  	  panelG.setPreferredSize(new Dimension(100,60));
	  	  panelG.add(labels[i]);
	  	  
	  	}
	  	
	  	
	  	
	  	
	    //IV.div pour les  boutons
	  	JPanel boutons = new JPanel();
	  	boutons.setPreferredSize(new Dimension(1100, 50));
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
