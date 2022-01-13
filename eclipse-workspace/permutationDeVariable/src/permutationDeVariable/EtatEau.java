package permutationDeVariable;

import java.util.Scanner;

public class EtatEau {

	public static void main(String[] args) {
		
					//Declaration de variable
		
		float temperature;
		
		System.out.println("quelle est la temperature de l'eau? ");
		Scanner sc = new Scanner(System.in);
		temperature = sc.nextFloat();
		if(temperature <= 0 ) {
			System.out.println("l'etat de l'eau est glace");
			
		}else if (temperature >0 && temperature <100){
			System.out.println("l'etat de l'au est liquide");
			
		}
		else { 
			System.out.println("l'etat de l'eau est vapeur");
		} 
		
		sc.close();
	}

}
