package permutationDeVariable;

import java.util.Scanner;

public class exercice9_1 {

	public static void main(String[] args) {

		//DECLARATIONS DE VARIABLES

		//ENTIER A
		int a;
		//ENTIER B
		int b;

		//SAISIE ET TRAITEMENT
		Scanner sc = new Scanner(System.in);
		//ECRIRE SAISISSEZ LA VALEUR A
		System.out.println("Saisissez la valeur a");
		//OUTIL SCANNER

		//LIRE A
		a = sc.nextInt();
		//ECRIRE SAISISSEZ LA VALEUR B
		System.out.println("Saisissez la valeur b");
		//LIRE B
		b = sc.nextInt();
		//SI A<B alors
		if(a<b) {
			//AFFICHER A<B
			System.out.println("a<b");
		}	
		//SINON SI A>B
		else if(a>b){
			//AFFICHER A>B
			System.out.println("a>b");

		}
		//SINON
		else{
			//AFFICHER A=B
			System.out.println("a=b");

		}
	}
}


