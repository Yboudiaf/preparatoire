import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Loup extends Animal 
{
	public Loup() {
		super ("loup");
	}	
	public void manger() {
		super.manger();
		System.out.println("des brebis égarées");
	}
	public void hurler() {
		System.out.println("et hurle à la pleine lune ");
	}
	public void brebis() {
		Scanner sc = new Scanner(System.in);

		String brebis;
		System.out.println("le loup blanc a faim voulez vous lui donner une brebis a manger ?");
		brebis = sc.nextLine();
		if(brebis.equals("oui")) {
			System.out.println("merci aouhhh aouhhh");
		}else {
			System.out.println("Alors je vais vous mangez !!");
		}
	}
}
