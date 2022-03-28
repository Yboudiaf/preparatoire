import java.util.Scanner;

public class Chat extends Animal {	
	
	public Chat() {
		super("chat");
	}
	
	public void manger() {
		super.manger();
		System.out.println("des croquettes !");
	}
	public void miauler() {
		System.out.println("et miaule miaouh miahou");
	}
	public void getMarcher() {
		super.getMarcher();
	}public void croquette() {
		Scanner sc = new Scanner(System.in);

		String croquette;
		System.out.println("le chat garfield a faim voulez vous lui donner des croquettes a manger ?");
		croquette = sc.nextLine();
		if(croquette.equals("oui")) {
			System.out.println("merci miam miam");
		}else {
			System.out.println("Alors je vais vous griffer !!");
		}
	}
}