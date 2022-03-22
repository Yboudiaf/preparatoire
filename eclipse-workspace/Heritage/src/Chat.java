import java.util.Scanner;

public class Chat extends Animal {
	
	private int ageATester;
	private String nom;
	
	public void setNom(String nouveauNom) {
		
		nom = nouveauNom;
	}
	
	public String getNom() {
		return nom; 
	}	
	
	public void setAge(int nouvelAge) {
		
		ageATester = nouvelAge; }
	
	
	public String majeurOuMineur(){
			String prenom="yacine";
			Scanner sc = new Scanner(System.in);
			if(ageATester <18) {
				
				return "vous êtes mineur";
			}
			else if(ageATester >= 20){
				
				System.out.println("quelle est votre nom?");
				prenom = sc.nextLine();
				if(prenom.equals("yacine")){
					System.out.println("vous êtes un chat d'une valeur innestimable");
				}
				else if(prenom.equals("mathieu")){
					System.out.println("salut mathieu tu peux rentrer passe par deriere ");
				}
				else if(prenom.equals("véronique")){
					System.out.println("salut véronique soirée entre mec pas possible désoler");
				}
				else if(prenom.equals("raphi")){
					System.out.println("salut raphi courage c'est presque l'heure");
				}
				else if(prenom.equals("anani")){
					System.out.println("salut ananis tu peux rentrer mais que si tu as mis ton chapeau^^");
				}
				else if(prenom.equals("nico")){
					System.out.println("salut nico tu peux rentrer enleve ton cask");
				}
				else if(prenom.equals("gerard")){
					System.out.println("salut gerard tu peux rentrer si tu enleve ta barbe");
				}
				else if(prenom.equals("julian")){
					System.out.println("salut julian pose ton telephone stp merci u_u");
				}
				else if(prenom.equals("willy")){
					System.out.println("salut willy l'ourson tu peux rentrer mais tu dors pas ^^");
				}
				else if(prenom.equals("modulo")){
					System.out.println("salut modulos tu peux rentrer tes VIP");
				}
			}
				
				return "vous etes majeur";
			
			
		}

}
