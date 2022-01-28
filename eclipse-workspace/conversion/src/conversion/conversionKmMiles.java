package conversion;

import java.util.Scanner;

public class conversionKmMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		long km = 1000000;
		long miles =0 ;
		String Q;
		long horslimite= 1000001;
		// (km < 0.01 || km > 1000000)
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir une valeur en km");
		km =sc.nextLong();
		
		boolean macondition =(horslimite < km);
		if(macondition == true) {
			System.out.println(" la saisie est: hors limite" );
			
		}
		
	}
	

}
