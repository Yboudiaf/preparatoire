
public class Chat extends Animal {
	
	private int ageATester =17;
	private String nom;
	
	public void setNom(String _nouveauNom) {
		
		nom = _nouveauNom;
	}
	
	public String getNom() {
		return nom; 
	}	
	
	public void setAge(int nouvelAge) {
		
		ageATester = nouvelAge; }
	
	
	public String majeurOuMineur(){
			
			if(ageATester <18) {
				
				return "vous êtes mineur";
			}
			else {
				
				return "vous etes majeur";
			}
			
		}

}
