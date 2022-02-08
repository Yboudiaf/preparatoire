import java.util.Scanner;

public class parfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int compteurDuNouveauNombreRechercher=1;
		int compteurDivieur ;
		int nombreParfaitActuel=0;
		int sommeDiviseur=0;
		int nombreParfaitRechercher=0;
		System.out.println("veuillez saisir un nombre");
		Scanner sc = new Scanner(System.in);
		nombreParfaitRechercher = sc.nextInt();

		while(nombreParfaitActuel !=nombreParfaitRechercher ) {
			sommeDiviseur=0; // ON REMET LE COMPTEUR DES DIVISEURS A ZERO
			
			
			for(compteurDivieur = 1;compteurDivieur < compteurDuNouveauNombreRechercher; compteurDivieur++){
				if( compteurDuNouveauNombreRechercher %  compteurDivieur  == 0) {
					sommeDiviseur += compteurDivieur ;
				}
			}
			if(sommeDiviseur == compteurDuNouveauNombreRechercher) {
				System.out.println( compteurDuNouveauNombreRechercher+ " est un nombre parfait");
				
				nombreParfaitActuel++; // SI ON TROUVE UN NOMBRE PARFAIT ON AUGMENTE DE 1 LE NOMBRE DE PARFAIT TROUVE
				
			}
			
			
			compteurDuNouveauNombreRechercher++;// ON AUGMENTE LE NOMBRE A TESTER POUR LA PROCHAINE BOUCLE
			
		}sc.close();

	}//fin de main

}// fin de classe









