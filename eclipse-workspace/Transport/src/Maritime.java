import java.util.Scanner;

public class Maritime extends Transport {
	
	protected void roue() {
		
		Scanner sc = new Scanner(System.in);
		String utilisateur ;
		System.out.println("Je suis un yatch (__@@@@@@__)");
		System.out.println("Voulez vous monter?");
		utilisateur = sc.next();
	if(utilisateur.equals("oui")) {
		System.out.println("Prennez place !! oups êtes vous majeur ?");
		utilisateur = sc.next();
		if(utilisateur.equals("oui")) {
			
			System.out.println("Alors allons faire 2 ou 3 trous en essayant mes nouveaux missiles  (-__-)");
		}else {
			System.out.println("dommage  u_u");
		}
	}else {
		System.out.println("Peut être une prochaine fois");
	}
	}
}
