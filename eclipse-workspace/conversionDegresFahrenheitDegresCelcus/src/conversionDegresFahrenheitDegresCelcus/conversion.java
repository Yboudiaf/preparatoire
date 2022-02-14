package conversionDegresFahrenheitDegresCelcus;
import java.util.Scanner;
public class conversion {

	public static void main(String[] args) {


		Double conversion =0.0;
		double valeur;
		String saisie ;
		int min;
		int max;
		String uniteDeMesure;
		String [] tableauDeConversion;
		int index=0;
		boolean quit = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("saisissez une unite de mesure C pour celcius et F pour farenheit");
		uniteDeMesure = sc.next();
		
		
			System.out.println("Saisissez une valeur  minimum entre -459,67 et 5 000 000 ");
			min = sc.nextInt();	
			
			System.out.println("Saisissez une valeur superieur au minimum entre -459,67 et 5 000 000 ");
			max = sc.nextInt();
			
			if(uniteDeMesure.equals("c") ); {	
		
		
		tableauDeConversion = uniteDeMesure.split(" ");
		valeur = Integer.valueOf(tableauDeConversion[0]);
}
		if(tableauDeConversion.length > 1) {
			uniteDeMesure = tableauDeConversion[1];

		}
		else if(uniteDeMesure.equals("C"));
			
		
		uniteDeMesure = uniteDeMesure.toUpperCase();
		if(uniteDeMesure.equals("C")) {

			conversion = valeur *9/5+32;
			System.out.println("la temperature de "+valeur+ " °C vaut "+conversion+" °F");
		}
		else if (uniteDeMesure.equals("F")) {

			conversion =(valeur-32)*5/9;
			System.out.println("la temperature de "+valeur+ " °F vaut "+conversion+" °C");
		}
		if (uniteDeMesure.equals("quit")) {
		quit=true;
		System.out.println( "Programme termine.");
		}
		else {
			tableauDeConversion [index]=uniteDeMesure;
			index ++;
		}
	 
	for (int compteur = min; compteur<= max; compteur++) {
	
		 sc.close();
	} 

	}//fin de main
}//fin de classe







