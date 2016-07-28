import java.util.Scanner;
import java.util.ArrayList;


public class Evenement {
	
	Bdmanager robot=new Bdmanager();
    
	//attributs 
	String textEven;
	String nomEven;
	int idEven;
	Arraylist <Personne> participants =  new Arraylist();
	
	
	//constructeur 
	public Evenement( String nomEven ) {
		this.nomEven = nomEven;
	}
	public Evenement( String nomEven, String textEven ) {
		this.textEven = textEven;
		this.nomEven=nomEven;
		robot.ajoutEven(nomEven, textEven);
		
		
	}
	// méthode
	public String setText(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le contenu :");
	    String str = sc.nextLine(); 
	    this.textEven=str;
		return textEven;		
	}
	

	
	public String toString(){
	    return idEven + " - " + nomEven+": "+textEven;
   }
	
	
	
}
