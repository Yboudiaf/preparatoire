package essaie;

import java.util.Scanner;

public class essaieTryCatch {

	public static void main(String[] args) {

		String saisie;
		int valeur ;	
		String []tableauDeConversion;
		String uniteDeMesure ;
		double conversion;

		// (km < 0.01 || km > 1000000)
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir une valeur ");

		saisie = sc.nextLine();
		if (!saisie.equals("q")) {
			convertirUneValeur(saisie);
			try {
				valeur = Integer.valueOf(saisie);
			} catch (NumberFormatException ex) {

				

				System.out.println("programme terminer");
			}

		}

	}//fin de main
public static void convertirUneValeur( String saisie) {
	
	System.out.println(saisie);
				}
}//fin de classe 






