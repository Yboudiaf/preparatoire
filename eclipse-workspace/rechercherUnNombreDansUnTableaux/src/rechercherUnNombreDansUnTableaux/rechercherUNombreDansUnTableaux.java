package rechercherUnNombreDansUnTableaux;

import java.util.Iterator;
import java.util.Scanner;

/*
Exercice 3.1 : Rechercher un nombre dans un tableau 
Soit un tableau de nombres tri�s par ordre croissant.
Chercher si un nombre donn� N figure parmi les �l�ments. 
Si oui, indiquer la valeur de l'indice correspondant. Sinon, indiquer � Non trouv� �
 */
public class rechercherUNombreDansUnTableaux {

	public static void main(String[] args) {
		int nbUtilisateur=0;
		//creation de tableaux
		int [] tableaux = new int [10];

		Scanner sc = new Scanner(System.in);

		System.out.println("veuillez entrer 10 nombres");
		//lire les donn�es du tableau
		for(int compteur = 0;compteur < tableaux.length;compteur++) {
			//recuperation des valeur une ou plusieurs valeurs
			tableaux[compteur]=sc.nextInt();

		}
		//ecrit les donn�es selon (if)
		for (int i = 0; i < tableaux.length; i++) {
			if(tableaux[i]==20) {
				System.out.println(i);
			}
		}







	}



}


