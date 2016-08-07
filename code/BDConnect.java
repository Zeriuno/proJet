import java.sql.Connection        ;
import java.sql.DriverManager     ;
import javax.swing.JOptionPane    ;
/*
import java.sql.PreparedStatement ; // Les statements sont traités dans les classes, pas ici
import java.beans.Statement       ; // Les statements sont traités dans les classes, pas ici
import java.sql.SQLException      ; // Nécessaire si on a recours à SQLException pour un e.printStackTrace() qui renverrait un message d'erreur plus explicite, utile au debug
*/


public class BDConnect {
	
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
