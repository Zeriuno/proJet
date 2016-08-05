import java.util.Calendar          ;
import java.util.Date              ;
import java.util.GregorianCalendar ;


// à priori ces trois imports suivants sont inutiles, laissons pour le moment.
import java.text.DateFormat        ; //pour passer une chaîne de caractères en date
import java.text.ParseException    ; //pour passer une chaîne de caractères en date
import java.text.SimpleDateFormat  ; //pour passer une chaîne de caractères en date


public class Dates {
	/*
	 * 
	 */
	
	//Ce tableau permet de faire la correspondance entre les noms de la semaine et les jours renvoyés par calendar.get(Calendar.DAY_OF_WEEK) 
	//String jour[] = {"", "dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi"};

	String moisChaine ;

	int anneeJeudi, moisLundi, moisDimanche, anneeLundi, anneeDimanche ; //ajouter mois Lundi et moisDimanche, anneeLundi, anneeDimanche
	int[] semaine = new int [7]             ;

	Date maintenant;

	  Calendar calendar = new GregorianCalendar();

	  public static void main(String[] a)
	  {
	    Dates yo = new Dates();
	    System.out.println(yo.anneeJeudi);
	  }

	  Dates()
	  /*
	   * this.semaine[] contiendra la date des jours de la semaine: du Lundi (this.semaine[0]) au Dimanche (this.semaine[6])
	   */
	  {
		  maintenant = new Date() ; //La date est initialisée à maintenant, car au lancement du programme on a besoin de ça.
		  this.remplirSemaine()   ;
	  }
//	    System.out.println(calendar.get(Calendar.DATE) + "/" + (calendar.get(Calendar.MONTH)+1)); //Imprimer jour et mois courants
	  
	  public void semainePro()
	  /*
	   * À appeller quand on avance d'une semaine
	   */
	  {
		  calendar.setTime(maintenant)           ;
		  calendar.set(Calendar.DAY_OF_WEEK, 2)  ;
		  calendar.add(Calendar.DAY_OF_MONTH, 7) ;
		  this.remplirSemaine()                  ;
	  }
	  
	  public void semaineAvant()
	  /*
	   * À appeller quand on recule d'une semaine
	   */
	  {
		  calendar.setTime(maintenant)            ;
		  calendar.set(Calendar.DAY_OF_WEEK, 2)   ;
	      calendar.add(Calendar.DAY_OF_MONTH, -7) ;
	      this.remplirSemaine()                   ;
	  }
	  
	  public void chaineEnDate(String str)
	  {
		  DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		  Date date=null;
		  try
		  {
		    date= df.parse(str);
		  }
		  catch (ParseException e)
		  {
			e.printStackTrace();
		  }
		  System.out.println(date);
	  }
	  
	  private void remplirSemaine()
	  {
		  int j = 0 ;
		  //Comme ça on imprime les jours du mois pour une semaine
		  for(int i =2 ; i< 9; i++)
		  {
		  	calendar.set(Calendar.DAY_OF_WEEK, i)         ;
		  	this.semaine[j] = calendar.get(Calendar.DATE) ;
		  	System.out.println(this.semaine[j]) ;
		  	j++                                           ;
		  }
		  calendar.set(Calendar.DAY_OF_WEEK, 5)         ;  // on se place au Jeudi
		  this.anneeJeudi = calendar.get(Calendar.YEAR) ;  // this.anneeJeudi prend la valeur 
		  String mois[] = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};
		  this.moisChaine = mois[calendar.get(Calendar.MONTH)] ;
	  }
	    
	    
	    /*
		for(int j=2; i<8;i++)
	    {
	    	calendar.set(Calendar.DAY_OF_WEEK, i);
	    }
		calendar.set(Calendar.DAY_OF_WEEK, 1);/*
    	System.out.println(calendar.get(Calendar.DATE));


		/*	    jour1 = jour[calendar.get(Calendar.DAY_OF_WEEK)];
		date = calendar.get(Calendar.DAY_OF_MONTH);
		mois1 = mois[calendar.get(Calendar.MONTH)];
		annee = calendar.get(Calendar.YEAR);
		heure = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);*/


	    /*
		calendar.set(Calendar.DAY_OF_MONTH, 13);
		calendar.set(Calendar.MONTH, 6);
		calendar.set(Calendar.YEAR, 2016);
		calendar.set(Calendar.HOUR_OF_DAY, 13);
		calendar.set(Calendar.MINUTE, 52);*/

	    //calendar.add(Calendar.DAY_OF_MONTH, 1);
//	    System.out.println("Jour du mois: " + calendar.get(Calendar.DAY_OF_MONTH));


    	
    	
	    //System.out.println("Date: " + calendar.get(Calendar.DATE));
	    /*System.out.println("Jour du mois: " + date);
	    System.out.println("Mois: " + mois1);
	    System.out.println("Année: " + annee);
	    //System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
	    //System.out.println("Heure: " + calendar.get(Calendar.HOUR));
	    System.out .println("Heure de la journée: " + heure);
	    System.out.println("Minute: " + minute);
	    System.out.println("Nous sommes le : " + jour1 + " " + date + " " + mois1
	    		+ " " + annee + ", il est " + heure + " h " + minute + " mn");
	*/   

}
