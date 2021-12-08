package javaexe5;

import java.util.Scanner;

public class Javaexe5banque2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARATIONS DE VARIABLES
		
		//reel a
		float a;
		//reel b
		float b;
		//reel c
		float c;
		
		Scanner sc = new Scanner(System.in);
		
		
		//SAISIE
		
		//ecrire a
		System.out.println("donnez moi la valeur de a");
		a = sc.nextFloat();
		//ecrire b
		System.out.println("donnez moi la valeur de b");
		b = sc.nextFloat();
		
		//TRAITEMENT

		c = a;
		a = b;
		b = c;	
		
		// AFFICHAGE
		
		//ecrire la valeur de a 
		System.out.println("La valeur de a est " + a);
		// ecrire la valeur de b 
		System.out.println("La valeur de b est "+ b);

	}

}
