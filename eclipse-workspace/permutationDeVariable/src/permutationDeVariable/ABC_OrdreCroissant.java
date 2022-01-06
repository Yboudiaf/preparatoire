package permutationDeVariable;

import java.util.Scanner;

public class ABC_OrdreCroissant {

	public static void main(String[] args) {

		//DECLARATION DE VARIABLE

		//Reel A
		float a;
		//Reel B
		float b;
		//Reel C
		float c;
		//SAISIE ET TRAITEMENT

		//Outil scanner importer
		Scanner sc = new Scanner(System.in);

		//Ecrire "saisie la valeur de A"
		System.out.println("saisie la valeur de a");

		//lire A
		a = sc.nextFloat();

		//Ecrire "saisie la valeur de B"
		System.out.println("saisie la valeur de b");

		//lire B
		b = sc.nextFloat();

		//Ecrire "saisie la valeur de C"
		System.out.println("saisie la valeur de c");

		//lire C
		c = sc.nextFloat();

		//coparaison A.B.C

		if (a<b && b<c){
			//afficher A<B<C
			System.out.println("A<B<C");
		}

		else if(b<a && b<c) {
			//afficher B<A<C			
			System.out.println("B<A<C");
		}	

		else if(a<c && c<b) {
			//afficher A<C<B
			System.out.println("A<C<B");
		}

		else if(b<c	&& c<a) {
			//Afficher B<C<A
			System.out.println("B<C<A");

		}

		else if(c<a && a<b) {
			//afficher C<A<B
			System.out.println("C<A<B");
		}

		else if(c<b && b<a) {
			//Afficher C<B<A
			System.out.println("C<A<B");

		}

	}


}






