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

		JFrame fenetreCalendrier = new FCalendrier();
	    JFrame fenetreSaisieEven = new FSaisieEven();
	    JFrame fenetreSaisiePers = new FSaisiePers();
	    
	    
	                
	    //Définit un titre pour notre fenêtre
	    fenetreSaisieEven.setTitle("Nouvel Evènement");
	    fenetreSaisiePers.setTitle("Nouveau Contact");
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    fenetreSaisieEven.setLocationRelativeTo(null);
	    fenetreSaisiePers.setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    fenetreSaisieEven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetreSaisiePers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //Et enfin, la rendre visible
	    fenetreCalendrier.setVisible(true);
	    fenetreSaisieEven.setVisible(true);
	    fenetreSaisiePers.setVisible(true);
		
	}

}