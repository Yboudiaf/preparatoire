package conversion;
import java.util.Scanner;
public class conversion2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String valeurAConvertir;
		String [ ] tableauDeConversion;
		Boolean go = false;
		int index = 0;
		tableauDeConversion = new String[100 ]; do {
			System.out.println("Veuillez saisir une valeur à convertir svp.");
			valeurAConvertir = sc.nextLine();
			if (valeurAConvertir.equals("go")) {
				go=true;
			}
			else {
				tableauDeConversion [ index ]=valeurAConvertir;
				index ++;
			}
		} while (go == false);
		for (int i = 0; i< index; i++) {
			String valeur= tableauDeConversion[ i ];
			convertirUneValeur(valeur);
		} System.out.println( "Programme termine."); 
		sc.close();
	}// fin du main
	public static void convertirUneValeur( String valeur)
	{
		String [ ] valeurEtUnite = valeur.split(" ");
		String unite;
		double conversion;
		String uniteResultat;
		if (valeurEtUnite.length >1) {
			unite = valeurEtUnite[1];
		}
		else {
			unite= "km";
		}
		conversion = Double.parseDouble(valeurEtUnite[0]);
		if (unite.equals("km")){
			conversion = (conversion /1.609);
			uniteResultat = "mi";
		}
		else {
			conversion = (conversion *1.609);
			uniteResultat = "km";
		}
		System.out.println(valeur+ " = " + conversion +" "+uniteResultat);
	}




}


