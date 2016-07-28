import java.util.ArrayList ;
import java.util.UUID      ;


public class Evenement {

	Bdmanager robot=new Bdmanager();

	//attributs
	String textEven ;
	String nomEven  ;
	String idEven   ;
	Arraylist <Personne> participants =  new Arraylist();


	//constructeur
	public Evenement( String nomEven ) {
		this.nomEven = nomEven;
	}
	public Evenement( String nomEven, String textEven ) {
		this.textEven = textEven    ;
		this.nomEven=nomEven        ;
		this.idEven = UUID.random() ;
		robot.ajoutEven(idEven, nomEven, textEven);


	}
	// méthode
	/*
	public String setText(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le contenu :");
	    String str = sc.nextLine();
	    this.textEven=str;
		return textEven;
		*/
	}



	public String toString(){
	    return idEven + " - " + nomEven+": "+textEven;
   }



}
