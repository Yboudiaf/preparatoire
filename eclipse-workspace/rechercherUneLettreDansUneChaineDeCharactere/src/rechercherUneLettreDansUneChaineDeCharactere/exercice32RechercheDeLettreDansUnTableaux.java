package rechercherUneLettreDansUneChaineDeCharactere;

import java.util.Arrays;

public class exercice32RechercheDeLettreDansUnTableaux {
	public static void parcourir(String[] tab) {		
		for(int i = 0 ;i < tab.length;i++) {		
			System.out.println(tab[i]);

		}

	}

	public static int[] ordreCroissantArraysSort(int [] tableaux) {		
		for(int i = 0 ;i < tableaux.length;i++) {
			for(int j = i+1 ;j < tableaux.length ;j++) {
				if(tableaux[i]>tableaux[j]) {
					int temp = tableaux[j];
					tableaux[j]=tableaux[i];
					tableaux[i]=temp;

				}
			}
		}
		return tableaux;
	}

	public static int[] convertir(String[] string) {
		int[] retour = new int[string.length];
		for (int i = 0; i < string.length; i++) {
			retour[i] = Integer.valueOf(string[i]);
		}
		return retour;
	}
	public static int[] ordreDeCroissantArraysSort(int [] tableaux) {		
		for(int i = 0 ;i < tableaux.length;i++) {
			for(int j = i+1 ;j < tableaux.length ;j++) {
				if(tableaux[i]<tableaux[j]) {
					int temp = tableaux[j];
					tableaux[j]=tableaux[i];
					tableaux[i]=temp;

				}
			}
		}
		return tableaux;
	}
}







