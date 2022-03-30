package jeuDuPendu;

import java.util.Scanner;

/*Exercice 3.6: Jeu du penduL'algorithme lit un mot proposé par un premier joueur.
Ce mot a une longueur minimum de 5 caractères (à contrôler).
L'algorithme affiche ensuite le mot où toutes les lettres sauf la première et la dernière sont remplacées par un tiret.
Un deuxième joueurpropose des lettres une à une.
Chaque fois que la lettre se trouve dans le mot, 
l'algorithme remplace les tirets qui remplaçaient cette lettre et réaffiche le mot. 
Le second joueur a droit à un maximum de 6 essais pour retrouver toutes les lettres.*/
public class Pendu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String mot5charactere;
		String trouver ;
		byte essaie;
		char tiret[];
		boolean gagner = false;
		int lettreMaximum=6;
		
		
		do {
			System.out.println("veuillez saisir un mot de 5 charactere minimum");
		mot5charactere=sc.nextLine();
		}while(mot5charactere.length()<5);
		
		 tiret = mot5charactere.toCharArray();
		
		do {
			for(int i =1;i < mot5charactere.length()-1;i++) {
				tiret[i]= "-";
				
				if(i==mot5charactere.length()) {
					
					System.out.println(mot5charactere);
				}else {
					System.out.println(tiret);
				}
			}
			
		}while(mot5charactere.length()<=mot5charactere.length()-1);
		
		
		
		
			}

	}


