package fonctions;

public class fonctionsEtMethodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ageATester =17;	
		
		String resultat = majeurOuMineur(ageATester);
		System.out.println(resultat);
		
	}//fin de main
	
	public static String majeurOuMineur(int ageTester){
		
		if(ageTester <18) {
			
			return "vous êtes mineur";
		}
		else {
			
			return "vous etes majeur";
		}
		
	}
	
	
	
	
	
}//fin de classe


