package conversion;

import java.util.Scanner;

public class conversionKmMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nombre;	
		float km = 1000000;
		double miles =1.609 ;
		String saisie ;
		long horslimite= 1000001;

		// (km < 0.01 || km > 1000000)
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir une valeur en km");
			saisie =sc.nextLine();
			if(saisie.equals("q")) {
				
				String saisie = Integer.parseInt(String);
				System.out.println("programme terminer");
				
			}
			//
		System.out.print("La valeur de " + nombre + " en km est: ");
			miles = nombre/1.609;
		System.out.print(miles + " miles");

		boolean macondition =(horslimite < km);
			if(macondition == true) {
			System.out.println(" la saisie est: hors limite" );	


		
		}sc.close();
	}

}



