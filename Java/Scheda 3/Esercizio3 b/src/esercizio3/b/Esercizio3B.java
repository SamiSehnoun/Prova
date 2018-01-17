/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3.b;

import java.util.Scanner;

/**
 *
 * @author EmaGio
 */
public class Esercizio3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("inserire stringa principale");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        System.out.println("inserire carattere");
        sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        
        System.out.println("la lettera compare: "+ cCompare(s,c,0)+ " volte");
    }
    public static int cCompare(String s, char c, int i){
        int cont=0;
        if(s.length()!=i+1){
            cont += cCompare(s,c,i+1);
        }
        if(s.charAt(i) == c)
            cont++;
        return cont;
        
    }
    
}
