package permutationDeVariable;

import java.util.Scanner;

public class AnnéeBissextile {

	public static void main(String[] args) {
		//Variable
		int a;

		//saisie et traitement

		System.out.println("saisire l'année");
	
		Scanner sc= new Scanner(System.in);
			a = sc.nextInt();

		if(a % 4 == 0) {
			if((a % 100 == 0) && (a % 400 !=0)) {
			System.out.println("l'année n'est pas bissextile");
		}
		
		else{
					System.out.println("l'année est bissextile");					
			}
		
		}
			else {
				System.out.println("l'année n'est bissextile");
		}
	sc.close();
	}
	
}









