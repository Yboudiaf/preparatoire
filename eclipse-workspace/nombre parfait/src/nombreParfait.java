import java.util.Scanner;

public class nombreParfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n;
		int diviseur =2;
		Scanner sc = new Scanner(System.in);

		System.out.println("veuillez entrer un nombre");
		n = sc.nextInt();

		while(n % diviseur != 0 && diviseur < n) {
			diviseur++;
		}
		if(n == diviseur) {
			System.out.println("le nombre est premier ");
		}
		else {

			System.out.println("le nombre n'est pas premier");
		}sc.close();
	}
}











