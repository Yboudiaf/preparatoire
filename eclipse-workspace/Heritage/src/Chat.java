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
					System.out.println("salut mathieu  ");
				}
				else if(prenom.equals("véronique")){
					System.out.println("salut véronique ");
				}
				else if(prenom.equals("raphi")){
					System.out.println("salut raphi ");
				}
				else if(prenom.equals("anani")){
					System.out.println("salut ananis");
				}
				else if(prenom.equals("nico")){
					System.out.println("salut nico ");
				}
				else if(prenom.equals("gerard")){
					System.out.println("salut gerard ");
				}
				else if(prenom.equals("julian")){
					System.out.println("salut julian ");
				}
				else if(prenom.equals("willy")){
					System.out.println("salut willy ");
				}
				else if(prenom.equals("rody")){
					System.out.println("salut rody");
				}
			}
				
				return "vous etes majeur";
			
			
		}

}
