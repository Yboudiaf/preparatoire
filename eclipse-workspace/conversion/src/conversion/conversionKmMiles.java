package conversion;

import java.util.Scanner;

public class conversionKmMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nombre;	
		int km = 1000000;
		double miles =1.609 ;
		String q = null ;
		long horslimite= 1000001;
		// (km < 0.01 || km > 1000000)
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir une valeur en km");
		nombre =sc.nextInt();
		System.out.print("La valeur de " + nombre + " en km est: ");
	    miles = nombre/1.609;
		System.out.print(miles + " miles");
		boolean macondition =(horslimite < km);
		if(macondition == true) {
			System.out.println(" la saisie est: hors limite" );	
			
				
			}
		else if(q.equals("q")){
			
			System.out.println("programme terminer");
			
		}sc.close();
		}
		
	}
	


