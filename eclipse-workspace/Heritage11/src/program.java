public class program {

	public static void main(String[] args) {
		Loup loupBlancGege;	
		Cheval chevalBlancHenry;
		Taupe Taupe;
		Chien tina ;
		
		
	   
		Animal toto = new Animal("Canard");	
		
		Taupe = new Taupe();		
		Taupe.manger();
		Taupe.getMarcher();
		System.out.println("Tata est un(e) "+Taupe.getEspece());

		
		
		tina = new Chien();		
		System.out.println("tina est un "+tina.getEspece());
		tina.getMarcher();
		tina.manger();
		tina.aboyer();
		
		Chat garfield = new Chat();
		System.out.println("garfield est un "+garfield.getEspece());
		garfield.getMarcher();
		garfield.manger();		
		garfield.miauler();	
		

		
		
		
		
		
	}

}
