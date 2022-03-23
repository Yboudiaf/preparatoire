public class program {

	public static void main(String[] args) {
				
		
		Animal tata;
		Chien tina ;
		
		tata = new Animal("Taupe");
	    tina = new Chien();
		Animal toto = new Animal("Canard");	
		System.out.println("Tata est un(e) " + tata.getEspece());
		
		tata.manger();
		tina.aboyer();
		
		Chat garfield = new Chat();
		
		garfield.manger();
		
		
	}

}
