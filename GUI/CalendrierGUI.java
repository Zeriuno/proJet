import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalendrierGUI extends JFrame{

	public CalendrierGUI() {
		 this.setTitle("Mon Agenda");
		 this.setSize(600, 700);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		 
		// Color myBlue = new Color(204,255,299);
		 
		 
		 //differentes types des conteneurs 
		 JPanel cell11=new JPanel();
		 cell11.setBackground(Color.GRAY);
		 cell11.setPreferredSize(new Dimension(60,40));
		 JPanel cell21=new JPanel();
		 cell21.setBackground(Color.GRAY);
		 cell21.setPreferredSize(new Dimension(60,40));
		 JPanel cell31=new JPanel();
		 cell31.setBackground(Color.GRAY);
		 cell31.setPreferredSize(new Dimension(60,40));
		 JPanel cell41=new JPanel();
		 cell41.setBackground(Color.GRAY);
		 cell41.setPreferredSize(new Dimension(60,40));
		 JPanel cell51=new JPanel();
		 cell51.setBackground(Color.GRAY);
		 cell51.setPreferredSize(new Dimension(60,40));
		 JPanel cell61=new JPanel();
		 cell61.setBackground(Color.GRAY);
		 cell61.setPreferredSize(new Dimension(60,40));
		 JPanel cell71=new JPanel();
		 cell71.setBackground(Color.GRAY);
		 cell71.setPreferredSize(new Dimension(60,40));
		 JPanel cell81=new JPanel();
		 cell81.setBackground(Color.GRAY);
		 cell81.setPreferredSize(new Dimension(60,40));
		 JPanel cellJour=new JPanel();
		 cellJour.setBackground(Color.WHITE);
		 cellJour.setPreferredSize(new Dimension(60,40));
		 JPanel cellB=new JPanel();
		 cellB.setBackground(Color.BLUE);
		 cellB.setPreferredSize(new Dimension(60,40));
		 
		 
		   //Le conteneur principal
		    JPanel content = new JPanel();
		    content.setPreferredSize(new Dimension(600,760));
		    content.setBackground(Color.WHITE);
		    //le layout manager
		    content.setLayout(new GridBagLayout());
		    //Postion des composants
		    GridBagConstraints gbc = new GridBagConstraints();
		    
		    //ligne 1
		    //depart 
		    gbc.gridx=0;
		    gbc.gridy=0;
		    //taille
		    gbc.gridheight=1;
		    gbc.gridwidth=1;
		    gbc.insets=new Insets(1,1,1,1) ;
		    content.add(cell11,gbc);
		    //2-8 
		    gbc.gridx=1;
		    content.add(cell21,gbc);
		    gbc.gridx=2;
		    content.add(cell31,gbc);
		    gbc.gridx=3;
		    content.add(cell41,gbc);
		    gbc.gridx=4;
		    content.add(cell51,gbc);
		    gbc.gridx=5;
		    content.add(cell61,gbc);
		    gbc.gridx=6;
		    content.add(cell71,gbc);
		    //ln
		    gbc.gridwidth = GridBagConstraints.REMAINDER;
		    gbc.gridx=7;
		    content.add(cell81,gbc);
		    //ligne2
		    //depart
		    gbc.gridx=0;
		    gbc.gridy=1;
		  //taille
		    gbc.gridwidth=1;
		    gbc.gridheight=2;
		    gbc.fill = GridBagConstraints.VERTICAL;
		    content.add(cellB,gbc);
		    //2-8
		    gbc.gridx=1;
		    content.add(cellJour,gbc);
		    gbc.gridx=2;
		    content.add(cellB,gbc);
		    gbc.gridx=3;
		    content.add(cellJour,gbc);
		    gbc.gridx=4;
		    content.add(cellJour,gbc);
		    gbc.gridx=5;
		    content.add(cellJour,gbc);
		    gbc.gridx=6;
		    content.add(cellJour,gbc);
		    gbc.gridwidth = GridBagConstraints.REMAINDER;
		    gbc.gridx=7;
		    content.add(cellJour,gbc);
		    gbc.fill=GridBagConstraints.HORIZONTAL;
		  //ligne3
		    //depart
		    gbc.gridx=0;
		    gbc.gridy=2;
		  //taille
		    gbc.gridwidth=1;
		    gbc.gridheight=3;
		    gbc.fill = GridBagConstraints.VERTICAL;
		    content.add(cellJour,gbc);
		    //2-8
		    gbc.gridx=1;
		    content.add(cellJour,gbc);
		    gbc.gridx=2;
		    content.add(cellJour,gbc);
		    gbc.gridx=3;
		    content.add(cellJour,gbc);
		    gbc.gridx=4;
		    content.add(cellJour,gbc);
		    gbc.gridx=5;
		    content.add(cellJour,gbc);
		    gbc.gridx=6;
		    content.add(cell11,gbc);
		    gbc.gridwidth = GridBagConstraints.REMAINDER;
		    gbc.gridx=7;
		    content.add(cellJour,gbc);
		    gbc.fill=GridBagConstraints.HORIZONTAL;
		    
		  //On ajoute le conteneur

		    this.setContentPane(content);
		    this.setVisible(true);   
		     
		    
		    
		    
	}

}
