package jeux02;

import java.util.Random;
import java.util.Scanner;

public class jeux20 {

	public static void main(String[] args) {
		
		
		int score = 10;
		int nombreAleatoire;
		int nombreIa ;
		int pointUtilisateur = 0;
		int pointIa=0;
		int nombreUtilisateur;
		Boolean nombreNegatif = false;
		
		 Random rand = new Random (3);		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			System.out.println("veuillez saisir une valeur de 0,1 ou 2");
			System.out.println("le score est de "+pointUtilisateur+" pour vous et de "+pointIa+" pour Ia");
			nombreAleatoire = rand.nextInt(3);
			nombreUtilisateur = sc.nextInt();
			
			nombreIa = rand.nextInt(3);
			System.out.println("Ia a choisie le nombre "+ nombreIa);
			System.out.println("le nombre aleatoire est de "+nombreAleatoire);
			
			if( nombreUtilisateur < 0 ) {
				 nombreNegatif = true;
				 System.out.println("match terminer");
				
			} 
			if(Math.abs(nombreAleatoire - nombreUtilisateur) ==2 ) {
				if (nombreUtilisateur > nombreIa) {
					pointUtilisateur ++;
				}	
			}	
			
			else if(Math.abs(nombreAleatoire - nombreUtilisateur) ==1) {
				if (nombreUtilisateur > nombreIa) {
					pointUtilisateur ++;
				}
				
				
			}
			else if(Math.abs(nombreAleatoire - nombreIa) ==2 ) {
				if (nombreIa > nombreUtilisateur) {
					pointIa ++;
				}					
		   }
			
			else if(Math.abs(nombreAleatoire - nombreIa) ==1 ) {
				if (nombreIa > nombreUtilisateur) {
					pointIa ++;
				}
				
				
			}
			else if(nombreAleatoire == nombreUtilisateur ) {
				if(nombreIa != nombreUtilisateur) {
					pointUtilisateur ++;
				}
				
			}
			else if(nombreAleatoire == nombreIa ) {
				if(nombreIa != nombreUtilisateur) {
					pointIa ++;
				}
				
			}
			else if((nombreAleatoire - nombreUtilisateur ==0) && (nombreAleatoire - nombreIa ==0)) {
				
				System.out.println("match nul");
			}
			
			
			
		}while((score != pointUtilisateur)&& (score != pointIa));
	 if (score == pointUtilisateur) {
		 System.out.println("vous avez gagner felicitation de "+pointUtilisateur+" à "+pointIa+"");
	 }
	 else if(score == pointIa) {
		 System.out.println("game over l'Ia a gagner "+pointIa+" à "+pointUtilisateur+"");
	 }sc.close();
		
		
	}//fin de main

}//fin de classse
