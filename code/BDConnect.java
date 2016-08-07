import java.beans.Statement       ;
import java.sql.Connection        ;
import java.sql.DriverManager     ;
import java.sql.PreparedStatement ;
// import java.sql.SQLException      ; // Nécessaire si on a recours à SQLException pour un e.printStackTrace() qui renverrait un message d'erreur plus explicite, utile au debug
import javax.swing.JOptionPane    ;


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
