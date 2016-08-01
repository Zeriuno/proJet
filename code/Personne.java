
public class Personne {

    	Bdmanager robot=new Bdmanager();
    	
		//attributs
		String nomPers;
		String prenomPers;
		String emailPers;
		
		
		//constructeur 
	
		public Personne( String nomPers, String prenomPers,String emailPers ) {
			this.nomPers = nomPers;
			this.prenomPers=prenomPers;
			this.emailPers=emailPers;
			Bdmanager.ajoutPers(nomPers, prenomPers,emailPers);
			
		}
		

	}

