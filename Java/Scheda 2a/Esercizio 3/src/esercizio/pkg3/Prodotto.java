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
public class Prodotto {
    String codice;
    String desc;
    int quant;
    Prodotto prox;
    public Prodotto(String c, String d, int q) {
        codice = c;
        desc = d;
        quant = q;
        prox = null;
    }
    
    public String getCodice(){return this.codice;}
    public int getQuant(){return this.quant;}
    public void setQuant(int quant){this.quant=quant;}

}

