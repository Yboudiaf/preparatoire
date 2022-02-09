import java.util.Random;
import java.util.Scanner;

public class fourchette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre=0;
		int nombreAleatoir;

		Random rand = new Random ();
		Scanner sc = new Scanner(System.in); 
		
		
		

		nombreAleatoir = rand.nextInt(100);
	
		 do {
			 System.out.println("veuillez saisir un nombre");
			 nombre = sc.nextInt();
			

			 if (nombre == nombreAleatoir){
				 System.out.println("félicitation "+nombre+" est le bon nombre");

			 } else if((nombre - nombreAleatoir) <= 15 && (nombre - nombreAleatoir >= -15)) {
				 System.out.println("votre fourchette est de (15 +-");

			 } else if((nombre - nombreAleatoir <= 25) && (nombre - nombreAleatoir >= -25)){
				 System.out.println("votre fourchette est de (25 +-");


			 } else if((nombre - nombreAleatoir <= 50) &&  (nombre - nombreAleatoir >= -50)) {

				 System.out.println("votre fourchette est de (50 +-)") ;

			 } else {
				 System.out.println("Votre nombre est au dessus de 50");
			 }

		 }while( nombreAleatoir != nombre);
		
		sc.close();

	}//fin de main
}//fin de classe