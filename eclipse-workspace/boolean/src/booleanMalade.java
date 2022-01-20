import java.util.Scanner;

public class booleanMalade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean aDejaEteMalade = false;
		float temp;
		Scanner sc = new Scanner(System.in);

		for(int i = 0 ; i < 10 ; i ++) {
			System.out.println("saissisez votre temperature");
			temp = sc.nextFloat();

			boolean macondition =(temp >36.4 )&&(temp < 37.6);
			if(macondition == true) {
				System.out.println("vous n'ete pas malade");
			}
			else {
				System.out.println("vous etes malade et peur etre covider merci de decaler de 2 metre ");
			}
		}
	}
}


