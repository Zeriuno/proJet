import java.util.Scanner;

public class Evenement {
    
	//attributs 
	String textEven;
	String nomEven;
	int idEven;
	private static int cpt=0; //pk on peux pas utiliser id directement
	
	//constructeur 
	public Evenement( String nomEven ) {
		this.nomEven = nomEven;
		this.idEven = cpt++;			
	}
	public Evenement( String nomEven, String textEven ) {
		this.textEven = textEven;
		this.nomEven=nomEven;
		this.idEven = cpt++;			
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
	    return nomEven+": "+textEven;
   }
}
