import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir des nombres séparés par un espace");
		String saisieUtilisateur = sc.nextLine().trim();
		
		// -- ON RECUPERE LES NOMBRES
		String[] saisie = saisieUtilisateur.split(" ");
		int[] valeurs = new int[saisie.length];
		for (int i= 0; i < valeurs.length; i++) {
			valeurs[i] = Integer.valueOf(saisie[i]);
		}
		// ICI ON A RECUPERER EN ---------INT--------- TOUTES LES VALEUS
		int tmp;
		for (int i = 0; i < valeurs.length; i++) {
			for (int j = i; j< valeurs.length; j++) {
				if (valeurs[i] > valeurs[j]) {
					tmp = valeurs[i];
					valeurs[i] = valeurs[j];
					valeurs[j] = tmp;
					
				}
			}
		}
		for (int i : valeurs)
			System.out.println(i);
		sc.close();
	}

}
