package permutationDeVariable;

import java.util.Scanner;

public class Exojava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION DE VARIABLE

		String siIlFaitBeau;
		String etatBicyclette;
		String reparationImmediat;
		String livreBovary;
		String livreDisponible;


		//SAISIE TRAITEMENT
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Est-ce qu'il fait beau demain?oui/non");
			//Ecrire "Est-ce qu'il fait beau demain?oui/non"
			//outil scanner
			//lire silFaitBeau
			siIlFaitBeau = sc.next();
		}
		while(!siIlFaitBeau.equals("oui")&&!siIlFaitBeau.equals("non"));


		//(siIlFaitBeau =="oui")
		if(siIlFaitBeau.equals ("oui")){


			//Ecrire"J'irais me balader en bicyclette"
			System.out.println("J'irais me balader en bicyclette");


			do {
				//Ecrire "La bicyclette est-elle en bonne �tat?oui/non"
				System.out.println("La bicyclette est-elle en bonne �tat?oui/non");				
				//lire etatBicyclette
				etatBicyclette = sc.next();
			}
			while(!etatBicyclette.equals("oui")&&!etatBicyclette.equals("non"));

			//(Si etatBicyclette ==("oui"))
			if(etatBicyclette.equals("oui")) {

				//Ecrire "j'irais me balader en bicyclette"
				System.out.println("j'irais me balader en bicyclette");

			}
			else
			{

				//Ecrire "j'irais au garagiste"
				System.out.println("j'irais au garagiste");

				do {
					//Ecrire "Les r�parations sont-elle imm�diates?oui/non"
					System.out.println("Les r�parations sont-elle imm�diates?oui/non");

					//lire reparationImmediat
					reparationImmediat = sc.next();
				}
				while(!reparationImmediat.equals("oui")&&!reparationImmediat.equals("non"));

				//si(reparationImmediat ==(oui)alors
				if(reparationImmediat.equals("oui")) {

					//Ecrire"j'irais ceuillir des joncs"
					System.out.println("j'irais me balader � bicyclette");
				}

				else
				{
					//Ecrire "j'irais me balader � bicyclette"
					System.out.println("j'irais ceuillir des joncs");
				}

			}
		}
		else
		{

			//Ecrire "Journ�e lecture"
			System.out.println("Journ�e lecture");
			do {
				//Ecrire "le livre de Mme BOVARY est-il dans ma biblioth�que?oui/non"
				System.out.println("le livre de Mme BOVARY est-il dans ma biblioth�que?oui/non");

				//Lire livreBovary

				livreBovary = sc.next();
			}
			while(!livreBovary.equals("oui")&&!livreBovary.equals("non"));
			//Si (livreBovary <=="oui")alors
			if(livreBovary.equals("oui")) {

				//Ecrire"prendre le livre dans la biblioth�que du salon"
				System.out.println("prendre le livre dans la biblioth�que du salon");
				//Ecrire s'installer sur le fauteuil"
				System.out.println(" s'installer sur le fauteuil");
			}


			//sinon
			else {

				//Ecrire "j'irais � la biblioth�que municipal"
				System.out.println("j'irais � la biblioth�que municipal");
				do {
					//Ecrire "le livre est-il disponible?oui/non"
					System.out.println("le livre est-il disponible?oui/non");

					//Lire livreDisponible
					livreDisponible = sc.next();
				}
				while(!livreDisponible.equals("oui")&&!livreDisponible.equals("non"));
				//si(livreDisponible<=="oui")alors
				if(livreDisponible.equals("oui")) {

					//Ecrire"lire le livre de Mme BOVARY"
					System.out.println("lire le livre de Mme BOVARY");
					//Ecrire"s'il ne fait pas beau je m'instalerai confortablement dans un fauteuil et je me plongerai dans la lecture"
					System.out.println("s'il ne fait pas beau je m'instalerai confortablement dans un fauteuil et je me plongerai dans la lecture");
				}


				else {

					//Ecrire" j'emprunterai un bouquin policier"
					System.out.println("j'emprunterai un bouquin policier");
					//Ecrire" je m'instalerai confortablement dans un fauteuil et je me plongerai dans la lecture"
					System.out.println(" je m'installerai confortablement dans un fauteuil et je me plongerai dans la lecture");
				}
			}
		}
		sc.close();
	}

}
