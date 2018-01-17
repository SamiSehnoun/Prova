/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

/**
 *
 * @author Gio
 */
public class Libro {
    String codice;
    String titolo;
    int quant;
    Libro prox;
   
    public Libro(String c, String t, int q, Libro p) {
        codice = c;
        titolo = t;
        quant = q;
        prox = p;
    }
    public String getCodice(){return this.codice;}
    public int getQuant(){return this.quant;}
    public void setQuant(int quant){this.quant=quant;}
}
