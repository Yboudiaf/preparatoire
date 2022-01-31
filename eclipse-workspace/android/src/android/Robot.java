package android;

public class Robot {
	
	private String numeroDeSerie;
	private boolean enMarche;
	private String typeDeDeplacement;
	private boolean aDesBras;
	private float positionX;
	private float positionY;
	private float positionZ;
	
	public Robot() {
		numeroDeSerie="0";
		enMarche=false;
		typeDeDeplacement="DeplacementPied";
		aDesBras=true;
		positionX=0;
		positionY=0;
		positionZ=0;
	}
	
	public boolean demarer() {    //fonction: il renvoie un boolean, ici true;
		if (enMarche) {
			enMarche = true;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean arreter() {
		if (enMarche) {
			enMarche = false;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean seDeplacer(float positionX, float positionY) {
		return true;
	}
	
	public boolean sauter(float hauteur) {
		return true;
	}
	
	public boolean attraperUnObjet(Object objetAAttraper) {
		return true;
		
	}

	public static void main(String[] args) {
		
		

	}

}
