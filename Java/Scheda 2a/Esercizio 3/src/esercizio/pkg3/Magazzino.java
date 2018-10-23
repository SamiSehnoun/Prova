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
public class Magazzino {
    Prodotto []prodotti;
    Prodotto inizio;
    int N_PRODOTTI = 101;
    
    public Magazzino(){
        prodotti = new Prodotto[N_PRODOTTI];
        inizio = prodotti[0];
    }
    
    public boolean esiste(String c){
        for(int i=0; i<N_PRODOTTI; i++){
            if(prodotti[i]!=null)
            if(c.equals(prodotti[i].getCodice()))
                return true;
        }
        return false;
    }
    
    public void aggiornaMagazzino (String c, String d, int q){
        int i;
        for(i=0; i<N_PRODOTTI; i++){
            if(prodotti[i] != null)
            if(c.equals(prodotti[i].getCodice())){
                prodotti[i].setQuant(prodotti[i].getQuant()+q);
                return;
            }
        }
        Prodotto p = new Prodotto(c,d,q);
        for( i=0; i<N_PRODOTTI; i++){
            if(prodotti[i] == null){
                prodotti[i] = p;
                prox();
                return;
            }
        }
        
        System.out.println("non è stato possibile allocare il prodotto");
    }
    
    public void prox(){
        for(int i=0;i<N_PRODOTTI;i++){
            if(prodotti[i]!= null){
                inizio=prodotti[i];
                i=N_PRODOTTI;
            }
        }
        
        for(int i = 0; i <N_PRODOTTI; i++){
            if(prodotti[i]!=null){
                for (int j=i+1;j<N_PRODOTTI;j++){
                    if(prodotti[j]!= null){
                        prodotti[i].prox = prodotti[j];
                        j=N_PRODOTTI;
                    }
                }
            }
                
        }
    }
    
    public int quantita(String c){
        for(int i=0; i<N_PRODOTTI; i++){
            if (prodotti[i]!=null)
            if (prodotti[i].getCodice().equals(c))
                return prodotti[i].getQuant();
        }
        return 0;
    }
    
    public void rimuoviProdotto(String c){
        for(int i=0; i<N_PRODOTTI; i++){
            if (prodotti[i].getCodice().equals(c) && prodotti[i] != null){
                prodotti[i] = null;
                if(i==0){
                    inizio=prodotti[1];
                }
                if(i>0)
                prodotti[i-1].prox=prodotti[i+1];
                return;
            }
        }
    }
    
}
