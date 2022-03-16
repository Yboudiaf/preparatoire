package jalon2;

import java.util.Scanner;

public class jalon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez indiquer un nombre");
		nombre =sc.nextInt();
		
		for(int i=0; i<=10;i++) {
			System.out.println(nombre+i);
		
	}
		//do {

		//	nombre++;
	//		System.out.println(nombre);


	//	}while(nombre <=nombreDix);

			sc.close();
	}

}
