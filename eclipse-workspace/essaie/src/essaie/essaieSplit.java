package essaie;

public class essaieSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase;
		String [] monTableau;
		
		phrase ="mais où et donc or ni car" ;
		monTableau = phrase.split(" ");
		 
		System.out.println(phrase);
		
		for(int i = 0; i < monTableau.length; i++ ) {
			System.out.print(monTableau[i]);
			
			if(i < monTableau.length) {
				System.out.print(" ");
			}
		}
		
	}

}
