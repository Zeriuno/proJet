


public class Evenement {

	Bdmanager robot=new Bdmanager();

	//attributs
	String textEven ;
	String nomEven  ;
	int idEven   ;


	//constructeur
	public Evenement( String nomEven ) {
		this.nomEven = nomEven;
	}
	public Evenement(String nomEven, String textEven ) {
		this.textEven = textEven    ;
		this.nomEven=nomEven        ;
		this.idEven=Bdmanager.geneId();
		Bdmanager.ajoutEven(idEven,nomEven, textEven);

	}

	//methode
	//ajouter invitation
	public void ajoutIvitation(String mailPers){
		Bdmanager.ajoutInvitation(mailPers, idEven);	
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
