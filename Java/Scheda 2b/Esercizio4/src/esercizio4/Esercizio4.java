/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;

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
		
		System.out.println("La somma di tutti i valori è 2525");
		System.out.println("Il programma restituisce il valore " + Esercizio4.somma(n1));
		System.out.println();
		System.out.println("La somma dei valori nel sottoalbero avente radice n2 è 2200");
		System.out.println("Il programma restituisce il valore " + Esercizio4.somma(n2));
		System.out.println();
		System.out.println("La somma dei valori nel sottoalbero avente radice n3 è 295");
		System.out.println("Il programma restituisce il valore " + Esercizio4.somma(n3));
		System.out.println();
	}
        public static int somma(NodoBin radice){
        int totale = 0;
        if(radice.sin != null)
            totale += Esercizio4.somma(radice.sin);
        if(radice.des != null)
            totale += Esercizio4.somma(radice.des);
        return totale += radice.valore;
       
    }
}
