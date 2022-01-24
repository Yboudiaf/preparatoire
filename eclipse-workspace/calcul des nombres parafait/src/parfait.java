import java.util.Scanner;

public class parfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre=1;
		int compteurDivieur ;
		int nombreParfaitActuel=0;
		int sommeDiviseur=0;
		int nombreParfaitRechercher=0;
		System.out.println("veuillez saisir un nombre");
		Scanner sc = new Scanner(System.in);
		nombreParfaitRechercher = sc.nextInt();

		while(nombreParfaitActuel !=nombreParfaitRechercher ) {
			
			sommeDiviseur=0; // ON REMET LE COMPTEUR DES DIVISEURS A ZERO
			
			for(compteurDivieur = 1;compteurDivieur < nombre; compteurDivieur++){
				if( nombre %  compteurDivieur  == 0) {
					sommeDiviseur += compteurDivieur ;
				}
			}
			if(sommeDiviseur == nombre) {
				System.out.println(nombre + " est un nombre parfait");
				
				nombreParfaitActuel++; // SI ON TROUVE UN PARFAIT ON AUGMENTE DE 1 LE NOMBRE DE PARFAIT TROUVE
			}
			nombre++;// ON AUGMENTE LE NOMBRE A TESTER POUR LA PROCHAINE BOUCLE
		}

	}

}









