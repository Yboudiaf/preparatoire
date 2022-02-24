
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
		int nbVingt=20;
		int[] tableau = new int[20];
		Scanner sc =new Scanner(System.in);
		System.out.println("Veuillez entrez 20 nombres");
		for (int compteur = 0; compteur < tableau.length; compteur++) {
			tableau[compteur] = sc.nextInt();
		 if(tableau[compteur] < 20) {
				nbJeunes++;
			}else if(tableau[compteur] > 20){
				nbVieux++;
			}
		}
		
		if(nbVieux == tableau.length) {
			System.out.println("TOUTES LES PERSONNES ONT PLUS DE 20 ANS ");
		}
		else if(nbJeunes==tableau.length) {
			System.out.println("TOUTES LES PERSONNES ONT MOINS DE 20 ANS");
		}
		else if((nbVieux == 0)&&(nbJeunes == 0)) {
			System.out.println("TOUTES LES PERSONNES ONT 20 ANS");
		}
		else {
			System.out.println("il y'a " + nbJeunes + " personnes de - de 20 ans et "+nbVieux+" personnes de + de 20 ans");
		}
		
		
		//Arrays.sort(tableau);
		sc.close();
	}

}
