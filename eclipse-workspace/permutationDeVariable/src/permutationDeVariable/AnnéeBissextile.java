package permutationDeVariable;

import java.util.Scanner;

public class Ann�eBissextile {

	public static void main(String[] args) {
		//Variable
		int a;

		//saisie et traitement

		System.out.println("saisire l'ann�e");
	
		Scanner sc= new Scanner(System.in);
			a = sc.nextInt();

		if(a % 4 == 0) {
			if((a % 100 == 0) && (a % 400 !=0)) {
			System.out.println("l'ann�e n'est pas bissextile");
		}
		
		else{
					System.out.println("l'ann�e est bissextile");					
			}
		
		}
			else {
				System.out.println("l'ann�e n'est bissextile");
		}
	sc.close();
	}
	
}









