package procedureEtMethode;

import java.util.Scanner;

public class methodeProcedure {

	public static void main(String[] args) {
	
		
		double leResul;
		 leResul = aditionner(10,10);
		 int ageAtester;
		 Scanner sc =new Scanner(System.in);
		 
		 System.out.println("veuillez rentrer votre age?");
		 ageAtester= sc.nextInt();
		 
		  String testreponse =MesFonctions.majeurOuMineur(ageAtester);
		 System.out.println(leResul*leResul);
		  
		  System.out.println(testreponse);
		  
	

	}//fin de main
	public static double aditionner(double nombre1 ,double nombre2) {
		double resultat;

		resultat = nombre1 + nombre2;

		return resultat;
		
		
	}
	
	public static void ecrireUnMessageDansLaConsole(String message) {
			System.out.println(message);
	}
	 
//	public static String majeurOuMineur(int ageTester)
//		{
//		
//		if(ageTester <18) {
//			
//			return "vous êtes mineur";
//		}
//		
//		else {
//			
//			return "vous etes majeur";
//		}
//		}
	
}//fin de classe

 
    

 