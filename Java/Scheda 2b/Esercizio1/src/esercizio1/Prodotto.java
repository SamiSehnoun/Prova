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
public class Prodotto {
    String descrizione;
    double prezzo;
    boolean promozione;
    int quantita;
    
    public Prodotto(String descrizione, double prezzo, boolean promozione){
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.promozione = promozione;
    }
    
    public boolean isInPromozione(){return promozione;}
    public double getPrezzo(){return prezzo;}
    public void setPrezzo(double d){this.prezzo = d;}
    
    
}
