import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Dates {	
	String mois[] = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "décembre"};
	String jour[] = {"", "dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi"};

	String jour1, jour2, mois1;

	int date, annee, heure, minute;

	Date maintenant;

	  Calendar calendar = new GregorianCalendar();

	  public static void main(String[] a)
	  {
	    new Dates().semaineAvant();
	  }

	  Dates()
	  {
		  maintenant = new Date(); //La date est initialisée à maintenant, car au lancement du programme on a besoin de ça.
	  }
//	    System.out.println(calendar.get(Calendar.DATE) + "/" + (calendar.get(Calendar.MONTH)+1)); //Imprimer jour et mois courants
	  public void cetteSemaine()
	  {
		calendar.setTime(maintenant);
		
	    //Comme ça on imprime les jours du mois pour une semaine
	    int i = 3 ;
		calendar.set(Calendar.DAY_OF_WEEK, i)      ; //On récupère le Lundi de la semaine en cours.
	    int Lundi = calendar.get(Calendar.DATE)    ;
	    calendar.set(Calendar.DAY_OF_WEEK, i++)    ;
	    int Mardi = calendar.get(Calendar.DATE)    ;
	    calendar.set(Calendar.DAY_OF_WEEK, i++)    ;
	    int Mercredi = calendar.get(Calendar.DATE) ;
	    calendar.set(Calendar.DAY_OF_WEEK, i++)    ;
	    int Jeudi = calendar.get(Calendar.DATE)    ;
	    calendar.set(Calendar.DAY_OF_WEEK, i++)    ;
	    int Vendredi = calendar.get(Calendar.DATE) ;
	    calendar.set(Calendar.DAY_OF_WEEK, i++)    ;
	    int Samedi = calendar.get(Calendar.DATE)   ;
	    calendar.set(Calendar.DAY_OF_WEEK, i++)    ;
	    int Dimanche = calendar.get(Calendar.DATE) ;
	  }
	  
	  public void semainePro()
	  {
		calendar.setTime(maintenant)           ;
		calendar.set(Calendar.DAY_OF_WEEK, 2)  ;
		calendar.add(Calendar.DAY_OF_MONTH, 7) ;
	  }
	  
	  public void semaineAvant()
	  {
		  calendar.setTime(maintenant)            ;
		  calendar.set(Calendar.DAY_OF_WEEK, 2)   ;
	      calendar.add(Calendar.DAY_OF_MONTH, -7) ;
	      System.out.println(calendar.get(Calendar.DATE) + "/" + (calendar.get(Calendar.MONTH)+1)); //Imprimer jour et mois courants
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
