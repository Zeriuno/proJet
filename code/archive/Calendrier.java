import java.util.ArrayList;

public class Calendrier {

	
	ArrayList<Evenement> evnts =new ArrayList<Evenement>();
   
	
	public void ajoutEven(Evenement e){
		evnts.add(e);
	}
	
public String toString(){
		
		StringBuilder s = new StringBuilder();
		s.append("Votre calendrier: \n");
		for (Evenement e : evnts){
		s.append(e.toString()).append("\n");
		}
	    return s.toString();
		
	}

}
