package rechercherUneLettreDansUneChaineDeCharactere;

import java.util.Arrays;

/*Exercice 3.2 : Rechercher une lettre dans un chaine de caractères 
Soit une chaîne de caractères terminée par le caractère « . ». 
Donnez l'algorithme d'un programme qui compte le nombre d'occurrences d'une lettre donnée (« a » par exemple) 
dans cette chaîne.
Si la chaîne de caractères n'est composée que du caractère « . », le message « LA CHAINE EST VIDE » sera affiché.
Proposez un jeu d'essai prévoyant les 3 cas suivants :
▪ La phrase est vide
▪ La lettre n'est pas présente
▪ La lettre est présente plusieurs fois
 */
public class exercice32RechercheDeLettreDansUnTableaux {
	public static void parcourir(String [] tab1) {		
		for(int i = 0 ;i < tab1.length;i++) {		
			System.out.println(tab1[i]);

		}

	}
	
	public static void ordreCroissantArraysSort(String [] tableaux) {		
		for(int i = 0 ;i < tableaux.length;i++) {
			Arrays.sort(tableaux);
			System.out.println(tableaux[i]);

		}
		
		
		
	}
}


	




