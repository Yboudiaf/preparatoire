package permutationDeVariable;

import java.util.Scanner;

public class lesBouclesDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String painCuit;
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("le pain est il cuit?oui/non");
			painCuit = sc.next();
		}while (!painCuit.equals("oui") && !painCuit.equals("non"));
			
		
	if(painCuit.equals("oui")) {
		System.out.println("le paim est cuit et bon vous pouvez mangez bonne degustation !!");
	}
		else {
			if(painCuit.equals("non")) {
				System.out.println("le paim n'est pas encore cuit patience !!");
		}
	}sc.close();
	}
		}
	


