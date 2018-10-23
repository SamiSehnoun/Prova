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
public class Carrello {
    String cliente;
    final int N = 1001;
    Prodotto []prodotti = new Prodotto[N];
    
    public Carrello(String nome){
        this.cliente = nome;
    }
    
    public void aggiungiProdotto(Prodotto p, int q){
        for(int i=0; i<N; i++){
            if(prodotti[i]==null){
                prodotti[i]=p;
                prodotti[i].quantita = q;
                return;
            }
        }
    }
    
    public double totale(){
        double somma = 0;
        for(int i=0; i<N && prodotti[i]!=null; i++){
            somma+=(prodotti[i].getPrezzo()*prodotti[i].quantita);
        }
        return somma;
    }
    
    public double totalePromozione(){
        double somma = 0;
        for(int i=0; i<N && prodotti[i]!=null; i++){
            if(prodotti[i].isInPromozione())
                somma+=(prodotti[i].getPrezzo()*prodotti[i].quantita);
        }
        return somma;
    }
    
   
    public int numeroTotaleProdotti(){
        int somma = 0;
        for(int i=0; i<N && prodotti[i]!=null; i++){
            somma += prodotti[i].quantita;
        }
        return somma;
    }
    public String prodottiOrdinati(){
        String prod = "";
        for(int i=0; i<N && prodotti[i]!=null; i++){
            prod += prodotti[i].descrizione +"; "+prodotti[i].quantita+"\n";
        }
        return prod;
    }
}
