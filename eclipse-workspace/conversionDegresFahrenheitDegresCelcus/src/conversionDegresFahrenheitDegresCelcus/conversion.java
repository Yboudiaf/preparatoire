package conversionDegresFahrenheitDegresCelcus;
import java.util.Scanner;
public class conversion {

	public static void main(String[] args) {


		Double conversion;
		double valeur;
		String saisie;
		String uniteDeMesure;
		String [] tableauDeConversion;

		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez une valeur entre -459,67 et 5 000 000 suivi de l'unite de temperature C pour celcius et F pour fahrenheit");

		saisie = sc.nextLine();
		tableauDeConversion = saisie.split(" ");
		valeur = Integer.valueOf(tableauDeConversion[0]);

		if(tableauDeConversion.length > 1) {
			uniteDeMesure = tableauDeConversion[1];
		}
		else {
			uniteDeMesure = "C";
		}
		uniteDeMesure = uniteDeMesure.toUpperCase();
		if(uniteDeMesure.equals("C")) {

			conversion = valeur *9/5+32;
			System.out.println("la temperature de "+valeur+ " °C vaut "+conversion+" °F");
		}
		else if (uniteDeMesure.equals("F")) {

			conversion =(valeur-32)*5/9;
			System.out.println("la temperature de "+valeur+ " °F vaut "+conversion+" °C");
		}

	}//fin de main
}//fin de classe







