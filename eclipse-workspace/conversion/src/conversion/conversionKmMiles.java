package conversion;

import java.util.Scanner;

public class conversionKmMiles {

	public static void main(String[] args) {

		String saisie;
		int valeur=0 ;	
		String []tableauDeConversion;
		String uniteDeMesure ;
		double conversion;

		// (km < 0.01 || km > 1000000)
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir une valeur en mi ou km");

		saisie = sc.nextLine();

		tableauDeConversion = saisie.split(" ");//"12 mi"
		try {
			valeur = Integer.valueOf(tableauDeConversion[0]);
		} catch (NumberFormatException ex) {
			System.out.println("programme terminer");
		}
		if(tableauDeConversion.length > 1) {
			uniteDeMesure = tableauDeConversion[1];
		}
		else {
			uniteDeMesure = "km";
		}
		uniteDeMesure = uniteDeMesure.toLowerCase();
		if(uniteDeMesure.equals("km")) {
			//conversion km en miles
			conversion =(valeur/1.609);
			System.out.println("la distance de "+valeur+ " km vaut "+conversion+" miles");
		}
		else if (uniteDeMesure.equals("mi")) {
			//conversion mi en km
			conversion =(valeur*1.609);
			System.out.println("la distance de "+valeur+ " miles vaut "+conversion+" km");
		}
		else if(uniteDeMesure.equals("q")) {

			

		}
		sc.close();
	} //fin de main



}	// fin de classe



