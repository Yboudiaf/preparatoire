package jalon3;

import java.util.Scanner;

public class jalon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String motDePasse = "bonjour";
		int essais = 0;
		int finDessai = 3;
		String reponse;
		Scanner sc = new Scanner(System.in);
		

		do {System.out.println("veuillez indiquer votre mot de passe");

			motDePasse= sc.next();
			if (!motDePasse.equals("bonjour")) {
				System.out.println("Mdp incorrect");
			}
			essais ++;		

		}while((!motDePasse.equals("bonjour"))&&(essais<3)); 
			
			
			if(essais>=3) {
				System.out.println("echec de l'authentification");
				System.out.println("quelle la reponse secrete");
				reponse = sc.next();
				//si reponse est differente de formation; enleve les espaces;egalité parfaite de la chaine de charactere.   
				if(!reponse.toLowerCase().trim().equals("formation")) {

					System.out.println("compte bloque sauf si ta des sous");

				}
				else {
					System.out.println("vous ete connecte");
					
				}
			}
			else {
				System.out.println("vous êtes connecté");

			}
			sc.close();
		}
		
	}	 
	//parcourir le nombre d'essaie






