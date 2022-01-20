package permutationDeVariable;

import java.util.Scanner;

public class nombreEntier {

	public static void main(String[] args) {

		int n ;
		int diviseur ;

		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("veuillez saissire un nombre entier autre que 0 ; 1 et 2");
			n = sc.nextInt();
		}
		while(n <= 2);
		System.out.println("Les diviseurs de " +n + " sont:");
		for(diviseur = 2; diviseur < n; diviseur++) {
			if (n % diviseur ==0) {
				System.out.println(diviseur);
			}
		}
	}

}







