package jeuDuPendu;

import java.util.Scanner;

/*Exercice 3.6: Jeu du penduL'algorithme lit un mot propos� par un premier joueur.
Ce mot a une longueur minimum de 5 caract�res (� contr�ler).
L'algorithme affiche ensuite le mot o� toutes les lettres sauf la premi�re et la derni�re sont remplac�es par un tiret.
Un deuxi�me joueurpropose des lettres une � une.
Chaque fois que la lettre se trouve dans le mot, 
l'algorithme remplace les tirets qui rempla�aient cette lettre et r�affiche le mot. 
Le second joueur a droit � un maximum de 6 essais pour retrouver toutes les lettres.*/
public class Pendu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String mot5charactere;
		String trouver ;
		byte essaie=0;
		char tiret[];
		boolean gagner = false;
		int lettreMaximum=6;
		char lettre;
		
		do {
			System.out.println("veuillez saisir un mot de 5 charactere minimum");
		mot5charactere = sc.nextLine().toLowerCase();
		}while(mot5charactere.length()<5);
		
		
		tiret = mot5charactere.toCharArray();
		 for (int i = 1 ; i <= mot5charactere.length()-2;i++) {
			 tiret[i] = '-';
		 }
		System.out.println(String.copyValueOf(tiret));
		
		
		do {
			trouver=sc.nextLine().trim().toLowerCase();
		} while (!trouver.matches("^[a-z]$"));
		
		
		/*do {
			for(int i =1 ; i <= mot5charactere.length()-1;i++) {
				tiret[i]= mot5charactere.charAt(i);
				
				trouver = sc.next();
				if()
				if(trouver.equals([1])) {
					System.out.println(trouver);
				
					
				}else if(! trouver.equals(trouver)) {
					i++;
					
					
				}
				if(i==mot5charactere.length()) {
					
					System.out.println(i);
				}else {
					System.out.println(tiret);
				}
				essaie++;
				System.out.println(essaie);
			}
		}while(mot5charactere.length()<=mot5charactere.length()-1);*/
		
		
		
		
			}

	}


