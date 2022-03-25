
public class Chat extends Animal {	
	
	public Chat() {
		super("chat");
	}
	
	public void manger() {
		super.manger();
		System.out.println("Le chat mange des croquettes !");
	}
	public void miauler() {
		System.out.println("le chat miaule miaouh miahou");
	}
	public void getMarcher() {
		super.getMarcher();
	}
}