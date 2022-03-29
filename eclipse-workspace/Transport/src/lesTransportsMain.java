
public class lesTransportsMain {

	public static void main(String[] args) {
		
		String bateaux;
		String avion;
		String voiture;	
		
		
		
		Terrestre charAssaut = new Terrestre();
		charAssaut.roue();
		System.out.println("");
		
		Aerien chasseur = new Aerien();
		chasseur.roue();
		System.out.println("");
		
		Maritime yacht = new Maritime();
		yacht.roue();
		
		
	}

}
