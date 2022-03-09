package rechercherUneLettreDansUneChaineDeCharactere;

import java.util.Scanner;

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
public class trouverUneLettreDansUnEChaineDeCharactere {

	public static void main(String[] args) {

		String [] tab = {"SuQi","btissam","yacine","rodolf"};
		String saisieUtilisateur ;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("veuillez saisir un caractere");
			
			saisieUtilisateur= sc.nextLine();
		} while (saisieUtilisateur.length() != 1);
		String saisieAComparer;
		int i, j;
		i = 0;
		boolean finded = false;
		/*
		saisieUtilisateur.trim().toLowerCase().split(" ");

		if( saisieUtilisateur.equals(tab[i])) {
			System.out.println("ici "+saisieUtilisateur);
		}else
		{
			System.out.println("votre lettre rechercher n'est pas dans le tableaux");

		}*/
		while (!finded && i<tab.length) {
			saisieAComparer = tab[i];
			j=0;
			while(!finded && j < saisieAComparer.length()) {
				char temporaire = saisieAComparer.charAt(j);
				if (temporaire == saisieUtilisateur.charAt(0)) {
					finded = true;
				}
				j++;
			}
			i++;
			
		}
		System.out.println((finded ? "Trouvé" : "Non trouvé"));

	}
	
	

}
