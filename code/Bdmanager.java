import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Bdmanager {

    
	public Bdmanager() {
		// TODO Auto-generated constructor stub
	}
   //generateur du cl�
	public static int geneId( ){

		String url = "jdbc:mysql://localhost/java";
		String login="root";
		String passwd="";
		Connection cn=null;
		Statement st=null;
		ResultSet rs =null;
		int id = 0;
		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			
			st = cn.createStatement();

			String sql = "insert `evenement` ( `nomEven`) values('give me a id')";

			st.executeUpdate(sql);

            String sqlbis = "select max(idEven) from evenement";
			
		    rs=st.executeQuery(sqlbis);
		    
			while(rs.next()){
			id=rs.getInt(1);
			System.out.println(rs.getInt(1));}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
  
		return id;
	  }
	//fonction getId
	public static int getId( ){

		String url = "jdbc:mysql://localhost/java";
		String login="root";
		String passwd="";
		Connection cn=null;
		Statement st=null;
		ResultSet rs =null;
		int id = 0;
		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			
			st = cn.createStatement();


            String sqlbis = "select max(idEven) from evenement";
			
		    rs=st.executeQuery(sqlbis);
		    
			while(rs.next()){
			id=rs.getInt(1);
			System.out.println(rs.getInt(1));}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
  
		return id;
	  }
	
	
	
	//fonction ajoutEven
	public static void ajoutEven(int idEven,String nomEven, String textEven ){

		String url = "jdbc:mysql://localhost/java";
		String login="root";
		String passwd="";
		Connection cn=null;
		Statement st=null;

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Création d'un statement
			st = cn.createStatement();

			String sql = "update `evenement` set `nomEven`='"+nomEven+"',`textEven` ='" + textEven +"' Where idEven="+idEven+"";

			// Etape 4 : exécution requête
			st.executeUpdate(sql);

			// Si récup données alors étapes 5 (parcours Resultset)

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	  }


	public static void extraEven() {

		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/java";
		String login = "root" ;
		String passwd = ""    ;
		Connection cn =null   ;
		Statement st =null    ;
		ResultSet rs =null    ;

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : r�cup�ration de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Cr�ation d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM evenement";

			// Etape 4 : ex�cution requ�te
			rs = st.executeQuery(sql);

			// Si r�cup donn�es alors �tapes 5 (parcours Resultset)

			while (rs.next()) {
				System.out.print(rs.getString("idEven"));
				System.out.print(rs.getString("nomEven"));
				System.out.println(rs.getString("textEven"));


			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : lib�rer ressources de la m�moire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

//modification

	public static void modifEven(String idEven, String colonne, String qch ){

		String url = "jdbc:mysql://localhost/java";
		String login="root";
		String passwd="";
		Connection cn=null;
		Statement st=null;

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : r�cup�ration de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Cr�ation d'un statement
			st = cn.createStatement();

			String sql = "UPDATE evenement SET "
					+ colonne + "='" + qch +"'WHERE idEven = "+idEven+"";

			// Etape 4 : ex�cution requ�te
			st.executeUpdate(sql);

			// Si r�cup donn�es alors �tapes 5 (parcours Resultset)

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {

			// Etape 6 : lib�rer ressources de la m�moire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	  }


	//++++++++++++++++++ Personne+++++++++++++++++++++//
	//fonction ajoutPers
		public static void ajoutPers(String nomPers, String prenomPers,String mailPers){

			String url = "jdbc:mysql://localhost/java";
			String login="root";
			String passwd="";
			Connection cn=null;
			Statement st=null;

			try {

				// Etape 1 : Chargement du driver
				Class.forName("com.mysql.jdbc.Driver");

				// Etape 2 : r�cup�ration de la connexion
				cn = DriverManager.getConnection(url, login, passwd);

				// Etape 3 : Cr�ation d'un statement
				st = cn.createStatement();

				String sql = "INSERT INTO `personne` (`nomPers`,`prenomPers`,`mailPers`) VALUES ('"
						+ nomPers + "','" + prenomPers +"','" + mailPers +"')";

				// Etape 4 : ex�cution requ�te
				st.executeUpdate(sql);

				// Si r�cup donn�es alors �tapes 5 (parcours Resultset)

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				try {
				// Etape 6 : lib�rer ressources de la m�moire.
					cn.close();
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		  }
	//fonction affichage
		public static void extraPers() {

			// Information d'acc�s � la base de donn�es
			String url = "jdbc:mysql://localhost/java";
			String login = "root";
			String passwd = "";
			Connection cn =null;
			Statement st =null;
			ResultSet rs =null;

			try {

				// Etape 1 : Chargement du driver
				Class.forName("com.mysql.jdbc.Driver");

				// Etape 2 : r�cup�ration de la connexion
				cn = DriverManager.getConnection(url, login, passwd);

				// Etape 3 : Cr�ation d'un statement
				st = cn.createStatement();

				String sql = "SELECT * FROM personne";

				// Etape 4 : ex�cution requ�te
				rs = st.executeQuery(sql);

				// Si r�cup donn�es alors �tapes 5 (parcours Resultset)

				while (rs.next()) {
					System.out.print(rs.getString("nomPers"));
					System.out.print(rs.getString("prenomPers"));
					System.out.println(rs.getString("mailPers"));


				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
				// Etape 6 : lib�rer ressources de la m�moire.
					cn.close();
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		//modification

		public static void modifPers(String mailPers, String colonne, String qch ){

			String url = "jdbc:mysql://localhost/java";
			String login="root";
			String passwd="";
			Connection cn=null;
			Statement st=null;

			try {

				// Etape 1 : Chargement du driver
				Class.forName("com.mysql.jdbc.Driver");

				// Etape 2 : r�cup�ration de la connexion
				cn = DriverManager.getConnection(url, login, passwd);

				// Etape 3 : Cr�ation d'un statement
				st = cn.createStatement();

				String sql = "UPDATE personne SET "
						+ colonne + "='" + qch +"'WHERE mailPers = '"+mailPers+"'";

				// Etape 4 : ex�cution requ�te
				st.executeUpdate(sql);

				// Si r�cup donn�es alors �tapes 5 (parcours Resultset)

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				try {

				// Etape 6 : lib�rer ressources de la m�moire.
					cn.close();
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		  }

//++++++++++++++++++++++ Invitation +++++++++++++++++++++


		//fonction ajouter invitation 
				public static void ajoutInvitation(String mailPers, int idEven){

					String url = "jdbc:mysql://localhost/java";
					String login="root";
					String passwd="";
					Connection cn=null;
					Statement st=null;

					try {

						// Etape 1 : Chargement du driver
						Class.forName("com.mysql.jdbc.Driver");

						// Etape 2 : r�cup�ration de la connexion
						cn = DriverManager.getConnection(url, login, passwd);

						// Etape 3 : Cr�ation d'un statement
						st = cn.createStatement();

						String sql = "INSERT INTO `invitation` (`mailPers`,`idEven`) VALUES ('"
								+ mailPers + "','" + idEven +"')";

						// Etape 4 : ex�cution requ�te
						st.executeUpdate(sql);

						// Si r�cup donn�es alors �tapes 5 (parcours Resultset)

					} catch (SQLException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO: handle exception
						e.printStackTrace();
					} finally {
						try {
						// Etape 6 : lib�rer ressources de la m�moire.
							cn.close();
							st.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				  }
 
//function extraction Invitation
				
public static void extraInvitation(int idEven) {

	// Information d'acc�s � la base de donn�es
	String url = "jdbc:mysql://localhost/java";
	String login = "root";
	String passwd = "";
	Connection cn =null;
	Statement st =null;
	ResultSet rs =null;

	try {

		// Etape 1 : Chargement du driver
		Class.forName("com.mysql.jdbc.Driver");

		// Etape 2 : r�cup�ration de la connexion
		cn = DriverManager.getConnection(url, login, passwd);

		// Etape 3 : Cr�ation d'un statement
		st = cn.createStatement();

		String sql = "SELECT * FROM invitation WHERE idEven=" +idEven+ "";

		// Etape 4 : ex�cution requ�te
		rs = st.executeQuery(sql);

		// Si r�cup donn�es alors �tapes 5 (parcours Resultset)

		while (rs.next()) {
			System.out.print(rs.getString("mailPers"));
			System.out.print(rs.getString("idEven"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} finally {
		try {
		// Etape 6 : lib�rer ressources de la m�moire.
			cn.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
  }
//supprission

		public static void supInvitation(int idEven){

			String url = "jdbc:mysql://localhost/java";
			String login="root";
			String passwd="";
			Connection cn=null;
			Statement st=null;

			try {

				// Etape 1 : Chargement du driver
				Class.forName("com.mysql.jdbc.Driver");

				// Etape 2 : r�cup�ration de la connexion
				cn = DriverManager.getConnection(url, login, passwd);

				// Etape 3 : Cr�ation d'un statement
				st = cn.createStatement();

				String sql = "DELETE  FROM `invitation` WHERE idEven = "+idEven+"";

				// Etape 4 : ex�cution requ�te
				st.executeUpdate(sql);

				// Si r�cup donn�es alors �tapes 5 (parcours Resultset)

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				try {

				// Etape 6 : lib�rer ressources de la m�moire.
					cn.close();
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		  }
}
