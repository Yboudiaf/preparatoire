package retraite;

import java.util.Scanner;

public class diferentRetraiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		

		
		
	}//fin de main

	public static String getRetired(int ageAtester) {
		int retraite = 60;
		int anneeDeRetraite;
		int ageAtester ;
		
		
		Scanner sc = new Scanner(System.in);
		if(ageAtester < 60 && ageAtester > 0 ){
			anneeDeRetraite = (60 - ageAtester  ) ;
			anneeDeRetraite = sc.nextInt();
			return "Il vous reste" + anneeDeRetraite+ "pour la retraite";
			
		}	
			if(ageAtester == 60 ) {
			return "vous �te � la retraite cette ann�e";
		}
			if (ageAtester <=0) {
				
				return "vous n'�te pas  encore n�e";
			}
			
			
			
		
		}

	

}//fin de classe 
