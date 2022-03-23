
public class Programme {

	public static void main(String[] args) {
		
		
		Animal toto;
		Animal tata;
		
		toto = new Animal();
		tata = new Animal();
		tata.setEspece("chat");
		
		Chat garfield = new Chat();
		Chat chaminou = new Chat();
		Chat calypso = new Chat();
		Chat garfield1 = new Chat();
		Chat chaminou1 = new Chat();
		Chat calypso1 = new Chat();
		
		
		
		
		
		
		
		
		garfield.setAge(37);garfield.direBonjour();garfield.setEspece("chat1");
		
		garfield1.setAge(37);garfield1.direBonjour();garfield1.setNom("chat2");

		calypso.setAge(21);calypso.direBonjour();calypso.setEspece("chat3");
		
		calypso1.setAge(22);calypso1.direBonjour();calypso1.setNom("chat4");
		
		chaminou.setAge(5);chaminou.direBonjour(); chaminou.setEspece("chat5");
	
		chaminou1.setAge(25);chaminou1.direBonjour(); chaminou1.setEspece("chat6");
		
		
	
		
		System.out.println(garfield.getNom() +" "+ garfield.majeurOuMineur()+"");
		System.out.println(calypso.getEspece()+" "+calypso.majeurOuMineur());
		System.out.println(chaminou.getEspece()+" "+chaminou.majeurOuMineur());
		System.out.println(calypso1.getEspece()+" "+calypso1.majeurOuMineur());
		System.out.println(chaminou1.getEspece()+" "+chaminou1.majeurOuMineur());
		System.out.println(garfield1.getNom()+" "+garfield1.majeurOuMineur());
	}

}
