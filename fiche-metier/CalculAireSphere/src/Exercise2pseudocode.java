import java.util.Scanner;

public class Exercise2pseudocode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARATIONS DE VARIABLES
		
		float rayon;
		//reel rayon
		double aire;
		//REEL aire
		double volume;
		//reel volume
		
		//saisie
		
		//ecrire "veuillez indiquer le rayon de la sph�re"
		System.out.println("veuillez indiquer le rayon de la sph�re:");
		//lire "rayon"
		Scanner sc = new Scanner(System.in);//cree un outil scanner
		rayon = sc.nextFloat();
		System.out.println("le rayon de la sph�re est:"+rayon);
		
		//ecrire"veuillez indiquer l'aire de la sph�re"
		System.out.println("veuillez indiquer l'air de la sph�re:");
		//lire "aire"
		aire = sc.nextDouble();
		System.out.println("l'aire de la sph�re est:"+aire);
		
		//traitement
		
		//moyenne<--(aire+volume)
		aire = 4*Math.PI*Math.pow(rayon,2); 
		volume = 4/3*Math.PI*Math.pow(rayon,3)/3;
		
		//affichage
		
		//ecrire"la sphere � pour aire",4pi r�"
		//ecrire"la sph�re � pour volume"4/3 pi r
		System.out.println("la sph�re � pour aire="+aire);
		System.out.println("la sph�re � pour volume="+volume);
		
		
		

	}

}
