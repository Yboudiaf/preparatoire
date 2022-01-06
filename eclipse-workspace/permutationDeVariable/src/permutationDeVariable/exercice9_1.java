package permutationDeVariable;

import java.util.Scanner;

public class exercice9_1 {

	public static void main(String[] args) {

		//DECLARATIONS DE VARIABLES

		//ENTIER A
		int A;
		//ENTIER B
		int B;

		//SAISIE ET TRAITEMENT
		Scanner sc = new Scanner(System.in);
		//ECRIRE SAISISSEZ LA VALEUR A
		System.out.println("Saisissez la valeur A");
		//OUTIL SCANNER
		
		//LIRE A
		A = sc.nextInt();
		//ECRIRE SAISISSEZ LA VALEUR B
		System.out.println("Saisissez la valeur B");
		//LIRE B
		B = sc.nextInt();
		//SI A<B alors
		if(A<B) {
			//AFFICHER A<B
			System.out.println("A<B");
		}	
			//SINON SI A>B
		else if(A>B){
			//AFFICHER A>B
			System.out.println("A>B");
		
		}
		//SINON
		else{
			//AFFICHER A=B
			System.out.println("A=B");

		}
	}
}


