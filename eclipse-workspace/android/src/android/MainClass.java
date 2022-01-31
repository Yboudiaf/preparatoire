package android;

public class MainClass {

	public static void main(String[] args) {  // procedure:ne renvpoie rien (void=rien);
		// TODO Auto-generated method stub
		Robot nono = new Robot();
		if (nono.demarer()) {
			System.out.println("nono a bien démarrer");
		}
		if (nono.demarer()) {
			System.out.println("nono ne peux pas demarrer il est deja en marche");
		}
	}

}
