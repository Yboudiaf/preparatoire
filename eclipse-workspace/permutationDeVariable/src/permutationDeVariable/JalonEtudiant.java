package permutationDeVariable;

import java.util.Scanner;

public class JalonEtudiant {

	public static void main(String[] args) {


		String etudiant ;
		String jeudi ;
		String mercredi ;		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("est ce que la personne est etudiant?");
		etudiant = sc.next();
		if (etudiant.equals("oui")) {
			System.out.println("Est-on jeudi?");
			jeudi = sc.next();
			if(jeudi.equals("oui")){
				System.out.println("vous avez lz droit à une réduction 20%");
			} else {
				System.out.println("Est-on mercredi?");
				mercredi = sc.next();
				
				if(mercredi.equals("oui")) {
					System.out.println("vous avez lz droit à une réduction 50%");				
				} else {
					System.out.println("Vous n'avez pas droit à une réduction aujourd'hui");
					
				}
							
			}
		} else {
			System.out.println("Seul les étudiants ont droit à des réductions");
		}
		sc.close();

	}

}















