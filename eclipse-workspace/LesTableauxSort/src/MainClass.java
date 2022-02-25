
import java.util.Scanner;
/*Exercice 2.7.1 : Calculer le nombre de jeunes
//Il s'agit de dénombrer toutes les personnes d'âge inférieur strictement à 20 ans parmi un échantillon de 20 
//personnes. L’utilisateur est invité à saisir les 20 valeurs.
//Décrivez l'algorithme qui affiche le nombre de jeunes et codez la solution.*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbJeunes = 0;
		int nbVieux = 0;
		int nbVingt =0;
		int[] tableau = new int[10];
		Scanner sc =new Scanner(System.in);
		System.out.println("Veuillez entrez 10 nombres");
		for (int compteur = 0; compteur < tableau.length; compteur++) 

		{System.out.println("veuillez entrer le nombre n°"+ (compteur+1) + " entre 0 et 120");
		tableau[compteur]=sc.nextInt();	


		//sc.nextInt() ;
		}

		String chaine = "";
		for (int element : tableau) {

			chaine+=element+"-";


		}

		String sousChaine=chaine.substring(0,chaine.length()-1);
		System.out.println(sousChaine);


		for (int i = 0; i < tableau.length; i++) {

			if (tableau[i]<20) 
			{
				nbJeunes++;
			}
			else if (tableau[i]==20)
			{	
				nbVingt++;
			}

			else {
				nbVieux++;

			}
		}

		if (nbVieux==20) {
			System.out.println("toutes les personnes ont plus de vingt ans");

		}
		else if (nbJeunes==20) {
			System.out.println("toutes les personnes sont jeunes");
		}
		else {
			System.out.println("il y'a " + nbJeunes + " personnes de - de 20 ans et "+nbVieux +" personnes de + de 20 ans et "+ nbVingt+" personnes qui ont 20 ans");
			System.out.println("il y a "+(nbJeunes+nbVingt)+" personnes de 20 ans et moins et il y a "+nbVieux+" personnes de plus de 20 ans");

		}



		//		if(nbVieux == tableau.length) {
		//			System.out.println("TOUTES LES PERSONNES ONT PLUS DE 20 ANS ");
		//		}
		//		else if(nbJeunes==tableau.length) {
		//			System.out.println("TOUTES LES PERSONNES ONT MOINS DE 20 ANS");
		//		}
		//		else if((nbVieux == 0)&&(nbJeunes == 0)) {
		//			System.out.println("TOUTES LES PERSONNES ONT 20 ANS");
		//		}
		//		else {
		//			System.out.println("il y'a " + nbJeunes + " personnes de - de 20 ans et "+nbVieux +" personnes de + de 20 ans et "+ nbVingt+" personnes qui ont 20 ans");
		//		}


		//Arrays.sort(tableau);
		sc.close();
	}
}
