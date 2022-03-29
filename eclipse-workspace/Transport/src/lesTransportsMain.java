
public class lesTransportsMain {

	public static void main(String[] args) {
		
		String bateaux;
		String avion;
		String voiture;	
		
		Terrestre charAssaut = new Terrestre();
		charAssaut.roue();
		
		Aerien chasseur = new Aerien();
		chasseur.roue();
		
		Maritime yacht = new Maritime();
		yacht.roue();
		
		
	}

}
