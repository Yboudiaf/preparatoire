package retraite;

import java.util.Scanner;

public class diferentRetraiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("veuillez saisire un age");
		int ageAtester ;
		Scanner sc = new Scanner(System.in);
		ageAtester = sc.nextInt();
		 System.out.println(getRetired(ageAtester));
		
		
	}//fin de main

	public static String getRetired(int age) {
	
		int anneeDeRetraite=0;
		
		
		
		
		
		if(age < 60 && age > 0 ){
			 anneeDeRetraite = (60 - age  ) ;
			return String.format("Il vous reste %d ans pour arriver � la retraite",anneeDeRetraite);
			
			
		}	
		else if(age == 60 ) {
			return "vous �tes � la retraite cette ann�e";
			
		}
		else if (age > 60)
		{
			anneeDeRetraite = (age - 60);
			return String.format("Vous �tes � la retraite depuis %d ans",anneeDeRetraite);
				
		}
			else {
				
				return "vous n'�tes pas  encore n�e";
			}
			
			}

	

}//fin de classe 
