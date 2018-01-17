/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.pkg3;

/**
 *
 * @author Gio
 */
public class Esercizio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Magazzino myMag = new Magazzino();
		
		System.out.println("Aggiungo tre prodotti alla lista, tutti per la prima volta...");
		myMag.aggiornaMagazzino("ga1", "Fringles", 100);
		myMag.aggiornaMagazzino("det1", "Morbidissimo", 50);
		myMag.aggiornaMagazzino("ga2", "Cric crac", 120);
		System.out.println("... Devono comparire tutti nella lista");
		stampa(myMag);
		System.out.println("-------------------------");

		System.out.println("Aggiornamento per i prodotti aventi codici ga2 e det1");
		System.out.println("Entrambi sono presenti nella lista ... devo aggiornare soltanto le quantità");
		myMag.aggiornaMagazzino("ga2", "Cric crac", 20);
		myMag.aggiornaMagazzino("det1", "Morbidissimo", 15);
		System.out.println("... I prodotti devono comparire con info su quantità...");
		stampa(myMag);
		System.out.println("-------------------------");
		
		System.out.println("Quantità del prodotto con codice det1: " + myMag.quantita("det1"));
		System.out.println("-------------------------");
		System.out.println();
		System.out.println("Quantità del prodotto con codice ga2: " + myMag.quantita("ga2"));
		System.out.println("-------------------------");
		
		System.out.println("Esiste un prodotto con codice gx25? Deve restituire false. " + "Restituisce " + myMag.esiste("gx25"));
		System.out.println("-------------------------");

		System.out.println("Rimuovo le patatine Fringles dalla lista...");
		myMag.rimuoviProdotto("ga1");
		System.out.println("...Quindi non devono comparire nella stampa");
		stampa(myMag);
		System.out.println("-------------------------");
		
		System.out.println("Aggiungo i bottoncini di cioccolato Stupids con codice ga4...");
		myMag.aggiornaMagazzino("ga4", "Bottoncini di cioccolato Stupids", 50);
		stampa(myMag);
	}
	
	private static void stampa(Magazzino myMag) {
		Prodotto p = myMag.inizio;
		while (p != null) {
			System.out.println("Codice prodotto: " + p.codice + "; " + "Descrizione prodotto: " + p.desc + "; " + "Quantità: " + p.quant);
			System.out.println();
			p = p.prox;
		}
			
	}

}

