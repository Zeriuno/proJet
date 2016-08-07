import java.sql.Connection        ;
import java.sql.DriverManager     ;
import javax.swing.JOptionPane    ;
/*
import java.sql.PreparedStatement ; // Les statements sont traités dans les classes, pas ici
import java.beans.Statement       ; // Les statements sont traités dans les classes, pas ici
import java.sql.SQLException      ; // Nécessaire si on a recours à SQLException pour un e.printStackTrace() qui renverrait un message d'erreur plus explicite, utile au debug
*/


public class BDConnect {
	
	/*
	 * Dans un premier temps nous sommes partis en incluant toute transaction avec la base de données dans 
	 * Bdmanager. Afin de factoriser le code, mieux serait de séparer l'objet connexion (dans une classe comme 
	 * celle-ci) des transactions (dans les autres classes).
	 * Ce travail a commencé (avec la requête des évènements de la semaine), mais il n'a pas été achevé. 
	 * La plupart des méthodes se trouve encore dans Bdmanager 
	 */
	
	private static String database = "java"       ;
	private static String user = "root"                   ;
	private static String pass = "" ;
	private static String url = "jdbc:mysql://localhost:3306/" + database;
	private static Connection cnct;

	public static Connection getConnect()
	{
			try
			{
				Class.forName("com.mysql.jdbc.Driver")             ;
				cnct = DriverManager.getConnection(url, user, pass);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Erreur: " + e.getMessage());
			}
			return cnct;
	}
}
