import javax.swing.JFrame;
public class testGUI {

	public static void main(String[] args) {
		 
		//Bdmanager robot=new Bdmanager();
		 //Evenement n= new Evenement("Yo", "Lo");
         //n.ajoutIvitation("hotmail");
         //n.extraInvitation();
         //n.supInvitation();
		//Personne m= new Personne("P", "Daniele","@gmail");
		//Personne n= new Personne("D", "Li","@gamil");
 
		//robot.extraPers();
		
		//robot.modifPers("@yolo", "mailPers", "@yoyo");
		//robot.extraPers();
		 
        //Evenement n= new Evenement("lo", "yo","@yoyo");
//		n.setText();	 
//		System.out.println(n.toString());

	    JFrame fenetre = new FCalendrier();
	    
	    
	                
	    //Définit un titre pour notre fenêtre
	    fenetre.setTitle("Ma première fenêtre Java");
	    //Définit sa taille : 400 pixels de large et 100 pixels de haut
	    fenetre.setSize(1000, 800);
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    fenetre.setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //Et enfin, la rendre visible        
	    fenetre.setVisible(true);
	    
		
	}

}
