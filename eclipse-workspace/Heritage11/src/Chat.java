
public class Chat extends Animal 
{
	
	public Chat() 
	{
		super("chat");
	}
	
	public void manger() 
	{
		super.manger();
		System.out.println("Le chat mange des croquettes !");
	}
}