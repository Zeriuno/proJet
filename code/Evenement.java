import java.lang.reflect.Array;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class Evenement {

	Bdmanager robot=new Bdmanager(); // fait pour paresse, on peut plut�t le mettre en param�tre dans les fonctions qui le n�cessitent

	//attributs
	String textEven  ; // c'est le lieu, mais nous avons la flemme de changer le nom de la variable
	String nomEven   ;
	int idEven       ;
	String debutEven ; // format jj/MM/AAAA hh:mm
	String finEven   ; // format jj/MM/AAAA hh:mm
	int jourDebut    ; // date du mois
  float dureeEven  ;

	//constructeur
    public Evenement( String nomEven ) {
		this.nomEven = nomEven;
	}
    public Evenement(String nomEven, String textEven, String debut, String fin ,int dureeEven){
		this.textEven = textEven;
		this.nomEven=nomEven;
		this.debutEven=debut;
		this.finEven =fin;
		this.dureeEven=dureeEven;
		}
    
    
	public Evenement(String nomEven, String textEven, String debut, String fin ) throws ParseException {
		this.textEven = textEven    ;
		this.nomEven=nomEven        ;
		
		
		// sql will manager id
		//to do that : insert a blank line and get id
		this.idEven=Bdmanager.geneId();
		this.debutEven = Bdmanager.convertDatetime(debut);
		this.finEven = Bdmanager.convertDatetime(fin);

		Bdmanager.ajoutEven(idEven,nomEven,textEven,debutEven,finEven);

	}

	
	//methode
	
	//ajouter invitation
	public void ajoutIvitation(String mailPers){
		
		Bdmanager.ajoutInvitation(mailPers, idEven);	
	}
	// selecte personne 
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
