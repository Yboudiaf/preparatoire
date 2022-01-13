package permutationDeVariable;

import java.util.Scanner;

public class boucleIlfaitbeau {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String reponse;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("il fait beau?oui/non");
			reponse = sc.next();
		}	
			while(!reponse.equals("oui") && !reponse.equals("non"));
		
		if(reponse == "oui") {
			System.out.println("il fait beau!");
			
		}else {
			if(reponse == "non") {
				System.out.println("il fait pas beau!");
			}
		}
				
		
	}

}
