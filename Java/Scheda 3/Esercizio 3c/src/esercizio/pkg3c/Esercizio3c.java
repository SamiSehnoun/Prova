/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.pkg3c;

import java.util.Scanner;

/**
 *
 * @author EmaGio
 */
public class Esercizio3c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("inserire la grandezza dell'array");
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int []a = new int[g];
        for(int i=0; i<g; i++){
            sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        System.out.println("il valore minimo dell'array è: "+min(a,0,g, a[0]));
    }
    public static int min(int[]a, int i, int g, int min){
        
        if(i<g){
            if(a[i]<min)
                return min(a,i+1,g,a[i]);
            else
                return min(a,i+1,g,min);
        }
        return min;
    }
    
}
