/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.pkg1;

import java.util.Date;

/**
 *
 * @author Gio
 */
public class Esercizio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("spesa totale: "+listaSpesa());
    }
    public static double listaSpesa(){
        double totale = 0;
        int fine = -1;
        int i=0;
        double b = 0;
        String f = "";
        Date c = new Date();
        Prodotto prodotti[] = new Prodotto[100];
        System.out.println("inserire la spesa degli alimentari fino a quando non inserisci '-1'");
        while(fine == -1){
            System.out.println("inserire nome prodotto");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            String a = sc.next();
            if(a.equals("-1"))
                fine = 0; 
            else{
            System.out.println("inserire costo prodotto");
            sc = new java.util.Scanner(System.in);
            b = sc.nextDouble();
            
            System.out.println("inserire data scadenza");
            sc = new java.util.Scanner(System.in);
            c = new Date(sc.nextLong());
            
            Alimentari z = new Alimentari(a,b,c);
            z.applicaSconto();
            Prodotto prod = z;
            prodotti[i] = prod;
            i++;
                
            }
        }
        fine = -1;
        System.out.println("inserire la spesa degi non alimentari fino a quando non inserisci '-1'");
        while(fine == -1){
            System.out.println("inserire nome prodotto");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            String a = sc.next();
            if(a.equals("-1"))
                fine = 0;
            else{
            System.out.println("inserire costo prodotto");
            sc = new java.util.Scanner(System.in);
            b = sc.nextDouble();
            
            System.out.println("inserire materiale");
            sc = new java.util.Scanner(System.in);
            f = sc.next();
            
            NonAlimentari nonAlimento = new NonAlimentari(a,b, c);
            nonAlimento.applicaSconto();
            Prodotto prod = nonAlimento;
            prodotti[i] = prod;
            i++;
                
            }
    }
        for(int j=0; j<i; j++){
            totale += prodotti[j].prezzo;
        }
    return totale;
}
    
}
