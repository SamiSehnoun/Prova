/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author Gio
 */

class Eserc2{
    public static int [][] maggiori(int[][] m1, int[][] m2){
        int [][] m3 = new int[m1.length][m1[0].length];
        for(int i=0; i<m1.length; i++){
            for(int j=0; j<m1[0].length; j++){
                if(m1[i][j] > m2[i][j])
                    m3[i][j]=1;
                else if(m1[i][j] == m2[i][j])
                    m3[i][j]=0;
                else if(m1[i][j] < m2[i][j])
                    m3[i][j]=-1;
                }
        }
        return m3;
    }
}
public class Esercizio2 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int [][] mat1 = {{8, 2, -1, 0}, {7, 8, 0, 12}, {0, 0, 8, 8}};
		int [][] mat2 = {{-1, 3, -10, 2}, {3, 4, 13, 1}, {-2, 0, -4, 2}};
	 	int [][] mat3 = Eserc2.maggiori(mat1, mat2);
        System.out.println("Risultato corretto: ");
        System.out.println("1 -1 1 -1");
        System.out.println("1 1 -1 1");
        System.out.println("1 0 1 1");
        System.out.println();
        
        // Il risultato calcolato deve essere uguale a quello corretto
        System.out.println ("Risultato trovato: ");
        for (int i=0; i<mat3.length; i++) {
        	for (int j=0; j<mat3[0].length; j++) {
	             System.out.print(mat3[i][j]+ " ");
	        }
	        System.out.println();
	    }
        System.out.println();
	}

}
