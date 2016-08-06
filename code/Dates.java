import java.util.Calendar          ;
import java.util.Date              ;
import java.util.GregorianCalendar ;


// à priori ces trois imports suivants sont inutiles, laissons pour le moment.
import java.text.DateFormat        ; //pour passer une chaîne de caractères en date
import java.text.ParseException    ; //pour passer une chaîne de caractères en date
import java.text.SimpleDateFormat  ; //pour passer une chaîne de caractères en date


public class Dates {
	/*
	 * Classe pour manipuler les dates.
	 * 
	 * this.moisChaine: Mois du Jeudi de la semaine en cours, en chaîne de caractères.
	 * this.anneeJeudi: Année du Jeudi, en int.
	 * this.semaine[]: tableau de sept cases, met en correspondance les jours de la semaine avec les jours du mois 
	 * 				   this.semaine[0] renvoie le combien du mois on est Lundi... this.semaine[7] pareil pour Dimance. 
	 * 
	 * Contient:
	 * 			* Un constructeur (qui appelle remplirSemaine)
	 * 			* La méthode void private remplirSemaine
	 * 			* Les méthodes void pour réculer (semaineAvant) et avancer (semaineApres) de semaine (font appel à remplirSemaine)
	 * 			* Les méthodes String pour obtenir la date du Lundi (borneBasse) et du Dimanche (borneHaute)
	 * 				en format YYYY-MM-DD
	 * 			* La méthode void print qui imprime tous les jours de la semaine au format "14 juillet 2016", utile pour debug
	 * 			* Divers et variés développés au fur et à mésure et qui, au fait, ne sont pas utiles.
	 * 
	 */
	
	String moisChaine           ;
	int anneeJeudi              ;
	int[] semaine = new int [7] ;
	Date maintenant             ;
    Calendar calendar = new GregorianCalendar() ;
    public static void main(String[] a)
	  {
	    Dates yo = new Dates();
	    yo.print();
	    yo.semaineAvant();
	    yo.print();
	    yo.semaineApres();
	    yo.print();
	    yo.semaineAvant();
	    yo.semaineAvant();
	    yo.semaineAvant();
	    yo.semaineAvant();
	    yo.semaineAvant();
	    yo.semaineAvant();
	    yo.print();
	    yo.semaineApres();
	    yo.print();
	  }

	public Dates()
	/*
	 * Constructeur de l'objet Dates.
	 * Initialise l'objet Date à la date du système et appelle la fonction this.remplirSemaine 
	 * qui renseigne les autres variables de l'objet.
	 */
	  {
		  maintenant = new Date() ; //Date initialisée à maintenant
		  this.remplirSemaine()   ;
	  }
//	    System.out.println(calendar.get(Calendar.DATE) + "/" + (calendar.get(Calendar.MONTH)+1)); //Imprimer jour et mois courants
	  
	  public void semaineApres()
	  /*
	   * À appeller quand on avance d'une semaine
	   */
	  {
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
		  for(int i =2 ; i< 9; i++)
		  {
		  	calendar.set(Calendar.DAY_OF_WEEK, i)         ;
		  	this.semaine[j] = calendar.get(Calendar.DATE) ;
		  	j++                                           ;
		  }
		  calendar.set(Calendar.DAY_OF_WEEK, 5)         ;  // on se place au Jeudi
		  this.anneeJeudi = calendar.get(Calendar.YEAR) ;  // this.anneeJeudi prend la valeur 
		  String mois[] = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};
		  this.moisChaine = mois[calendar.get(Calendar.MONTH)] ;
	  }
	  
	  public String borneBasse()
	  /*
	   * Pour avoir la date du Lundi en format YYYY-MM-DD.
	   * Elle est ainsi prête pour faire une requête dans la BDD.
	   * 
	   */
	  {
		  String s = new String()                     ;
		  calendar.set(Calendar.DAY_OF_WEEK, 2)       ;
		  int d = calendar.get(Calendar.DAY_OF_MONTH) ;
		  int M = calendar.get(Calendar.MONTH) + 1    ;
		  int y = calendar.get(Calendar.YEAR)         ;
		  
		  s =  String.valueOf(y) + "-" + String.valueOf(M) + "-" + String.valueOf(d);
		  return s;
	  }
	  
	  public String borneHaute()
	  /*
	   * Pour avoir la date du Dimanche en format YYYY-MM-DD.
	   * Elle est ainsi prête pour faire une requête dans la BDD.
	   * 
	   */
	  {
		  String s = new String()                     ;
		  calendar.set(Calendar.DAY_OF_WEEK, 8)       ;
		  int d = calendar.get(Calendar.DAY_OF_MONTH) ;
		  int M = calendar.get(Calendar.MONTH) + 1    ;
		  int y = calendar.get(Calendar.YEAR)         ;
		  
		  s =  String.valueOf(y) + "-" + String.valueOf(M) + "-" + String.valueOf(d);
		  return s;
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
