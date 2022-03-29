import java.util.Scanner;

public class Terrestre extends Transport{
	protected void roue() {
		Scanner sc = new Scanner(System.in);
		String utilisateur ;
		
		System.out.println("Je suis un char d'assault (_)==(_)");
		System.out.println("voulez vous monter?");
			utilisateur = sc.next();
		if(utilisateur.equals("oui")) {
			System.out.println("prennez place !! oups êtes vous majeur ?");
			utilisateur = sc.next();
			if(utilisateur.equals("oui")) {
				
				System.out.println("allons faire 2 ou 3 toue en essayant mon nouveau canon (-__-)");
			}else {
				System.out.println("dommage essayez donc la balade en avion u_u");
			}
		}else {
			System.out.println("peut être une prochaine fois allez sonc faire un tour en avion");
		}
	}
}
