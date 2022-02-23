import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbJeunes = 0;
		int[] tableau = new int[20];
		Scanner sc =new Scanner(System.in);
		System.out.println("Veuillez entrez 20 nombres");
		for (int compteur = 0; compteur < tableau.length; compteur++) {
			tableau[compteur] = sc.nextInt();
			if (tableau[compteur] < 20) {
				nbJeunes++;
			}
		}
		System.out.println("il y'a " + nbJeunes + " personnes de - de 20 ans");
		Arrays.sort(tableau);
		sc.close();
	}

}
