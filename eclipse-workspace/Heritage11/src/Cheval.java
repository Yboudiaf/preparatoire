import java.util.Scanner;

public class Cheval extends Animal 
{
	public Cheval() {
		super ("cheval");
	}
	public void manger() {
		super.manger();
		System.out.println("le cheval mange du foin");
	}
	public void souffler() {
		System.out.println("le cheval fait prrrrr");
	}Scanner sc = new Scanner(System.in);

		public void foin() {
			String foin;
			System.out.println("le cheval a faim voulez vous lui donner du foin a manger ?");
			foin = sc.nextLine();
			if(foin.equals("oui")) {
				System.out.println("merci prouuu prouu");
			}else {
				System.out.println("Alors vous monterer pas sur mon dos !!");
			}
		}
	}
