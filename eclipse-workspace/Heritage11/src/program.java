public class program {

	public static void main(String[] args) {
		Loup LoupBlanc;	
		Cheval chevalBlancHenry;
		Taupe Taupe;
		Chien tina ;
		
		
	   
		Animal toto = new Animal("Canard");	
		
		Taupe = new Taupe();		
		
	
		System.out.println("Tata est une "+Taupe.getEspece());
		Taupe.manger();
		Taupe.patate();
		System.out.println("");
		
		tina = new Chien();		
		System.out.println("tina est un "+tina.getEspece());
		tina.getMarcher();
		tina.manger();
		tina.aboyer();
		tina.pathe();
		
		System.out.println();
		
		Chat garfield = new Chat();
		System.out.println("garfield est un "+garfield.getEspece());
		garfield.getMarcher();
		garfield.manger();		
		garfield.miauler();	
		garfield.croquette();
		
		System.out.println();
		
		Cheval chevalBlancHenry1 = new Cheval();
		System.out.println("Henry V est un "+chevalBlancHenry1.getEspece());
		chevalBlancHenry1.getMarcher();
		chevalBlancHenry1.manger();
		chevalBlancHenry1.souffler();
		chevalBlancHenry1.foin();
		
		System.out.println();
		
		
		Loup LoupBlanc1 = new Loup();
		System.out.println("loup blanc est un "+LoupBlanc1.getEspece());
		LoupBlanc1.getMarcher();
		LoupBlanc1.manger();
		LoupBlanc1.hurler();
		LoupBlanc1.brebis();
		
		
		
		
	}

}
