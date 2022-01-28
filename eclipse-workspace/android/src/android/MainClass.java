package android;

public class MainClass {

	public static void main(String[] args) {
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
