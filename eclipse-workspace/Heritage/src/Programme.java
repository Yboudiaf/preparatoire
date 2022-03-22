
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
		
		garfield.setEspece("chat");
		chaminou.setEspece("chat");
		calypso.setEspece("chat");
		garfield.setNom("chat");
		garfield.setNom("chat");
		
		calypso1.setAge(22);
		chaminou1.setAge(25);
		garfield1.setAge(37);
		calypso.setAge(21);
		chaminou.setAge(315);
		garfield.setAge(37);
		
		System.out.println(calypso.getEspece()+" "+calypso.majeurOuMineur());
		System.out.println(chaminou.getEspece()+" "+chaminou.majeurOuMineur());
		System.out.println(garfield.getNom() +" "+ garfield.majeurOuMineur());
		System.out.println(calypso1.getEspece()+" "+calypso.majeurOuMineur());
		System.out.println(chaminou1.getEspece()+" "+chaminou.majeurOuMineur());
		System.out.println(garfield1.getNom() +" "+ garfield.majeurOuMineur());
	}

}
