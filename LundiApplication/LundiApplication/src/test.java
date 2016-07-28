
public class test {

	public static void main(String[] args) {
		 
		Bdmanager robot=new Bdmanager();
		//Evenement wtf = new Evenement("tot","shit");
		Evenement m= new Evenement("lol", "lala");
//		m.setText();	 
		System.out.println(m.toString());
		System.out.println(m.idEven);
		
		Evenement n= new Evenement("lol", "lala");
//		m.setText();	 
		System.out.println(n.toString());
		System.out.println(n.idEven);
		robot.extraEven();
		
		robot.modifEven(2, "textEven", "ce weekend");
		
//		Evenement n= new Evenement("lo", "lililili");
//		n.setText();	 
//		System.out.println(n.toString());
	}

}
