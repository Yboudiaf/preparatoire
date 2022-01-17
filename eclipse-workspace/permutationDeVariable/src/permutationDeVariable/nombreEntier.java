package permutationDeVariable;

import java.util.Scanner;

public class nombreEntier {

	public static void main(String[] args) {
		
		int a ;
	    int diviseur ;
		
		System.out.println("veuillez saissire un nombre entier autre que 2 et 1");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a == 2 || a==1 ) {
			do {
				System.out.println("veuillez saissire un nombre entier autre que 2 et 1");
				a = sc.nextInt();
			}
			while(a == 1|| a == 2);
		}
		else {
			
			for(diviseur = 2; diviseur < a; diviseur%=0) {
			
					// JE TESTE SI LES NOMBRES SON DIVISIBLE SI OUI JE L'INDIQUE
					System.out.println("les nombres diviseur sont paire"+ diviseur);
			}
		}
		
		
		
		
		
		

	}

}
