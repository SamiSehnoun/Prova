/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Gio
 */
public class Prodotto {
    private String codice;
    public double prezzo;
    
    public Prodotto(String codice, double prezzo){
        this.codice = codice;
        this.prezzo = prezzo;
    }
    
    public String getCodice(){ return this.codice;}
    public void setCodice(String codice){this.codice = codice;} 
}


