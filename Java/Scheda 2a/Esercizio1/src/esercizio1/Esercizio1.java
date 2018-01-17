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
class Portata{
    String descrizione;
    double prezzo;
    boolean bevanda;
    int quantita;
    
    public Portata(String descrizione, double prezzo, boolean bevanda){
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.bevanda = bevanda;
    }
    
    public boolean isBevanda(){return bevanda;}
    public double getPrezzo(){return prezzo;}
    public void setPrezzo(double d){this.prezzo = d;}
    public void setQuantita(int q){this.quantita = q;}
    public int getQuantita(){return this.quantita;}
}

class Ordinazione{
    String cliente;
    Portata portate[] = new Portata[100];
    int cont = 0;
    
    public Ordinazione(String cliente){
        this.cliente = cliente;
    }
    
    public void aggiungiPortata(Portata p, int q){
        portate[cont] = p;
        portate[cont].setQuantita(q);
        cont++;
    }
    
    public double conto(){
        double totale = 0;
            for(int i = 0; i < cont; i++){
                totale += portate[i].getPrezzo();
            }
            return totale;
    }
    
    public double contoBevande(){
        int prezzo = 0;
            for(int i = 0; i < cont; i++){
                if(portate[i].isBevanda())
                    prezzo += portate[i].getPrezzo();
            }
            return prezzo;
        }
    public int numeroTotalePortate(){
        int somma = 0;
        for (int i = 0; i < cont; i++){
            somma += portate[i].getQuantita();
        }
        return somma;
    }
    
    public String portateOrdinate(){
        String a = "";
        for(int i = 0; i < cont; i++){
            if(i != cont-1)
                a += portate[i].getQuantita() + ",";
            else
                a += portate[i].getQuantita();
        }
        return a;
    }
        
    }
    
public class Esercizio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Portata p1 = new Portata("antipasto",8.5,false);
		Portata p2 = new Portata("matriciana",12.5,false);
		Portata p3 = new Portata("bistecca",25,false);
		Portata p4 = new Portata("insalata",3,false);
		Portata p5 = new Portata("negramaro",15.5,true);
		Portata p6 = new Portata("acqua",2.5,true);
		Ordinazione o = new Ordinazione("luca");
		o.aggiungiPortata(p1, 3);
		o.aggiungiPortata(p2, 4);
		o.aggiungiPortata(p3, 3);
		o.aggiungiPortata(p4, 1);
		o.aggiungiPortata(p5, 3);
		o.aggiungiPortata(p6, 2);
		System.out.println("Conto:          " + o.conto());
		System.out.println("Conto bevande:  " + o.contoBevande());
		System.out.println("Portate:        " + o.portateOrdinate());
		System.out.println("Totale portate: " + o.numeroTotalePortate());
		p1.setPrezzo(10);
		p2.setPrezzo(10);
		p3.setPrezzo(10);
		p4.setPrezzo(10);
		p5.setPrezzo(10);
		p6.setPrezzo(10);
		System.out.println("Conto:          " + o.conto());
		System.out.println("Conto bevande:  " + o.contoBevande());
		System.out.println("Portate:        " + o.portateOrdinate());
		System.out.println("Totale portate: " + o.numeroTotalePortate());		
	}
    
}
