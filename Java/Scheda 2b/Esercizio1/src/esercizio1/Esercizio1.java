/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author Gio
 */
public class Esercizio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Prodotto p1 = new Prodotto("ram",22.5,false);
		Prodotto p2 = new Prodotto("hd",62.5,false);
		Prodotto p3 = new Prodotto("alimentatore",74,false);
		Prodotto p4 = new Prodotto("monitor",300,false);
		Prodotto p5 = new Prodotto("tastiera",25.5,true);
		Prodotto p6 = new Prodotto("mouse",12.5,true);
		Carrello o = new Carrello("sergio");
		o.aggiungiProdotto(p1, 3);
		o.aggiungiProdotto(p2, 4);
		o.aggiungiProdotto(p3, 3);
		o.aggiungiProdotto(p4, 1);
		o.aggiungiProdotto(p5, 3);
		o.aggiungiProdotto(p6, 2);
		System.out.println("Totale:             " + o.totale());
		System.out.println("Totale promozione:  " + o.totalePromozione());
		System.out.println("Prodotti:           " + o.prodottiOrdinati());
		System.out.println("Prodotti ordinati:  " + o.numeroTotaleProdotti());
		p1.setPrezzo(10);
		p2.setPrezzo(10);
		p3.setPrezzo(10);
		p4.setPrezzo(10);
		p5.setPrezzo(10);
		p6.setPrezzo(10);
		System.out.println("Totale:             " + o.totale());
		System.out.println("Totale promozione:  " + o.totalePromozione());
		System.out.println("Prodotti:           " + o.prodottiOrdinati());
		System.out.println("Prodotti ordinati:  " + o.numeroTotaleProdotti());		
	}	
}
