package barnabeFaitSesCourses;
import java.util.*;
public class Barnabe {

	public static void main(String[] args) {

		float sommeDiviseur;
		float sommeDepart ;
		int nbMagasins = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("veuillez indiquer la somme de d�part de barnab�");
		sommeDepart = sc.nextFloat();
		sommeDiviseur = sommeDepart;
		do {
			
			
			sommeDiviseur = sommeDiviseur /2;
			sommeDiviseur --;
			nbMagasins++;
			System.out.println("Il reste "+sommeDiviseur+"� a Barnab� apr�s ses achats dans le " + nbMagasins + " magasin");
			
		}while(sommeDiviseur > 2 );
		System.out.println("barnab� a fait "+ nbMagasins+" magasins");
		
		
	
		sc.close();
			
		
		
		
	}//fin de mai	

}//fin de classe
