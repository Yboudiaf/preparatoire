package permutationDeVariable;

import java.util.Scanner;

public class exo_boucleTempérature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		//chain SiTemperaturetrenteHuite
		//ecrire " Est ce que ma température est <=38?oui/non"


		String SiTemperaturetrenteHuite;

		System.out.println("Est ce que ma température est <=38? oui/non");
		Scanner sc= new Scanner(System.in);
		SiTemperaturetrenteHuite = sc.next();

		while (SiTemperaturetrenteHuite.equals("oui")) {

			System.out.println("j'irais me promener, je vais bien");
			System.out.println("est ce que ma température est toujour <=38? oui/non");
			SiTemperaturetrenteHuite = sc.next();	
		}
		System.out.println("j'irais voir le toubib");
	}
}
