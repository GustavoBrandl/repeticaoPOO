package repeticaoPOO;

public class Atividade15 {

    public static void main(String[] args) {

        int iN = 38;
        int iM = 38;
        double dSoma = 0;

        System.out.print(" S = ");
        for (int i = 1; i <=37; i ++) {
        	
        	if (i < 37) {
        		System.out.print(iN - i + " * " + iM + " / " + i + " + ");
        	} else {
        		System.out.print(iN - i + " * " + iM + " / " + i);
        	}
        	
        	dSoma += ((double)(iN - i) * iM) / i;
        	iM --;
        }
        
        System.out.println("\nSoma: " + dSoma);
        
    }
}