/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.pkg4;

/**
 *
 * @author Gio
 */
public class Esercizio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                NodoBin n7 = new NodoBin(200,null, null);
        	NodoBin n6 = new NodoBin(80,n7,null);
		NodoBin n5 = new NodoBin(120,null,null);
		NodoBin n4 = new NodoBin(100,null,null);
		NodoBin n3 = new NodoBin(15,n6,null);
		NodoBin n2 = new NodoBin(2000,n4,n5);
		NodoBin n1 = new NodoBin(10,n2,n3);
		
		System.out.println("Vi sono 4 nodi con valore minore o uguale di 100");
		System.out.println("Il programma restituisce il valore " + Esercizio4.minore(n1, 100));
		System.out.println();
		System.out.println("Vi sono 0 nodi con valore minore o uguale di 1");
		System.out.println("Il programma restituisce il valore " + Esercizio4.minore(n1, 1));
		System.out.println();
		System.out.println("Vi sono 7 nodi con valore minore o uguale di 10000");
		System.out.println("Il programma restituisce il valore " + Esercizio4.minore(n1, 10000));
		System.out.println();
	}
    public static int minore(NodoBin radice, int x){
        int cont = 0;
        if(radice.sin != null)
            cont += Esercizio4.minore(radice.sin, x);
        if(radice.des != null)
            cont += Esercizio4.minore(radice.des, x);
        if(radice.valore<=x)
            cont++;
        return cont;
       
    }
}
    
    

