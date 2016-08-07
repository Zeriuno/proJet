import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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
			// Bdmanager.ajoutPers(nomPers, prenomPers,emailPers);  // Vieille méthode qui reposait sur le Bdmanager, 
																	// obsolète avec la factorisation du code de connexion à la base de données
																	// et le recours donc ici à this.ajoutPers
			this.ajoutPers(nomPers, prenomPers, emailPers) ;
			
		}
		
		private void ajoutPers(String nomPers, String pernomPers, String emailPers)
		{
			Connection connexionbd = BDConnect.getConnect() ;
			PreparedStatement pstmnt ;
			try
			{
				String requete = "INSERT INTO `personne` (`nomPers`,`prenomPers`,`mailPers`) VALUES (?, ?, ?)";
				pstmnt = connexionbd.prepareStatement(requete);
				pstmnt.setString(1, nomPers);
				pstmnt.setString(2, prenomPers);
				pstmnt.setString(3, emailPers);
				pstmnt.executeQuery();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					connexionbd.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

