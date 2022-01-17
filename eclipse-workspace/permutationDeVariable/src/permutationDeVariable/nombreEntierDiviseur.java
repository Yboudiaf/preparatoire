package permutationDeVariable;

import java.util.Scanner;

public class nombreEntierDiviseur {

	public static void main(String[] args) {


		int n ;

		System.out.println("veuillez saisir un nombre entier");
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		if(n < 0 ) {
			n = -n;
			
		}
		System.out.println("La valeur absolue est "+ n);

		
	}
		
}