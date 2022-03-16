package jalon;

import java.util.Scanner;

public class jalonFin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int utilisateur;
		int tropPetit = 5;
		int tropGrand = 10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre entre 5 et 10");
		utilisateur = sc.nextInt();
		if(utilisateur >= tropGrand ) {
			System.out.println("trop grand");
		}
		else if(utilisateur<=tropPetit) {
			System.out.println("trop petit");
		}
		else {
			System.out.println("ok");
		}
			
		
		sc.close();

	}

}
