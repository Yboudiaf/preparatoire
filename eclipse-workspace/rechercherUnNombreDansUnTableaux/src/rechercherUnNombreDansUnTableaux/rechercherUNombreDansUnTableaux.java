package rechercherUnNombreDansUnTableaux;

import java.util.Iterator;
import java.util.Scanner;

/*
Exercice 3.1 : Rechercher un nombre dans un tableau 
Soit un tableau de nombres triés par ordre croissant.
Chercher si un nombre donné N figure parmi les éléments. 
Si oui, indiquer la valeur de l'indice correspondant. Sinon, indiquer « Non trouvé »
 */
public class rechercherUNombreDansUnTableaux {

	public static void main(String[] args) {
		int nbUtilisateur=0;
		//creation de tableaux
		int [] tableaux = new int [10];

		Scanner sc = new Scanner(System.in);

		System.out.println("veuillez entrer 10 nombres");
		//lire les données du tableau
		for(int compteur = 0;compteur < tableaux.length;compteur++) {
			//recuperation des valeur une ou plusieurs valeurs
			tableaux[compteur]=sc.nextInt();

		}
		//ecrit les données selon (if)
		for (int i = 0; i < tableaux.length; i++) {
			if(tableaux[i]==20) {
				System.out.println(i);
			}
		}







	}



}


