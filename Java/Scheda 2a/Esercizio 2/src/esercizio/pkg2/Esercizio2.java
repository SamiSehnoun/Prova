/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.pkg2;

/**
 *
 * @author Gio
 */

class Eserc2{
    public static int [][] somma(int[][] m1, int[][] m2){
        int [][] s = new int[3][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                s[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return s;
    }
}
public class Esercizio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] mat1 = {{8, 2, -1, 0}, {7, 8, 0, 12}, {0, 0, 8, 8}};
	int [][] mat2 = {{-1, 3, -10, 2}, {3, 4, 13, 1}, {-2, 0, -4, 2}};
 	int [][] mat3 = Eserc2.somma(mat1, mat2);
        System.out.println("Risultato corretto: ");
        System.out.println("7 5 -11 2");
        System.out.println("10 12 13 13");
        System.out.println("-2 0 4 10");
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
