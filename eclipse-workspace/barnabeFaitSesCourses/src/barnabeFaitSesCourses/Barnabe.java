package barnabeFaitSesCourses;
import java.util.*;
public class Barnabe {

	public static void main(String[] args) {

		float sommeDiviseur;
		float sommeDepart ;
		int nbMagasins = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("veuillez indiquer la somme de départ de barnabé");
		sommeDepart = sc.nextFloat();
		sommeDiviseur = sommeDepart;
		do {
			
			
			sommeDiviseur = sommeDiviseur /2;
			sommeDiviseur --;
			nbMagasins++;
			System.out.println("Il reste "+sommeDiviseur+"€ a Barnabé après ses achats dans le " + nbMagasins + " magasin");
			
		}while(sommeDiviseur > 2 );
		System.out.println("barnabé a fait "+ nbMagasins+" magasins");
		
		
	
		sc.close();
			
		
		
		
	}//fin de mai	

}//fin de classe
