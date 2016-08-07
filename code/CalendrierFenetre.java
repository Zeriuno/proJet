import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonListener;


import javax.swing.JLabel;
//	Declaration des dates


//factoriser les code construire les panels semaines


public class CalendrierFenetre extends JFrame{
	
	Dates go;
	private ArrayList evenList;
	private JButton boutonG=new JButton("< Pr�cedant");
    private JButton boutonD=new JButton("Suivant >");
    private JButton boutonAjoutPers=new JButton("+Personne");
    private JButton boutonAjoutEven=new JButton("+Evenement");
	

    
	public CalendrierFenetre(){

		    super();
		    this.go = new Dates();
		    build();
	}
	
    
	public CalendrierFenetre(Dates go){

	    super();
	    this.go = go;
	    build();
}
	public CalendrierFenetre(Dates go,ArrayList evenList){

	    super();
	    this.go = go;
	    this.evenList=evenList;
	    build();
}

	private void build(){
		setTitle("MIMO Calendrier");
		setSize(1200, 920);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
 
		Border border = LineBorder.createGrayLineBorder();
		
	//div contient les autres panel
		JPanel div = new JPanel();
		div.setPreferredSize(new Dimension(1200,1120));
	    div.setBackground(Color.WHITE);
	    div.setLayout(new BorderLayout());
	    
	    
	    //I.panel  pour l'en-t�te
		JPanel head = new JPanel();
		head.setLayout(new FlowLayout());
		head.setBackground(Color.white);
		int annee=go.anneeJeudi;
		String mois=go.moisChaine;
		JLabel label = new JLabel(mois+" "+annee);
		head.add(label);
  
		//II.div pour la semaine
		JPanel semaine = new JPanel();
		semaine.setPreferredSize(new Dimension(1100, 1020));
	    semaine.setBackground(Color.blue);
	    semaine.setLayout(new GridLayout());
	    GridLayout gl = new GridLayout();
	    gl.setColumns(7);
	    gl.setRows(0);
	    gl.setVgap(2);
	     
	    
	    //II.1 panel pour lundi
	    
	    GridBagConstraints gbc = new GridBagConstraints();
	   
	    
	    JPanel lundi = new JPanel();
		lundi.setPreferredSize(new Dimension(100, 1020));
	    lundi.setBackground(Color.yellow);
	    lundi.setLayout(new GridBagLayout());
	   
	    
        String dateLundi=String.valueOf(go.semaine[0]);
        jourMaker(dateLundi,"Lundi",lundi);
	    
  
	    //II.2 panel pour mardi
	    JPanel mardi = new JPanel();
		mardi.setPreferredSize(new Dimension(100, 1020));
	    mardi.setBackground(Color.white);
	    mardi.setLayout(new GridBagLayout());
	    String dateMardi=String.valueOf(go.semaine[1]);
	    jourMaker(dateMardi,"Mardi",mardi);
	    
	    
	    //II.3 panel pour mercredi
	    JPanel mercredi = new JPanel();
		mercredi.setPreferredSize(new Dimension(100, 1020));
	    mercredi.setBackground(Color.yellow);
	    mercredi.setLayout(new GridBagLayout());
	    String dateMercredi=String.valueOf(go.semaine[2]);
	    jourMaker(dateMercredi,"Mecredi",mercredi);
	    
	
	    
	  	//II.4 panel jeudi
	    JPanel jeudi = new JPanel();
		jeudi.setPreferredSize(new Dimension(100, 1020));
	    jeudi.setBackground(Color.white);
	    jeudi.setLayout(new GridBagLayout());
	    String dateJeudi=String.valueOf(go.semaine[3]);
	    jourMaker(dateJeudi,"Jeudi",jeudi);
	    
	  	
	  	//II. 5 panel vendredi
	    JPanel vendredi = new JPanel(); 
		vendredi.setPreferredSize(new Dimension(100, 1020));
	    vendredi.setBackground(Color.yellow);
	    vendredi.setLayout(new GridBagLayout());
	    String dateVendredi=String.valueOf(go.semaine[4]);
	    jourMaker(dateVendredi,"Vendredi",vendredi);

	    
	    //II.6 panel Samedi
	    JPanel samedi = new JPanel();
		samedi.setPreferredSize(new Dimension(100, 1020));
	    samedi.setBackground(Color.white);
	    samedi.setLayout(new GridBagLayout());
	    JPanel dimanche = new JPanel();
	    String dateSamedi=String.valueOf(go.semaine[5]);
	    jourMaker(dateSamedi,"Samedi",samedi);
	    
	    
		dimanche.setPreferredSize(new Dimension(100, 1020));
	    dimanche.setBackground(Color.yellow);
	    dimanche.setLayout(new GridBagLayout());
	    String dateDimanche=String.valueOf(go.semaine[6]);
	    jourMaker(dateDimanche,"Dmache",dimanche);
	    
	    
	    semaine.add(lundi);
	    semaine.add(mardi);
	    semaine.add(mercredi);
	    semaine.add(jeudi);
	    semaine.add(vendredi);
	    semaine.add(samedi);
	    semaine.add(dimanche);
	  
	    //II.ajouter evenement 
	    
	    Evenement even1= new Evenement("old skool","yaya","02/08/2016 13:45","02/08/2016 14:45",5,"Monday");
	    Evenement even2= new Evenement("old skool","yaya","03/08/2016 11:45","03/08/2016 16:45",2,"Friday");
	    Evenement even0=new Evenement("java party","give me a five","02/08/2016 12:45","02/08/2016 14:45",2,"Sunday");
	  	ArrayList<Evenement> evenList= new ArrayList<Evenement>();
        evenList.add(even0);
        evenList.add(even1);
        evenList.add(even2);
     
         for(Evenement even: evenList){
        
	                  double  height=even.dureeEven;
	                  String jour=even.jourDebut;
	                  System.out.println(jour);
	                  String debut=even.debutEven;
	                  String sH=debut.substring(11,13) ;
	                  System.out.println(sH);
	                  int pH=Integer.valueOf(sH)-5;
		
	                  JButton evenlol=new JButton("<html>Give me a Five<br/>Put heure here<html>");
	                  evenlol.setPreferredSize(new Dimension(100,90)); 
	    
	                  GridBagConstraints gb = new GridBagConstraints();
	    
	                  gb.gridx=0;
	                  gb.gridy=pH;
	    
	                  gb.gridwidth = GridBagConstraints.REMAINDER;
	                  gb.gridheight=(int) height;
	                  gb.weighty=1;
	                  gb.fill=GridBagConstraints.BOTH;
	    
	                  switch(jour)
                         {
                           case "Monday" : lundi.add(evenlol,gb); break;
                           case "Tuesday" : mardi.add(evenlol,gb); break;
                           case "Wednesday" : mercredi.add(evenlol,gb); break;
                           case "Thursday" : jeudi.add(evenlol,gb); break;
                           case "Friday" : vendredi.add(evenlol,gb); break;
                           case "Saturday" : samedi.add(evenlol,gb); break;
                           case "Sunday" : dimanche.add(evenlol,gb); break;
                           default :  {FDialogue fenetre = new FDialogue();
          	               fenetre.setVisible(true);}
                           }
         }

	    
	    //III.panel gauche
	  	JPanel panelG = new JPanel();
	  	panelG.setPreferredSize(new Dimension(100, 1020));
	  	panelG.setBackground(Color.white);
	  	panelG.setLayout(new GridLayout());
	  	GridLayout gg = new GridLayout();
	    gg.setRows(32);
	  	//III.1 horaire
	  	String cur[]={"","","07h00"," ","08h00"," ","09h00"," ","10h00"," ","11h00"," ","12h00"," ","13h00"," ","14h00"," ","15h00"," ","16h00"," ","17h00"," ","18h00"," ","19h00"," ","20h00"," ","21h00"," "};
	  	JLabel[] labels=new JLabel[cur.length];
	  	for(int i=0;i<cur.length;i++)
	  	{
	  	  labels[i]=new JLabel(cur[i],SwingConstants.CENTER);
	  	  labels[i].setBorder(border);
	  	  panelG.setLayout(gg);
	  	  labels[i].setPreferredSize(new Dimension(100,60));
	  	  panelG.add(labels[i]);
	  	  
	  	}
	  	
	  	
	  	
	  	
	    //IV.div pour les  boutons
	  	JPanel boutons = new JPanel();
	  	boutons.setPreferredSize(new Dimension(1100, 40));
	  	boutons.setBackground(Color.red);
	  	boutons.setLayout(new FlowLayout());
	  	boutons.add(boutonG);
	  	boutons.add(boutonAjoutEven);
	  	boutons.add(boutonAjoutPers);
	  	boutons.add(boutonD);
	    boutonAjoutEven.addActionListener(new BoutonListenerAjoutEven());
	    boutonAjoutPers.addActionListener(new BoutonListenerAjoutPers());
	    boutonG.addActionListener(new BoutonListenerG()); 
	    boutonD.addActionListener(new BoutonListenerD()); 
	    
		
		
		div.add(head,BorderLayout.NORTH);
		div.add(semaine,BorderLayout.CENTER);
		div.add(panelG, BorderLayout.WEST);
		div.add(boutons, BorderLayout.SOUTH);
 
		return div;
	}
	
	
	
	private void jourMaker(String date, String jour, JPanel pan) {
       String curlundi[]={date,jour,"07h00"," ","08h00"," ","09h00"," ","10h00"," ","11h00"," ","12h00"," ","13h00"," ","14h00"," ","15h00"," ","16h00"," ","17h00"," ","18h00"," ","19h00"," ","20h00"," ","21h00"," "};
	   
        Border border = LineBorder.createGrayLineBorder();
        GridBagConstraints gbc = new GridBagConstraints();
	  	JLabel[] lundiLs=new JLabel[curlundi.length];
	  	for(int i=0;i<curlundi.length;i++)
	  	{
	  	  lundiLs[i]=new JLabel(curlundi[i],SwingConstants.CENTER);
	  	  gbc.gridx=0;
	      gbc.gridy=i;
	      gbc.gridheight=1;
	      gbc.gridwidth=1;
	      gbc.weightx=1;
	      gbc.weighty=1;
	      gbc.fill=GridBagConstraints.BOTH;
	  	  lundiLs[i].setPreferredSize(new Dimension(100,60));
	  	  lundiLs[i].setBorder(border);
	  	  pan.add(lundiLs[i],gbc);
	  	}
		
	}



	// Class pour les interactions 
	class BoutonListenerAjoutEven implements ActionListener{
		public void actionPerformed(ActionEvent e){
			 System.out.println("open windows event");
		  
		     SaisieEvenFenetre fenetre1 = new SaisieEvenFenetre();
		     fenetre1.setVisible(true);
		     

		}
	}
	class BoutonListenerAjoutPers implements ActionListener{
		public void actionPerformed(ActionEvent e){
			 System.out.println("open windows pers");
		  
		     SaisiePersFenetre fenetre1 = new SaisiePersFenetre();
		     fenetre1.setVisible(true);
		}
	}
	class BoutonListenerG implements ActionListener{
		public void actionPerformed(ActionEvent e){
			 System.out.println("recharge la semaine precident");
			 go.semaineAvant();
			 CalendrierFenetre fenetre1 = new CalendrierFenetre(go);
             fenetre1.setVisible(true);
 
		}
	}
     class BoutonListenerD implements ActionListener{
	public void actionPerformed(ActionEvent e){
		 System.out.println("recharge la semaine prochaine");
		 go.semaineApres();
		 CalendrierFenetre fenetre1 = new CalendrierFenetre(go);
         fenetre1.setVisible(true);
	}

}
     
}
