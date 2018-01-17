/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author EmaGio
 */
public class Esercizio2 {

    /**
     * @param args the command line arguments
     */
    static int premin;
    static int premax;
    public static void main(String[] args) {
        int rangeMin = 0;
        int rangeMax = 1000;
        int chiedi = 0;
        int n = 0;
        System.out.println("inserire numero tra 0 e "+ rangeMax);
        try{
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n<0)
                rangeMin = n;
            if(n>rangeMax)
                rangeMax = n;
        }catch(java.util.InputMismatchException inputErr){
            System.out.println("non puoi inserire lettere");
            return;
        }
        while((rangeMin-rangeMax)!=0){
            chiedi = getRandomNumberInRange(rangeMin, rangeMax);
            if(chiedi == n)
                rangeMin=rangeMax;
            else{
            System.out.println("il numero: "+ chiedi+", è minore o maggiore, inserire min e max");
            Scanner sc = new Scanner(System.in);
            String direzione = sc.next();
            if(direzione.equals("min")){
                rangeMin = chiedi;
            }
            else{
                rangeMax = chiedi;
            }
            System.out.println("rangemax: "+rangeMax+", rangeMin:"+ rangeMin + "il tuo numero è:"+ n);
            }
            
        }
        if(chiedi == n)
             System.out.println("il numero è: "+ chiedi);
        else
            System.out.println("non devi barare");
        
        
    }/*
    private static int getRandomNumberInRange(int min, int max) {

	if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
	}

	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
}*/
    private static int getRandomNumberInRange(int min, int max){
        if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
	}
        int a=((max-min)/2)+min;
        if(a == premin)
            a++;
        else if(a == premax)
            a--;
        
        premin = min;
        premax = max;
        return a;
        
    }
    
    
}
