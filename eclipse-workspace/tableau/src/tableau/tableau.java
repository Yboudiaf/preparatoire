package tableau;

public class tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
        String [] monTableau;
        //instancier/initialiser/affecter une valeur le tableau
        a=3;
        monTableau= new String[7];
        monTableau[0]="riri";
        monTableau[1]="fifi";
        monTableau[2]="loulou";
        monTableau[3]="picsou";
        monTableau[4]="donald";
        monTableau[5]="daisy";
        monTableau[6]="mickey";
        System.out.println(monTableau[monTableau.length-1]);
        for (int i=0; i < monTableau.length ; i++) {
            monTableau[i]=monTableau[i]+"s";
            System.out.println(monTableau[i] + monTableau[i].length());
        }
        ////////////////////////////////////////////q
        float [] yac = new float[5];
        yac [0]=1;
        yac [1]=10;
        yac [2]=11;
        yac [3]=100;
        yac [4]=101;
        
        float sommeYac = 0;
        for (int i = 0; i < yac.length; i++) {
        	sommeYac+= yac[i];
        }
        System.out.println();
        System.out.println(sommeYac/yac.length);
        
        
        
        
	}

}
