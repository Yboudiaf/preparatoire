import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// traduction du pseudo code en code java
		
		//DECLARATIONS DE VARIABLES
		//reel nombre1
		float nombre1;
		//reel nombre2
		float nombre2;
		//reel moyenne
		float moyenne;
		
		//SAISIE
		//ecrire "donnez moi svp le premier nombre:"
		System.out.println("donnez moi svp le premier nombre:");
		//lire "nombre1"
		Scanner sc = new Scanner(System.in);//cree un outil scanner
		nombre1 = sc.nextFloat();
		System.out.println("vous avez saisie nombre1="+nombre1);
		
		//ecrire "donnez moi svp le deuxieme nombre:"
		System.out.println("donnez moi svp le deuxieme nombre:");
		//lire "nombre2"	
		nombre2 = sc.nextFloat();
		System.out.println("vous avez saisie le nombre2="+nombre2);
		//System.out.println("vous avez saisie le nombre2="+nombre2);
		
		//TRAITEMENT
		//moyenne<--(nombre1+nombre2)/2
		 moyenne = (nombre1+nombre2)/2;
		 
		 //si (moyenne>=10) alors
	/*	if (moyenne >=10) {
			
		System.out.println("vous pouvez allez en cda");
			}
		 //
		 //sinon
		 else  
		 // moyenne <-- moyenne + 1
		 {
			  moyenne = moyenne+ 1;
			  System.out.println("vous allez en boulangerie");
			 //fin si  
		 }
	*/	
	     //si (moyenne<10) alors
		if (moyenne<10) {
			//moyenne <--moyenne + 1
			moyenne = moyenne + 1;
			//fin si
		}
		 
		//AFFICHAGE
		//ecrire"la valeur moyenne est :",moyenne
		 
		System.out.println("la moyenne des 2 nombre est " + moyenne);
		
		
		
	}

}
