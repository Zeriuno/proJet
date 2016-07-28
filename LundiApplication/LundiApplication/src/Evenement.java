import java.util.Scanner;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class Evenement {
	
	Bdmanager robot=new Bdmanager();
    
	//attributs 
	String textEven;
	String nomEven;
	int idEven;
	
	
	//constructeur 
	public Evenement( String nomEven ) {
		this.nomEven = nomEven;
	}
	public Evenement( String nomEven, String textEven ) {
		this.textEven = textEven;
		this.nomEven=nomEven;
		robot.ajoutEven(nomEven, textEven);
		
		
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
