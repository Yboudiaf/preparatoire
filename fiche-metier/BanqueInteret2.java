import java.util.Scanner;

public class BanqueInteret2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARATIONS DE VARIABLES
		
		
		//reel interets
		float interets;
		//reel interets
		double interetc;
		//reel interetc
		//reel somme
		float somme;
		//reel interet
		float interet;
		//reel annee
		int nombreAnnee;
		//scanner
		Scanner sc = new Scanner(System.in);
		
		//SAISIE
		
		//ecrire la somme
		System.out.println("veuillez indiquer la somme:");
		somme = sc.nextFloat();
		//ecrire les interets
		System.out.println("veuillez indiquer l'interet:");
		interet = sc.nextFloat();
		//ecrire le nombre d'annee
		System.out.println("veuillez indiquer le nombre d'année:");
		nombreAnnee = sc.nextInt();
		
		
		
		//TRAITEMENT
		
		interets = somme*(1+nombreAnnee*interet);
		interetc = somme*Math.pow((1+interet),nombreAnnee);
		
		//AFFICHAGE
		
		//ecrire la valeur aquise par la somme avec interet simple est 
		System.out.println("la valeur aquise pa la somme avec interet simple est:"+interets);
		System.out.println("la valeur aquise par la somme avec interet composé est:"+interetc);
				
				//
		sc.close();

	}

}
