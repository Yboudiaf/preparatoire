package permutationDeVariable;

import java.util.Scanner;

public class exo1 {

	public static void main(String[] args) {
	
						//DECLARATIONS DE VARIABLES
		
		//chaine de charactere
		String compris;
		
		//chaine de charactere
		String relire;
		
						//SAISIE ET TRAITEMENT
		
		
		
		//ecrire "faite une lecture attentive";
		System.out.println("faite une lecture attentive");
		
		// ecrire "avez vous compris?oui/non
		System.out.println("avez vous compris?oui/non");
		
		//outil scanner
		Scanner sc = new Scanner(System.in);
		
		//lire compris
		compris = sc.nextLine();
		
		//si (compris =="non")
		if(compris.equals("non")) 
		{
			//relire
			System.out.println("vous relirez");	
					 
		//ecrire avez vous compris cette fois ci?
		System.out.println("avez vous compris cette fois ci? oui/non");
		
		// lire relire
		relire = sc.next();
		
		//si formateur (=="non")alors
		if (relire.equals("non")) 
			
				// demander de laide au formateur
				System.out.println("demander de l'aide au formateur");					
		}	
		
		System.out.println("écrire le pseudo code");
		System.out.println("vérifier le pseudo code");
		System.out.println("ecrivez le programme");
		System.out.println("vérifier le programme");
		//fermeture du scanner
		sc.close();
	}
	
	}


	
	


