
public class Chien extends Animal{

	public Chien() {
		super("chien");
	}

	public void manger() {
		super.manger();
		System.out.println("l'Animal mange du path�");
		
	}
	public void aboyer() 
	{
		System.out.println("L'animal aboie ! ");
	}
}

