import java.util.Random;
import java.util.Scanner;

public class fourchette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre;
		Random aleatoire = new Random ();

		System.out.println("veuillez saisir un nombre pour deviner le nombre aléatoire");
		Scanner sc = new Scanner(System.in); 
		nombre = sc.nextInt();

		aleatoire.nextInt(100);

		if(nombre < 50  ||  nombre >50) {
			System.out.println("vous êtes froid");
		}
		else if(nombre < 25 || nombre >25) {
			System.out.println("vous êtes tiéde");

		}
		else if(nombre < 15 || nombre >15) {
			System.out.println("vous êtes brulant");
		}
		else (nombre = Random) {
			System.out.println("félicitation "+nombre+" est le bon nombre");

			//}





		}

	}
}