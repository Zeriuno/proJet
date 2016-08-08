import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class Evenement {

	Bdmanager robot=new Bdmanager(); // fait pour paresse, on peut plutôt le mettre en paramètre dans les fonctions qui le nécessitent

	//attributs
	String textEven  ; // c'est le lieu, mais nous avons la flemme de changer le nom de la variable
	String nomEven   ;
	int idEven       ;
	String debutEven ; // format jj/MM/AAAA hh:mm
	String finEven   ; // format jj/MM/AAAA hh:mm
	String jourDebut    ; // jour de la semaine en anglais, utilisé pour placer opportunément l'évènement dans la fenêtre du calendrier
    double dureeEven  ; // Un évènement qui dure 1h30 = 1.5; 1h45 = 1.75

	//constructeurs
    public Evenement( String nomEven ) {
		this.nomEven = nomEven;
	}
    
    public Evenement(String nomEven, String textEven, String debut, String fin, String jourDebut){
    	this(nomEven);
    	this.textEven = textEven;
		this.debutEven=debut;
		this.finEven =fin;
	    this.jourDebut=jourDebut;	
    }
    public Evenement(int idEven, String nomEven, String textEven, String debut, String fin, String jourDebut){
    	this(nomEven, textEven, debut, fin, jourDebut);
    	this.idEven = idEven;
    }
    
    public Evenement(String nomEven, String textEven, String debut, String fin,double dureeEven,String jourDebut){
		this(nomEven, textEven, debut, fin, jourDebut);
		this.dureeEven=dureeEven;	
    }
    
    


	public Evenement(String nomEven, String textEven, String debut, String fin ) throws ParseException {
		this.textEven = textEven    ;
		this.nomEven=nomEven        ;


		// sql will manage id
		//to do that : insert a blank line and get id
		this.idEven=Bdmanager.geneId();
		this.debutEven = Bdmanager.convertDatetime(debut);
		this.finEven = Bdmanager.convertDatetime(fin);

		Bdmanager.ajoutEven(idEven,nomEven,textEven,debutEven,finEven);

	}

	
	//méthodes
	
	//ajouter invitation
	public void ajoutIvitation(String mailPers){
		
		Bdmanager.ajoutInvitation(mailPers, idEven);	
	}
	// select personne 
	public ArrayList<String> selectPers(String mailsPers){
		
		ArrayList<String> list = new ArrayList<String>();
		
		list=Bdmanager.selectPers(mailsPers);
		
		return list;
		
	}
	
	
	
	//modif invitation 
	
	
	//supprission invitation
	public void supInvitation(){
		Bdmanager.supInvitation(idEven);
	}
	
	//affichage 
	public void extraInvitation(){
		Bdmanager.extraInvitation(idEven);
	}
	
	/*
	public String setText(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le contenu :");
	    String str = sc.nextLine();
	    this.textEven=str;
		return textEven;
		
	}*/

}
