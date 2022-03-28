
public class Animal {


	private String espece;
	
	public Animal() 
	{
		
	}
	
	public Animal(String _espece) 
	{		
		this.setEspece(_espece);
	}
	

	public void manger() 
	{
		System.out.println("L'animal mange ");
	}
	
	public String getEspece() 
	{
		return this.espece.toUpperCase();
	}
	public void getMarcher() {
		System.out.println("et marche de 10 pas");
		return;
	}
	
	public void setEspece(String nouvelleEspece) 
	{
		this.espece = nouvelleEspece;
	}

	}
