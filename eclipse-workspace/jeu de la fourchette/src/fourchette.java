import java.util.*;


public class fourchette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre=0;
		int nombreAleatoir;
		int borneSupp = 100;
		int borneInf = 0;
		int essais = 0;
		boolean trouve = false;
		

		Random rand = new Random ();
		Scanner sc = new Scanner(System.in); 
		
		
		nombreAleatoir = rand.nextInt(101);
	
		 do {
			 System.out.println("veuillez saisir un nombre entre "+borneInf+" et "+borneSupp);
			 nombre = sc.nextInt();	
			// System.out.println(essais++);
		 
			 if (nombre > nombreAleatoir){
				 borneSupp = nombre;
				// System.out.println("félicitation "+nombre+" est le bon nombre");

				 
			 } 
			 else if(nombre < nombreAleatoir){
				 borneInf = nombre;
				 	 
				// System.out.println("votre fourchette est de " + nombre+ " à 100");
			 }
			 else { 
				 
				 System.out.println("bravo vous avez trouvé le nombre recherché c'est bien "+nombre);
				 System.out.println("avec " +essais+ " essais");
				 trouve = true;
				
			 	
			 }
			 essais++;
		 }
			  while(trouve == false);
			
			System.out.println("jeux terminé");
			
		 
		
		sc.close();

	}//fin de main
}//fin de classe