import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFrame;
public class testGUI {

	public static void main(String[] args) throws ParseException {
		 
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

	   //CalendrierGUI fenetre = new CalendrierGUI();
	   //Fenetre fenetre = new Fenetre();
		
		
		Dates temps = new Dates();
		ArrayList<Evenement> RDV = new ArrayList<Evenement>();
		//Evenement even1= new Evenement("old skool","yaya","02/08/2016 13:45","02/08/2016 14:45");
		//Evenement even2= new Evenement("old skool","yaya","03/08/2016 11:45","03/08/2016 16:45");
		//ArrayList evenList= new ArrayList();
		// evenlist =  Bdmanager.recupSemaine(temps)  // Dans une refactorisation du code il sera dans la classe Dates
		//evenList.add(even1);
		//evenList.add(even2);
		
		
		// 
	   CalendrierFenetre fenetre = new CalendrierFenetre(temps,RDV);
	   //SaisieEvenFenetre fenetre1 = new SaisieEvenFenetre();
	   //SaisiePersFenetre fenetre2 = new SaisiePersFenetre();
	  fenetre.setVisible(true);
	   //fenetre1.setVisible(true);
	   //fenetre2.setVisible(false);
	   /*String email="address@mail";
	   Evenement n= new Evenement("Go", "Go","25/06/1989 16:00","25/06/1989 16:50");
	   System.out.println(n.selectPers(email));*/
	    
		//Dates day = new Dates();
		//day.cetteSemaine();
		//System.out.println(day.jour);
		
	}   

}
