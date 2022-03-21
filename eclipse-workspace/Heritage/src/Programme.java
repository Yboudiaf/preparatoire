
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
		
		garfield.setEspece("chat");
		chaminou.setEspece("chat blanc");
		calypso.setEspece("chat black");
		garfield.setNom("toto");
		
		
		calypso.setAge(19);
		chaminou.setAge(15);
		garfield.setAge(18);
		
		System.out.println(calypso.getEspece()+" "+calypso.majeurOuMineur());
		System.out.println(chaminou.getEspece()+" "+chaminou.majeurOuMineur());
		System.out.println(garfield.getNom() +" "+ garfield.majeurOuMineur());
	}

}
