import java.util.Scanner;

public class Taupe extends Animal
{
	public Taupe() {
	super("taupe");
	}
	public void manger() {
			super.manger();
			System.out.println("les legumes du potager");
	}
	public void patate() {
	Scanner sc = new Scanner(System.in);
	
	String patate;
	System.out.println("le taupe a faim voulez vous lui donner des patates a manger ?");
	patate = sc.nextLine();
	if(patate.equals("oui")) {
		System.out.println("merci miam miam");
	}else {
		System.out.println("Alors je vais vous détruire votre potager !!");
	}
}
}
