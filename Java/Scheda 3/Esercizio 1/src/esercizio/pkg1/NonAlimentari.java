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
public class NonAlimentari extends Prodotto{
    private String materiale;
    
    public NonAlimentari(String codice, double prezzo, String materiale){
        super(codice,prezzo);
        this.materiale = materiale;
    }
    
    public void applicaSconto(){
        if (materiale.equals("carta") || materiale.equals("vetro") || materiale.equals("plastica"))
            this.prezzo = this.prezzo - (this.prezzo/100*10);
        
    }
    
    
    
}
