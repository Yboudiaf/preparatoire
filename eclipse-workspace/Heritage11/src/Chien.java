import java.util.Scanner;

public class Chien extends Animal{
	
	public Chien() {
		super("chien");
	}

	public void manger() {
		super.manger();
		System.out.println("du pathé");		
	}
	public void aboyer() {
		
		System.out.println("et aboie !");	
		
	}
	public void marcher() {
		this.marcher();
	}
	public void pathe() {
		Scanner sc = new Scanner(System.in);

		String pathe;
		System.out.println("le chien tina a faim voulez vous lui donner du pathe a manger ?");
		pathe = sc.nextLine();
		if(pathe.equals("oui")) {
			System.out.println("merci ouaf ouaf");
		}else {
			System.out.println("Alors je vais vous mordre !!");
		}
	}

}

