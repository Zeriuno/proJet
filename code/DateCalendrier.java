import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;

public class DateCalendrier {

	public static void main(String[] args) {
		String mois[] = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "décembre"};
		String jour[] = {"", "dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi"};
		
		String jour1, mois1;
		int date, annee;
		
		Calendar cal = Calendar.getInstance();
		
		jour1 = jour[cal.get(Calendar.DAY_OF_WEEK)];
		date = cal.get(Calendar.DAY_OF_MONTH);
		mois1 = mois[cal.get(Calendar.MONTH)];
		annee = cal.get(Calendar.YEAR);
		
		String date1 = "2016-08-07 10:00";
		String date3 =  date1.replace(' ', 'T');
		String date2 = "2016-08-07 12:00";
		String date4 = date2.replace(' ', 'T');
		
		System.out.println("Aujourd'hui, nous sommes le " + jour1 + " " + date + " " + mois1 + " " + annee);
		Period.between(LocalDate.of(2011, Month.JULY, 28), LocalDate.of(2014, Month.MARCH, 18));
		System.out.println(Period.between(LocalDate.of(2011, Month.JULY, 28), LocalDate.of(2014, Month.MARCH, 18)));
		Duration.between(Instant.parse(date3 + ":00.000Z"), Instant.parse(date4 + ":00.000Z")).getSeconds();
		System.out.println(Duration.between(Instant.parse(date3 + ":00.000Z"), Instant.parse(date4 + ":00.000Z")).getSeconds()/3600);
	}

}