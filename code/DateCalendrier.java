package agenda;

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
		
		System.out.println("Aujourd'hui, nous sommes le " + jour1 + " " + date + " " + mois1 + " " + annee);
		Period.between(LocalDate.of(2011, Month.JULY, 28), LocalDate.of(2014, Month.MARCH, 18));
		System.out.println(Period.between(LocalDate.of(2011, Month.JULY, 28), LocalDate.of(2014, Month.MARCH, 18)));
		Duration.between(Instant.parse("2016-08-07T10:00:00.000Z"), Instant.parse("2016-08-07T12:00:00.000Z")).getUnits();
		System.out.println(Duration.between(Instant.parse("2016-08-07T10:00:00.000Z"), Instant.parse("2016-08-07T12:00:00.000Z")).getSeconds()/3600);
	}

}