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
public class Alimentari extends Prodotto{
    public Date data;
    
    public Alimentari(String codice, double prezzo, Date data){
        super(codice,prezzo);
        this.data = data;
    }
    
    public void applicaSconto(){
        if((data.getTime() - System.currentTimeMillis())<10)
            this.prezzo = this.prezzo - (this.prezzo/100*5);
    }
    
}
